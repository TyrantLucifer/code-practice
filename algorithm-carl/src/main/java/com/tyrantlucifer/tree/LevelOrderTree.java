package com.tyrantlucifer.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 题目 <a href="https://leetcode.cn/problems/binary-tree-level-order-traversal/">leecode 102</a>
 */
public class LevelOrderTree {

    public static final List<List<Character>> RESULT = new ArrayList<>();

    public static final Queue<TreeUtils.TreeNode> QUEUE = new LinkedList<>();

    public static void levelOrderTree(TreeUtils.TreeNode root) {
        QUEUE.offer(root);
        while (!QUEUE.isEmpty()) {
            List<Character> characters = new ArrayList<>();
            int size = QUEUE.size();
            for (int i = 0; i < size; i++) {
                TreeUtils.TreeNode node = QUEUE.poll();
                characters.add(node.data);
                if (node.left != null) {
                    QUEUE.offer(node.left);
                }
                if (node.right!= null) {
                    QUEUE.offer(node.right);
                }
            }
            RESULT.add(characters);
        }
    }

    public static void main(String[] args) {
        TreeUtils.TreeNode root = TreeUtils.fromString("ABC##D##E##");
        levelOrderTree(root);
        System.out.println(RESULT);
    }
}
