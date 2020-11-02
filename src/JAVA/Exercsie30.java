package JAVA;
//179. 最大数
//leetcode 11.2

import java.util.Arrays;
import java.util.Comparator;


//思路：利用comparator接口定义适合的排序方式
//连接任意两个数字的时候都考虑：
//(a+b)>\<(b+a)
//最后利用sort实现直接排序
//leetcode nb！
public class Exercsie30 {
    private class LargerNumberComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            String x = a + b;
            String y = b + a;
            return y.compareTo(x);
        }
    }

    public String largestNumber(int[] nums) {
        String[] toString = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            toString[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(toString, new LargerNumberComparator());

        if (toString[0].equals("0")) return "0";

        String res = new String();
        for (String eachString : toString) {
            res += eachString;
        }
        return res;
    }
}
