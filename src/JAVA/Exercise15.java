package JAVA;

//剑指 Offer 09. 用两个栈实现队列
//leetcode
import java.util.LinkedList;

//这道题对栈和队列的理解很有帮助，这一次并没有实现，看的别人的代码
//但是着重是理解栈和队列的特性
public class Exercise15 {
    LinkedList<Integer> A, B;

    public Exercise15() {
        A = new LinkedList<Integer>();
        B = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        A.addLast(value);
    }

    public int deleteHead() {
        if (!B.isEmpty()) return B.removeLast();
        if(A.isEmpty())return -1;
        while (!A.isEmpty())
            B.addLast(A.removeLast());
        return B.removeLast();
    }
}
