package JAVA;
//658. 找到k个最接近的数
//leetcode
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Shen Fangzhi
 * @Description:
 * @Date: Created in 13:53 2020/11/5
 * @Modified By:
 **/

    //思路还是比较清晰的，具体实现上还是很多问题
    //符合标准的数并不一定直接就要取出来，记录区间即可
public class Exercise34 {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int[] res = new int[k];
        int resPos = 0;
        int pos = 0;
        int left = 0;
        int right = 0;
        while (pos == arr.length || arr[pos] < x) {
            pos++;
        }
        left = pos - 1;
        right = pos;
        while (k > 0) {
            if (right == arr.length) {
                res[resPos] = arr[left];
                left--;
            } else if (left == -1) {
                res[resPos] = arr[right];
                right++;
            } else if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                res[resPos] = arr[left];
                left--;
            } else if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
                res[resPos] = arr[right];
                right++;
            }
            resPos++;
            k--;
        }
        Arrays.sort(res);
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < res.length; i++) {
            result.add(res[i]);
        }
        return result;
    }
}
