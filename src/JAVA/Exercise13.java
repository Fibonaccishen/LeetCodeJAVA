package JAVA;

//leetcode1534统计好三元组
//非常简单

public class Exercise13 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int length = arr.length;
        int nums = 0;
        if (length < 3) return 0;
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a)
                    for (int k = j + 1; k < length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c)
                            nums++;
                    }
            }
        }
        return nums;
    }
}
