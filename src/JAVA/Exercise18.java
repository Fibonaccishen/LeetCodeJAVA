package JAVA;
//面试题 08.06. 汉诺塔问题
//leetcode
import org.omg.CORBA.MARSHAL;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

//经典的汉诺塔我都做不对，埋了吧
//说归说，还是得记住这种递归的思路
public class Exercise18 {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        move(A.size(), A, B, C);
    }

    public void move(int n, List<Integer> A, List<Integer> B, List<Integer> C) {
        if (n == 1) {
            C.add(A.remove(A.size() - 1));
            return;
        }
        move(n - 1, A, C, B);
        C.add(A.remove(A.size() - 1));
        move(n - 1, B, A, C);
    }
     public static void main(String[] args)
        hanota([2,0,1],[],[]);
     }

    //    最初的错误解法
//    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
//        if (A.size() == 1) {
//            C.add(A.remove(0));
//            return;
//        }
//        int max = A.remove(0);
//        hanota(A, C, B);
//        C.add(max);
//        hanota(B, A, C);
//    }
}
