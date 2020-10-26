package JAVA;
//leetcode349两个数组的交集
import java.util.*;


//思路：先对两个数组排序，再用双指针进行操作
public class Exercise27 {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> inter = new LinkedList<Integer>();
        //先对两个数组进行排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        //两个指针分别指向两个数组
        int temp1 = 0;
        int temp2 = 0;
        int length1 = nums1.length;
        int length2 = nums2.length;
        //存储交集结果的数组
        //循环操作
        while (temp1 < length1 && temp2 < length2) {
            if (nums1[temp1] < nums2[temp2]) {
                temp1++;
            } else if (nums1[temp1] > nums2[temp2]) {
                temp2++;
            } else {
                if (inter.isEmpty() || inter.get(inter.size()-1) != nums1[temp1]) {
                    inter.add(nums1[temp1]);
                }
                temp1++;
                temp2++;
            }
        }
        int[] res=new int[inter.size()];
        int num=0;
        while(!inter.isEmpty()){
            res[num++]=inter.remove(inter.size()-1);
        }
        return res;
    }
}
