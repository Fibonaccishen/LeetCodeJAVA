package JAVA;
//leetcode15. 三数之和
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Shen Fangzhi
 * @Description:
 * @Date: Created in 8:54 2020/11/25
 * @Modified By:
 **/

    //双指针的熟练运用很重要
    //别老想着你那三重循环了
public class Exercise36 {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                return result;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            //左右指针
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }


    //有三个例子超时，需要减少时间开销
//    public List<List<Integer>> threeSum(int[] nums) {
//        int min_length = 3;
//        int flag = 0;
//        if (nums.length < min_length) {
//            List result = new ArrayList();
//            return result;
//        }
//        Arrays.sort(nums);
//        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        for (int pos1 = 0; pos1 < nums.length - 2; pos1++) {
//            if (nums[pos1] > 0) {
//                return result;
//            }
//            for (int pos2 = pos1 + 1; pos2 < nums.length - 1; pos2++) {
//                if (nums[pos2] + nums[pos1] > 0) {
//                    break;
//                }
//                for (int pos3 = pos2 + 1; pos3 < nums.length; pos3++) {
//                    if (nums[pos1] + nums[pos2] + nums[pos3] == 0) {
//                        List<Integer> temp = new ArrayList<Integer>();
//                        temp.add(nums[pos1]);
//                        temp.add(nums[pos2]);
//                        temp.add(nums[pos3]);
//                        if (result.isEmpty()) {
//                            result.add(temp);
//                        } else {
//                            for (int i = 0; i < result.size(); i++) {
//                                if (temp.equals(result.get(i))) {
//                                    flag = 1;
//                                    break;
//                                }
//                            }
//                            if (flag == 1) {
//                                flag = 0;
//                                continue;
//                            }
//                            result.add(temp);
//                        }
//                    }
//                }
//            }
//        }
//        return result;
//    }
}
