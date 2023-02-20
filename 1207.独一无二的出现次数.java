/*
 * @lc app=leetcode.cn id=1207 lang=java
 *
 * [1207] 独一无二的出现次数
 */

// @lc code=start
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int nowNum = arr[0];
        boolean flag = true;
        Set set = new HashSet<Integer>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == nowNum) {
                count++;
            } else {
                if (set.contains(count)) return false;
                set.add(count);
                nowNum = arr[i];
                count = 1;
            }
        }
        if (set.contains(count)) {
            return false;
        }
        return true;
    }
}
// @lc code=end

