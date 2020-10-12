package JAVA;
//83. 删除排序链表中的重复元素
//leetcode83
public class Exercise10 {
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

        public ListNode middleNode(ListNode head) {
            ListNode a=head;
            while(a!=null){
                if(a.next==null)break;
                if(a.val==a.next.val){
                    a.next=a.next.next;
                }
                if(a.next==null)break;

                if(a.val!=a.next.val)
                a=a.next;
            }
            return head;
        }
    }
}

