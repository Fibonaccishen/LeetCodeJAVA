package JAVA;

import java.util.Arrays;

//leetcode1021. 删除最外层的括号
//栈

//既然是栈的题目，就要用栈的思路来思考问题
//我自己的思路仍然是直观的在思考
//后面的大神思路很棒
public class Exercise14 {
    public static String removeOuterParentheses(String S) {
        char[] bracket = new char[S.length()];
        int frontBra = 0;//前括号个数
        int backBra = 0;//后括号个数
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                if(frontBra!=0) {
                    bracket[i] = S.charAt(i);
                }
                frontBra++;
            }
            if (S.charAt(i) == ')') {
                backBra++;
                if (frontBra == backBra) {
                    frontBra = 0;
                    backBra = 0;
                } else
                    bracket[i] = S.charAt(i);
            }
        }
        String str= new String(bracket);
        str = str.replaceAll("[\u0000]", "");
        return str;
    }

//leetcode上的大神做法
//    StringBuilder sb = new StringBuilder();
//    int level = 0;
//        for (char c : S.toCharArray()) {
//        if (c == ')') --level;
//        if (level >= 1) sb.append(c);
//        if (c == '(') ++level;
//    }
//        return sb.toString();


    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("((()())(()))").length());
    }
}
