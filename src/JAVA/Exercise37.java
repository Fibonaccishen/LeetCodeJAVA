package JAVA;

/**
 * @Author Shen Fangzhi
 * @Description:
 * @Date: Created in 19:11 2020/11/26
 * @Modified By:
 **/
public class Exercise37 {
    public double myPow(double x, int n) {
        int times = Math.abs(n);
        double result = calculate(x, times);
        return (n >= 0) ? result : 1 / result;
    }

    public double calculate(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double y = calculate(x, n / 2);
        return n % 2 == 0 ? y * y : y * y * x;
    }

//    一坨shit 居然硬做
//    菜的扣脚
//    public double myPow(double x, int n) {
//        double result = 1;
//        if (x == 1) {
//            return 1;
//        }
//        if (n == 0){
//            return 1;
//        } else if (n > 0) {
//            for (int i = 0; i < n; i++) {
//                result *= x;
//            }
//        } else {
//            for (int i = 0; i > n; i--) {
//                result /= x;
//            }
//        }
//        return result;
//    }
}
