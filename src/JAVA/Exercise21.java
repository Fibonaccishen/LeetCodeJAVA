package JAVA;

//257. 二叉树的所有路径
//leetcode

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


//终于进入树了，一道最简单的树的遍历就让我一筹莫展
//在标答的帮助下完成了dfs和bfs的解法q

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Exercide21 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //DFS
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        if (root == null) return paths;
        constructPath(root, String.valueOf(root.val), paths);
        return paths;
    }

    public void constructPath(TreeNode root, String route, List<String> paths) {
        if (root.right == null && root.left == null) {
            paths.add(route);
        } else {
            if (root.left != null) {
                constructPath(root.left, route + "->" + root.left.val, paths);
            }
            if (root.right != null) {
                constructPath(root.right, route + "->" + root.right.val, paths);
            }
        }
    }
}

//    BFS
//
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> paths = new ArrayList<String>();
//        if (root == null) return paths;
//
//        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
//        Queue<String> pathQueue = new LinkedList<String>();
//
//        nodeQueue.offer(root);
//        pathQueue.offer(Integer.toString(root.val));
//
//        while (!nodeQueue.isEmpty()) {
//            TreeNode node = nodeQueue.poll();
//            String path = pathQueue.poll();
//
//            if (node.left == null && node.right == null) {
//                paths.add(path);
//            } else if (node.left != null) {
//                nodeQueue.offer(node.left);
//                pathQueue.offer(path + "->" + node.left.val);
//            }
//            if (node.right != null) {
//                nodeQueue.offer(node.right);
//                pathQueue.offer(path + "->" + node.right.val);
//            }
//        }
//        return paths;
//    }
//
//}
