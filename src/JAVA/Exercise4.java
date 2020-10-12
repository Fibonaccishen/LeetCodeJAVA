package JAVA;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

//9.28
class Exercise4 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public int kthToLast(ListNode head, int k) {
        ListNode a=head;
        ListNode b=head;
        for(int i=1;i<k;i++)
            b=b.next;
        while(b.next!=null){
            a=a.next;
            b=b.next;
        }
        return a.val;
    }

//own version
//    public int kthToLast(ListNode head, int k) {
//        int length=1;
//        ListNode cur=head;
//        while(cur.next!=null){
//            length++;
//            cur=cur.next;
//        }
//        int times=length-k;
//        ListNode tem=head;
//        for(int i=0;i<times;i++)
//            tem=tem.next;
//        return tem.val;
//    }
}
