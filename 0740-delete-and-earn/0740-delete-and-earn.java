// class Solution {
//     public int deleteAndEarn(int[] nums) {
//         Arrays.sort(nums);
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i=0; i<nums.length; i++){
//             map.put(nums[i], map.getOrDefault(nums[i],0)+1);
//         }
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0; i<nums.length; i++){
//             set.add(nums[i]);
//         }
//         int arr[] = new int[set.size()];
//         int k=0;
//         for(Integer s : set ){
//             arr[k] = s;
//             k++;
//         }
//         int earn1 =0,earn2 = 0;
//         for(int i=0; i<arr.length; i++){
//             int currEarn = arr[i]*map.get(arr[i]);
//             if(i>0 && arr[i] == arr[i-1]+1){
//                 int temp = earn2;
//                 earn2 = Math.max(currEarn + earn1, earn2);
//                 earn1 = temp;
//             }
//             else{
//                 int temp = earn2;
//                 earn2 = currEarn + earn2;
//                 earn1 = temp;
//             }
//         }
//         return earn2;

//     }
// }
class Solution {
    public int deleteAndEarn(int[] nums) {
        // find max number
        int maxNum = 0;
        for(int n: nums) {
            maxNum = Math.max(n, maxNum);
        }

        // initialize 1-d memorization array
        int[] A = new int[maxNum+1];

        for(int n: nums) {
            A[n] += n;
        }
        // update dp array
        for(int i=2; i<A.length; i++) {
            A[i] = Math.max(A[i-2] + A[i], A[i-1]);
        }
        return A[A.length-1];
    }
}