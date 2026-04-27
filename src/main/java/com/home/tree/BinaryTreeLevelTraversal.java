package com.home.tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class BinaryTreeLevelTraversal {
    public void levelTraversal(Node root, List<Object> result) {
        if (root == null) return;

        Deque<Node> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            result.add(current.data);

            if (current.left != null) {
                queue.offer(current.left);
            }

            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }
}
