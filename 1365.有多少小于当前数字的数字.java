/*
 * @lc app=leetcode.cn id=1365 lang=java
 *
 * [1365] 有多少小于当前数字的数字
 */

// @lc code=start
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] r = new int[nums.length];
        int p, count;
        for (int i = 0; i < nums.length; i++) {
            p = 0;
            count = 0;
            while (p < nums.length) {
                if (nums[p] < nums[i]) count++;
                p++;
            }
            r[i] = count;
        }
        return r;
    }
}
// @lc code=end

