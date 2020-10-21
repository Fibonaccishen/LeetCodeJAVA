package JAVA;
//111. 二叉树的最小深度
//leetcode

//思路仍然和前两天一样。
//但是可以尝试一下写在一个函数里面，更简洁
//当然对于我自己而言现在写的思路更加清晰
public class Exercise25 {

    // Definition for a binary tree node.
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


    //思路：任何二叉树的最小深度就是min(左子树最小深度，右子树最小深度)+1
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        return getMin(root);
    }

    //getmin()函数返回以node为根节点的树的最小深度
    public int getMin(TreeNode node) {
        if (node == null) return 2147483647;
        if (node.left == null && node.right == null) return 1;
        int left = getMin(node.left);
        int right = getMin(node.right);
        return Math.min(left, right) + 1;
    }
}
