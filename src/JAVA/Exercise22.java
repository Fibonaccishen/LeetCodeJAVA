package JAVA;

//563. 二叉树的坡度
//leetcode


//这道题原先的解法没有问题，我将计算坡度和节点和分成了两个步骤进行计算
//但是实际上可以合并为一步进行计算，大大节省时间（标答启发）
public class Exercise22 {
    int sum = 0;

    //经过标答启发后得到的解法
    //思路应该是遍历每一个节点，同时计算其左子树和右子树的节点之和
    //  Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int findTilt(TreeNode root) {
        count(root);
        return sum;
    }

    //计算某一个节点及子树的和
    public int count(TreeNode node) {
        if (node == null) return 0;
        int left = count(node.left);
        int right = count(node.right);
        sum += Math.abs(left - right);
        return left + right + node.val;
    }

//原先自己的解法
//    public int findTilt(TreeNode root) {
//        if (root == null) return 0;
//        if (root.left == null && root.right == null)
//            return 0;
//        calculate(root);
//        return sum;
//    }
//
//    //计算某一个节点的坡度
//    public void calculate(TreeNode node) {
//        if (node == null) return;
//        int temp = Math.abs(count(node.right) - count(node.left));
//        sum += temp;
////        System.out.println("sum+=" + temp);
//        calculate(node.left);
//        calculate(node.right);
//    }
//
//    //计算某一个节点及子树的和
//    public int count(TreeNode node) {
//        if (node == null) return 0;
//        int total = node.val;
//        if (node.left != null)
//            total += count(node.left);
//        if (node.right != null)
//            total += count(node.right);
//        return total;
//    }
}
