package JAVA;

//重复的子字符串
//leetcode459
public class Exercise3 {
    public static boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for (int i = 1; i * 2 <= length; i++) {
            if (length % i == 0) {
                boolean match = true;
                for (int j = i; j < length; j++) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }
                }
                if (match == true) return true;
            }
        }
        return false;
    }

//    public static boolean repeatedSubstringPattern(String s) {
//        if (s.length() == 1)
//            return false;
//        int length = s.length();//4
//        int half = length / 2;//2
//        for (int i = 1; i <= half; i++) {
//            if (s.charAt(0) == s.charAt(i)) {
//                String str = s.substring(0, i);
//                int pos = i;
//                int flag = 0;
//                while (pos < length) {
//                    if (s.charAt(pos) == str.charAt(flag)) {
//                        flag++;
//                        pos++;
//                        if (flag == i && pos == length) return true;
//                        if (flag == i) flag = 0;
//                    } else if (s.charAt(pos) != str.charAt(flag)) break;
//                }
//            }
//        }
//        return false;
//    }

    //testCodeL本地测试
//    public static void main(String[] args) {
//        if (repeatedSubstringPattern("abab"))
//            System.out.println("true");
//        else System.out.println("false");
//    }
}
