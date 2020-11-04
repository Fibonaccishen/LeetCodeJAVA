package JAVA;
//274. H 指数leetcode
import java.util.Arrays;

/**
 * @Author Shen Fangzhi
 * @Description: leetcode274H指数
 * @Date: Created in 20:58 2020/11/4
 * @Modified By:
 **/

//本来想用Comparator秀一波
//结果因为原型和Object的问题解决不了，看来还是不能用Comparator进行反向排序
//那就直接倒着来呗

public class Exercise33 {

//    本来想用Comparator直接起飞，结果因为Integer和int的问题直接坠落
//    还是直接倒着来吧
//    private class reverse implements Comparator<Integer> {
//        @Override
//        public int compare(Integer a, Integer b) {
//            int i = a;
//            int j = b;
//            return b - a;
//        }
//    }

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int res = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] <= res) break;
            res++;
        }
        return res;
    }
}
