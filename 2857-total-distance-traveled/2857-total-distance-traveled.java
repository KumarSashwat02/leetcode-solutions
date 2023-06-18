// class Solution {
//     public int distanceTraveled(int mainTank, int additionalTank) { 
//         if(mainTank<5){
//             return mainTank*10;
//         }
//         else if(mainTank == 5){
//             int dT = (mainTank*10) + (mainTank-5+1)*10;
//             return dT;
//         }
        
//         int d = 0;
//         int f = 5;
//         distanceTraveled(mainTank-f+1, additionalTank-1);
//         d = d+(f*10)+(mainTank-f+1)*10;
//         return d;
        
//     }
// }
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int sum = 0, x = 0, y = 0;
        while (mainTank >= 5) {
            x = mainTank / 5;
            y = mainTank % 5;
            if (additionalTank >= x)
                mainTank = y + x;
            else if (additionalTank >= 0)
                mainTank = y + additionalTank;
            else
                mainTank = y;
            additionalTank = additionalTank - x;
            sum = sum + x * 5 * 10;
        }
        return sum + mainTank * 10;
    }
}