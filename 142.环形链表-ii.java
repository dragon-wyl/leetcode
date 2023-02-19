/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode fast = head.next.next;
        ListNode slow = head;
        boolean flag = false;
        ListNode meetNode = null;
        ListNode dummyNode = new ListNode(-1, head);
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                meetNode = slow;
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        if (meetNode != null) {
            slow = dummyNode;
            while (fast != null) {
                if (fast.next == slow.next) {
                    return fast.next;
                }
                fast = fast.next;
                if (fast == meetNode) slow = slow.next;
            }
        }
        return null;
    }
}
// @lc code=end

