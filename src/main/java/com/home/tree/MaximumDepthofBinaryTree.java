package com.home.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofBinaryTree {
    public int maxDepthRecursion(Node<Integer> root) {
        if (root == null) return 0;
        int leftHeight = maxDepthRecursion(root.left);
        int rightHeight = maxDepthRecursion(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int maxDepth(Node<Integer> root) {
        if (root == null) return 0;
        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node<Integer> current = queue.poll();
                assert current != null;
                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
            depth++;
        }
        return depth;
    }
}
