package com.home.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeTraversalTest {

    private final BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
    private Node root;

    @BeforeEach
    void setUp() {
        // Create the tree before each test to ensure a clean state
        //       10
        //      /  \
        //     12   5
        //    / \  / \
        //   20 10 30 35
        this.root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(5);
        root.left.left = new Node(20);
        root.left.right = new Node(10);
        root.right.left = new Node(30);
        root.right.right = new Node(35);
    }

    @Test
    void preOrderTraversalRecursion() {
        List<Object> expected = Arrays.asList(10, 12, 20, 10, 5, 30, 35);
        List<Object> result = new ArrayList<>();
        binaryTreeTraversal.preOrderTraversalRecursion(root, result);
        assertEquals(expected, result);
    }

    @Test
    void preOrderTraversal() {
        List<Object> expected = Arrays.asList(10, 12, 20, 10, 5, 30, 35);
        List<Object> result = new ArrayList<>();
        binaryTreeTraversal.preOrderTraversal(root, result);
        assertEquals(expected, result);
    }

    @Test
    void postOrderTraversalRecursion() {
        List<Object> expected = Arrays.asList(20, 10, 12, 30, 35, 5, 10);
        List<Object> result = new ArrayList<>();
        binaryTreeTraversal.postOrderTraversalRecursion(root, result);
        assertEquals(expected, result);

    }

    @Test
    void postOrderTraversal() {
        List<Object> expected = Arrays.asList(20, 10, 12, 30, 35, 5, 10);
        List<Object> result = new ArrayList<>();
        binaryTreeTraversal.postOrderTraversal(root, result);
        assertEquals(expected, result);
    }

    @Test
    void inOrderTraversalRecursion() {
        List<Object> expected = Arrays.asList(20, 12, 10, 10, 30, 5, 35);
        List<Object> result = new ArrayList<>();
        binaryTreeTraversal.inOrderTraversalRecursion(root, result);
        assertEquals(expected, result);
    }

    @Test
    void inOrderTraversal() {
        List<Object> expected = Arrays.asList(20, 12, 10, 10, 30, 5, 35);
        List<Object> result = new ArrayList<>();
        binaryTreeTraversal.inOrderTraversal(root, result);
        assertEquals(expected, result);
    }

}