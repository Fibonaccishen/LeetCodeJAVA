package JAVA;
//543. 二叉树的直径
//leetcode java



//求二叉树的直径
//原来根本不用费劲心思去想很多花里胡哨的
//就理清关系，找出关系式并且实现就行了

public class Exercise24 {
    //      Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    //思路：某节点下的二叉树直径=max(左子树直径，右子树直径，左子树高度+右子树高度)
    public int diameterOfBinaryTree(TreeNode root) {
        return calculate(root);
    }

    //getHeight()函数返回树的高度
    public int getHeight(TreeNode node) {
        if (node == null) return 0;
        int max = Math.max(getHeight(node.left), getHeight(node.right));
        return max + 1;
    }

    //calculate函数返回树的直径
    public int calculate(TreeNode node) {
        if (node== null) return 0;
        if (node.left == null && node.right == null) return 0;
        int max=Math.max(Math.max(getHeight(node.right)+getHeight(node.left),calculate(node.left)),calculate(node.right));
        return max;
    }
}
