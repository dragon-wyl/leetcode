/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] r = new int[n][n];
        int right = n;
        int x = 0, y = -1;
        int count = 1;
        int all = n * n;
        while (count <= all) {
            for(int i = 0; i < right; i++) r[x][++y] = count++;
            for(int i = 0; i < right - 1; i++) r[++x][y] = count++;
            for(int i = 0; i < right - 1; i++) r[x][--y] = count++;
            for(int i = 0; i < right - 2; i++)r[--x][y] = count++;
            right -= 2;
        }
        return r;
    }
}
// @lc code=end

