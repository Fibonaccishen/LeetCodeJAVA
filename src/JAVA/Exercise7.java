package JAVA;

public class Exercise7 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public class ListNode {
            int val;
            ListNode next;

            ListNode(int x) {
                val = x;
            }
        }

        public ListNode deleteNode(ListNode head, int val) {
            if (head.next == null) return null;
            if (head.val == val) {
                head = head.next;
                return head;
            }
            ListNode tem = head;
            while (tem.next.val != val) tem = tem.next;
            tem.next = tem.next.next;
            return head;
        }
    }
}
