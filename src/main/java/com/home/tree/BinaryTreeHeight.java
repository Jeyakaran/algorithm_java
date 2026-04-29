package com.home.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class BinaryTreeHeight {
    public int heightRecursive(Node root) {
        if (root == null) return 0;
        int leftHeight = heightRecursive(root.left);
        int rightHeight = heightRecursive(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int height(Node root) {
        if (root == null) return 0;
        int height = 0;

        Deque<Node> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            height++;

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                assert current != null;
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
        return height;
    }
}
