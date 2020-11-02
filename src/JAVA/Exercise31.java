package JAVA;
//75. 颜色分类leetcode




//此题难度较低，但是思路上可以进行拓展
//考虑使用指针来解决，比较方便
//主要是学习指针的思想
public class Exercise31 {
    public void sortColors(int[] nums) {
        int num0 = 0;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) num0++;
            if (nums[i] == 1) num1++;
            if (nums[i] == 2) num2++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < num0) {
                nums[i] = 0;
                continue;
            }
            if (i < num1 + num0) {
                nums[i] = 1;
                continue;
            }
            if (i < num0 + num1 + num2) {
                nums[i] = 2;
                continue;
            }
        }
    }
}
