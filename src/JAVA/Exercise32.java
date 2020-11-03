package JAVA;
//56. 合并区间
//leetcode

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//思路：首先就是将数组按照首元素的大小排序，这里又用到了Comparator这个神奇的东西
//一定要会！一定要会！一定要会！
//然会就比较每一个数组首元素和上一个区间的结尾大小即可
//对List Comparator的一些基本操作必须熟练
//List这个东西可以当作没有初始化大小的数组替代品，最后用一手toArray就可以完美转换成数组，很nb

public class Exercise32 {

    //又是这个Comparator，给我好好记住怎么用！！
    //感觉真的特别有用
    private class sortLeft implements Comparator<int[]> {
        @Override
        public int compare(int[] o1, int[] o2) {
            return o1[0] - o2[0];
        }
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new sortLeft());
        List<int[]> resArray = new ArrayList<int[]>();
        for (int i = 0; i < intervals.length; i++) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            if (i == 0) {
                resArray.add(intervals[0]);
                continue;
            }
            if (left > resArray.get(resArray.size() - 1)[1]) {
                resArray.add(intervals[i]);
            } else {
                resArray.get(resArray.size() - 1)[1] = Math.max(right, resArray.get(resArray.size() - 1)[1]);
            }
        }
        return resArray.toArray(new int[resArray.size()][]);
    }
}
