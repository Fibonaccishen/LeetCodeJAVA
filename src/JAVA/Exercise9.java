package JAVA;
//两个链表的第一个公共节点
//leetcode 剑指 Offer 52.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Exercise9 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) return null;
            ListNode a = headA;
            ListNode b = headB;
            while (a != b) {
                a = (a == null) ? headB : a.next;
                b = (b == null) ? headA : b.next;
            }
            return a;
        }
    }

    //    public class Solution {
//        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//            理解错误题意之后的复杂做法
//            ListNode a = headA;
//            ListNode b = headB;
//            while (a != null) {
//                while (b != null) {
//                    if (b.val == a.val) {
//                        //判断是否后面序列全都相等
//                        ListNode copyA = a;
//                        ListNode copyB = b;
//                        while (copyA != null && copyB != null) {
//                            if (copyA == null || copyB == null || copyA.val != copyB.val) {
//                                break;
//                            }
//                            if (copyA.val == copyB.val) {
//                                copyA = copyA.next;
//                                copyB = copyB.next;
//                            }
//                            if (copyA == null && copyB == null) return a;
//                        }
//                    }
//                    b = b.next;
//                }
//                a = a.next;
//            }
//            return null;
//        }
//    }
}
