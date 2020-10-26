package JAVA;
//leetcode976三角形的最大周长
import java.util.Arrays;


//注意思维的严谨和活跃
public class Exercise28 {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i > 1; i--) {
            if(A[i]<A[i-1]+A[i-2])
                return A[i]+A[i-1]+A[i-2];
        }
        return 0;
    }


    //原先做法：三个for显然会超时，一个for就够了
//    public int largestPerimeter(int[] A) {
//        int res = 0;
//        Arrays.sort(A);
//        int length = A.length;
//        for (int i = length - 1; i > 1; i--) {
//            for (int j = i - 1; j > 0; j--) {
//                for (int k = j - 1; k >= 0; k--) {
//                    if (A[k] + A[i] + A[j] > res)
//                        if (A[k] + A[j] > A[i] && A[k] + A[i] > A[j] && A[i] + A[j] > A[k]) {
//                            res = A[k] + A[i] + A[j];
//                            return res;
//                        }
//                }
//            }
//        }
//        return res;
//    }
}
