package JAVA;

//leetcode155. 最小栈

import java.util.LinkedList;
//import java.util.Stack;

//这道题对栈的考察要求很高，解了半天还是个错误的解法
//大神解法很精彩，辅助栈的使用很巧妙
public class Exercise16 {
    LinkedList<Integer> stack, tem1, tem2;

    /**
     * initialize your data structure here.
     */
    public Exercise16() {
        stack = new LinkedList<Integer>();
        tem1 = new LinkedList<Integer>();
        tem2 = new LinkedList<Integer>();
    }

    public void push(int x) {
        stack.addLast(x);
        while ((!tem1.isEmpty()) && x > tem1.getLast()) {
            tem2.addLast(tem1.removeLast());
        }
        tem1.addLast(x);
        while (!tem2.isEmpty()) {
            tem1.addLast(tem2.removeLast());
        }
    }

    public void pop() {
        if (stack.removeLast() == tem1.getLast())
            tem1.removeLast();
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        return tem1.getLast();
    }
}

//class MinStack {
//
//    // 数据栈
//    private Stack<Integer> data;
//    // 辅助栈
//    private Stack<Integer> helper;
//
//    /**
//     * initialize your data structure here.
//     */
//    public MinStack() {
//        data = new Stack<>();
//        helper = new Stack<>();
//    }
//
//    // 思路 1：数据栈和辅助栈在任何时候都同步
//
//    public void push(int x) {
//        // 数据栈和辅助栈一定会增加元素
//        data.add(x);
//        if (helper.isEmpty() || helper.peek() >= x) {
//            helper.add(x);
//        } else {
//            helper.add(helper.peek());
//        }
//    }
//
//    public void pop() {
//        // 两个栈都得 pop
//        if (!data.isEmpty()) {
//            helper.pop();
//            data.pop();
//        }
//    }
//
//    public int top() {
//        return data.peek();
//    }
//
//    public int getMin() {
//        return helper.peek();
//    }
//}
