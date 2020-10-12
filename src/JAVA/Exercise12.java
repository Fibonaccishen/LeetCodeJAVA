package JAVA;

import java.util.LinkedList;
import java.util.Queue;

//面试题 17.09. 第 k 个数
//leetcode10.12

//但是这道题根本不需要队列来做，为什么要分在队列这一类里。。。
//add() offer()插入
//remove() poll()移除
//element() peek()返回首元素

public class Exercise12 {
    public int getKthMagicNumber(int k) {
        int flag1 = 0;
        int flag2 = 0;
        int flag3 = 0;

        int[] nums = new int[k];
        nums[0] = 1;
        for (int i = 1; i < k; i++) {
            nums[i] = Math.min(nums[flag1] * 3, Math.min(nums[flag2] * 5, nums[flag3] * 7));

            if (nums[i] == nums[flag1] * 3) flag1++;
            if (nums[i] == nums[flag2] * 5) flag2++;
            if (nums[i] == nums[flag3] * 7) flag3++;
        }
        return nums[k - 1];
//        Queue<Integer> q;
//        q = new LinkedList();
//        int t = 1;
//        int magicNum = 1;
//        q.offer(magicNum);
//        while (t < k) {
//            q.offer(magicNum * 3);
//            t++;
//            if (t == k) ireturn magicNum * 3;
//            q.offer(magicNum * 5);
//            t++;
//            if (t == k) return magicNum * 5;
//            q.offer(magicNum * 7);
//            t++;
//            if (t == k) return magicNum * 7;
//            q.poll();
//            magicNum = q.peek();
//        }
//        return magicNum;
    }
}
//1 3 5 7 9 15 21 25 27 35
