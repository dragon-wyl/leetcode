/*
 * @lc app=leetcode.cn id=941 lang=java
 *
 * [941] 有效的山脉数组
 */

// @lc code=start
class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        int i = 0;
        int top = -1;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
                top = i;
                break;
            }
            i++;
        }
        if (top == -1 || top == 0) return false;
        i = 0;
        for (int j = 1; j <= top; j++) {
            if(arr[i] >= arr[j]) return false;
            i++;
        }
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] <= arr[j]) return false;
            i++;
        }
        return true;
    }
}
// @lc code=end

