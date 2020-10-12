package JAVA;
import java.util.LinkedList;
import java.util.Queue;
//最近的请求次数
//leetcode933


//这个题作用是熟悉add() poll()等队列的相关操作函数
//add() offer()插入
//remove() poll()移除
//element() peek()返回首元素

//另一个问题是在给queue定义数据类型时使用int型会报错，需要使用其包装类Integer
//查阅后得知java中为八大基本类型都搞了一个包装类，把其包装为Object对象，queue应该只接受对象

public class Exercise11 {
    class RecentCounter {
        Queue<Integer> q;
        public RecentCounter() {
            q=new LinkedList();
        }

        public int ping(int t) {
            q.add(t);
            while(q.peek()<(t - 3000)){
                q.poll();
            }
            return q.size();
        }
    }

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
}
