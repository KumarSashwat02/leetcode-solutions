class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int highest = 0;
        for(int i = 0; i<gain.length ; i++){
            int y = gain[i] + alt;
            alt = y;
            highest = Math.max(highest,alt);
        }
        return highest;
    }
}