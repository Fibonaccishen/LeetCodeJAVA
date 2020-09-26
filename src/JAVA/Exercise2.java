package JAVA;

//所有奇数长度子数组的和
//leetcode1588

//子数组指连续的数字，不是数字随机！！被坑了半天
//version2
public class Exercise2 {
    public int sumOddLengthSubarrays(int[] arr) {
        int length = arr.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int leftOu = i / 2 + 1;
            int leftJi = (i + 1) / 2;
            int rightOu = (length - i + 1) / 2;
            int rightJi = (length - i) / 2;
            sum += (leftJi * rightJi + leftOu * rightOu) * arr[i];
        }
        return sum;
    }
}


//version1
//public class Exercise2 {
//    public int sumOddLengthSubarrays(int[] arr) {
//        int length = arr.length;
//        int sum = 0;
//        for (int i = 0; i < length; i++) {
//            for (int j = 1; j + i - 1 < length; j += 2) {
//                for (int k = i; k < j + i; k++)
//                    sum += arr[k];
//            }
//        }
//        return sum;
//    }
//}
