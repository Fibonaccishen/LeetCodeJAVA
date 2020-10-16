package JAVA;

//剑指 Offer 10- II. 青蛙跳台阶问题
//leetcode


//我的解法是从顶向下计算，因此若不加数组存储时间会很长
//大神解法自底向上计算，因此无需额外空间存储，更优越
public class Exercise20 {
    int[] steps;
    int[] flags;

    public int numWays(int n) {

        steps = new int[n + 1];
        flags = new int[n + 1];
        return count(n);
    }

    int count(int n) {
        if (n == 1 || n == 0) {
            steps[n] = 1;
            return 1;
        }
        flags[n] = 1;
        if (flags[n - 1] == 0) count(n - 1);
        if (flags[n - 2] == 0) count(n - 2);
        steps[n] = (steps[n - 1] + steps[n - 2])% 1000000007;
        return steps[n];
    }
}

//nums(n)=nums(n-1)+nums(n-2)

