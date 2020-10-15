package JAVA;
//面试题 16.11. 跳水板
//leetcode
import org.jboss.classfilewriter.constpool.ClassEntry;

import java.util.LinkedList;



//再也不相信分类了，在递归分类里面，用递归就是sb
public class Exercise19 {
    public int[] divingBoard(int shorter, int longer, int k) {
        if(k==0)
            return new int[]{};
        if(shorter==longer)
            return new int[]{shorter*k};
        int[] length=new int[k+1];
        for(int i=0;i<=k;i++)
            length[i]=longer*i+shorter*(k-i);
        return length;
    }


    //信了邪用它的递归
//    LinkedList<Integer> length = new LinkedList();
//
//    int[] nums;
//
//    public int[] divingBoard(int shorter, int longer, int k) {
//        if (k == 0) {
//            nums = new int[0];
//            return nums;
//        }
//        if (shorter == longer) {
//            nums = new int[1];
//            nums[0] = shorter * k;
//            return nums;
//        }
//        nums = new int[k + 1];
//        decide(shorter, longer, k, 0);
//        return trans(length, nums);
//    }
//
//    public void decide(int shorter, int longer, int k, int cur_length) {
//        if (k == 1) {
//            length.addLast(cur_length + shorter);
//            length.addLast(cur_length + longer);
//            return;
//        }
//        decide(shorter, longer, k - 1, cur_length + shorter);
//        decide(shorter, longer, k - 1, cur_length + longer);
//    }
//
//    public int[] trans(LinkedList<Integer> length, int[] nums) {
//        int i = 0;
//        while (!length.isEmpty()) {
//            for (int j = 0; j < i; j++)
//                if (nums[j] == length.getFirst()) {
//                    length.removeFirst();
//                    continue;
//                }
//            nums[i] = length.removeFirst();
//            i++;
//        }
//        return nums;
//    }
}
