package JAVA;
//leetcode 2. 两数相加
import java.util.List;

/**
 * @Author Shen Fangzhi
 * @Description:
 * @Date: Created in 19:32 2020/12/3
 * @Modified By:
 **/


public class Exercise38 {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode first = result;

        ListNode list1 = l1;
        ListNode list2 = l2;

        int advance = 0;

        while (list1 != null && list2 != null) {

            int list1Num = list1.val;
            int list2Num = list2.val;
            int temp = list1Num + list2Num + advance;

            int curVal = temp % 10;

            result.val = curVal ;

            if (list1.next != null || list2.next != null) {
                result.next = new ListNode();
                result = result.next;
            }

            advance = temp / 10;

            list1 = list1.next;
            list2 = list2.next;
        }

        while (list1 == null && list2 != null) {

            int temp = list2.val + advance;
            int curVal = temp % 10;

            result.val = curVal;

            if (list2.next != null) {
                result.next = new ListNode();
                result = result.next;
            }

            advance = temp / 10;

            list2 = list2.next;
        }

        while (list1 != null && list2 == null) {

            int temp = list1.val + advance;
            int curVal = temp % 10;

            result.val = curVal;

            if (list1.next != null) {
                result.next = new ListNode();
                result = result.next;
            }

            advance = temp / 10;

            list1 = list1.next;
        }

        if(advance == 1){
            result.next = new ListNode(1);
        }

        return first;
    }
}
