package com.home.tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class BinaryTreeTraversal {

    // PreOrder
    public void preOrderTraversalRecursion(Node node, List<Object> result) {
        if (node == null) return;
        result.add(node.data);
        preOrderTraversalRecursion(node.left, result);
        preOrderTraversalRecursion(node.right, result);
    }

    public void preOrderTraversal(Node root, List<Object> result) {
        if (root == null) return;

        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            result.add(current.data);

            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }

    // InOrder
    public void inOrderTraversalRecursion(Node root, List<Object> result) {
        if (root == null) return;
        inOrderTraversalRecursion(root.left, result);
        result.add(root.data);
        inOrderTraversalRecursion(root.right, result);
    }

    public void inOrderTraversal(Node root, List<Object> result) {
        if (root == null) return;

        Deque<Node> stack = new ArrayDeque<>();
        Node current = root;

        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            result.add(current.data);
            current = current.right;
        }
    }

    // PostOrder
    public void postOrderTraversalRecursion(Node root, List<Object> result) {
        if (root == null) return;
        postOrderTraversalRecursion(root.left, result);
        postOrderTraversalRecursion(root.right, result);
        result.add(root.data);
    }

    public void postOrderTraversal(Node root, List<Object> result) {
        if (root == null) return;
        Deque<Node> stack = new ArrayDeque<>();
        Node current = root;
        Node lastVisited = null;

        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                Node peekNode = stack.peek();
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    current = peekNode.right;
                } else {
                    result.add(peekNode.data);
                    lastVisited = stack.pop();
                }
            }
        }
    }
}
