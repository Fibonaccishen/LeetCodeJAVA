package JAVA;

//从尾到头打印链表
//leetcode 剑指 Offer 06.
public class Exercise8 {
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

        public int[] reversePrint(ListNode head) {
            int[] arr = new int[10000];
            int length = 0;
            ListNode tem = head;
            while (tem != null) {
                arr[length] = tem.val;
                length++;
                tem = tem.next;
            }
            int[] res = new int[length];
            for (int i = 0; i < length; i++) {
                res[i] = arr[length - i - 1];
            }
            return res;
        }
    }
}
