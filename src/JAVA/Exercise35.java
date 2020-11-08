package JAVA;
//leetcode
//100. 相同的树

/**
 * @Author Shen Fangzhi
 * @Description:
 * @Date: Created in 20:59 2020/11/8
 * @Modified By:
 **/

//简单思路 但是还是要学会在一个方法里面迭代
//现在总是习惯再另建一个方法去递归
public class Exercise35 {
    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return determine(p, q);
    }

    public boolean determine(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null && q != null) return false;
        if (p != null && q == null) return false;
        if (p.val != q.val) return false;

        return determine(p.left, q.left) && determine(p.right, q.right);
    }
}
