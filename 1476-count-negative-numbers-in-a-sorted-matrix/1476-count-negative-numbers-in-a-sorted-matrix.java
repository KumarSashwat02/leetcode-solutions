class Solution {
  public int countNegatives(int[][] grid) {
    int m = grid.length, n = grid[0].length;
    int cnt = 0, j = n-1;

    for (var i=0; i<m; i++) {
      while (j >= 0 && grid[i][j] < 0) j--;

      if (j<0) return cnt + (m-i) * n;

      cnt += n-1-j;
    }
    return cnt;
  }
}