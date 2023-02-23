package com.tyrantlucifer.tree;

public class TreeUtils {

    private static int INDEX = 0;

    private TreeUtils() {}

    public static class TreeNode {
        Character data;
        TreeNode left;
        TreeNode right;

        public TreeNode(Character data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static TreeNode fromString(String content) {
        char c = content.charAt(INDEX);
        INDEX++;
        if (c == '#') {
            return null;
        }
        TreeNode root = new TreeNode(c);
        TreeNode left = fromString(content);
        TreeNode right = fromString(content);
        root.left = left;
        root.right = right;
        return root;
    }

    public static void preOrderTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrderTree(root.left);
        preOrderTree(root.right);
    }

    public static void inOrderTree(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTree(root.left);
        System.out.print(root.data + " ");
        inOrderTree(root.right);
    }

    public static void postOrderTree(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrderTree(root.left);
        postOrderTree(root.right);
        System.out.print(root.data + " ");
    }
}
