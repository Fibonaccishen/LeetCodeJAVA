package JAVA;
//面试题 04.04. 检查平衡性
//leetcode

//这道题借鉴了exercise22的思路
public class Exercise23 {
    int balanced = 1;

    //      Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isBalanced(TreeNode root) {
        height(root);
        return balanced == 1;
    }

    //judgebalance会计算相应节点的平衡度
    public int height(TreeNode node) {
        if (node == null) return 0;
        int left = height(node.left);
        int right = height(node.right);
        if (Math.abs(left - right) > 1) balanced = 0;
        return Math.max(left, right) + 1;
    }

}
