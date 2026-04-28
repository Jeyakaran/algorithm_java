package com.home.tree;

import java.util.Stack;

public class ValidateBinarySearchTree {
    public boolean isValidBSTRecursive(Node<Integer> root) {
        return validateRecursive(root, null, null);
    }

    private boolean validateRecursive(Node<Integer> node, Integer low, Integer high) {
        if (node == null) return true;
        if ((low != null && node.data <= low) || (high != null && node.data >= high)) {
            return false;
        }
        return validateRecursive(node.left, low, node.data) && validateRecursive(node.right, node.data, high);
    }

    public boolean isValidBST(Node<Integer> root) {
        Stack<Node<Integer>> stack = new Stack<>();
        Integer prev = null;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (prev != null && root.data <= prev) return false;
            prev = root.data;
            root = root.right;
        }
        return true;
    }
}
