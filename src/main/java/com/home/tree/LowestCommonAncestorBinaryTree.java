package com.home.tree;

import java.util.Objects;

public class LowestCommonAncestorBinaryTree {
    public Node<Integer> lowestCommonAncestor(Node<Integer> root, Integer p, Integer q) {
        // p and q are used here to identify when we have found one of the target nodes
        if (root == null || Objects.equals(root.data, p) || Objects.equals(root.data, q)) {
            return root;
        }

        Node<Integer> left = lowestCommonAncestor(root.left, p, q);
        Node<Integer> right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) return root;

        return left != null ? left : right;
    }
}
