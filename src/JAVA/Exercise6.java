package JAVA;
//剑指 Offer 24. 反转链表
//leetcode

//这道题的教训在于当遍历链表时，循环停止的条件设置为当前节点
//的next指针为null时i，很容易忽略最后一个节点使其未进行循环

public class Exercise6 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode res = head;
        if (head == null) return head;
        int length = 1;
        while (res.next != null) {
            res = res.next;
            length++;
        }
        res = head;
        int[] arr = new int[length];
        int n = 0;
        while (res.next != null) {
            arr[n] = res.val;
            res = res.next;
            n++;
        }
        arr[n] = res.val;
        res = head;
        int k = length - 1;
        while (res.next != null) {
            res.val = arr[k];
            k--;
            res = res.next;
        }
        return head;
    }


}
