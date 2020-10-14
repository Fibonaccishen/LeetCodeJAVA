package JAVA;

//10.14
//剑指 Offer 30. 包含min函数的栈
//leetcode

import java.util.LinkedList;


//此题和exercise16一模一样，主要是为了巩固昨天对栈的知识，再写一遍

public class Exercise17 {
    LinkedList<Integer> stack;//主栈
    LinkedList<Integer> helper;//辅助栈

    /**
     * initialize your data structure here.
     */
    public Exercise17() {
        stack = new LinkedList<Integer>();
        helper = new LinkedList<Integer>();
    }

    public void push(int x) {
        stack.addLast(x);
        if (helper.isEmpty() || x < helper.getLast())
            helper.addLast(x);
        else helper.addLast(helper.getLast());
    }

    public void pop() {
        stack.removeLast();
        helper.removeLast();
    }

    public int top() {
        return stack.getLast();
    }

    public int min() {
        return helper.getLast();
    }
}
