class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }

        if (numRows == 1) {
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            result.add(firstRow);
            return result;
        }

        result = generate(numRows - 1);
        List<Integer> prevRow = result.get(numRows - 2);
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);

        for (int i = 1; i < numRows - 1; i++) {
            currentRow.add(prevRow.get(i - 1) + prevRow.get(i));
        }

        currentRow.add(1);
        result.add(currentRow);

        return result;
    }
}


// List<Integer> l1 = new ArrayList<>();
//         l1.add(1);
//         l1.add(1);
//         ans.add(l);
//         ans.add(l1);
//         for(int i=2; i<numRows; i++){
            
//         }


// List<List<Integer>> ans1 = new ArrayList<>();
//         int i = 0;
//         while(i<numRows){
//             int ans = 1;
//             List<Integer> l1 = new ArrayList<>();
//             for(int j=1; j<i+2;j++){
//                 ans = ans * ((i+2)-j);
//                 ans = ans/j;
//                 l1.add(ans);
//             }
//             ans1.add(l1);
//         }
//         return ans1;