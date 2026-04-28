package com.home.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidateBinarySearchTreeTest {

    private final ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
    Node<Integer> root;

    @BeforeEach
    void setUp() {
        // Create the tree before each test to ensure a clean state
        //       10
        //      /  \
        //     5   12
        //    /
        //   3
        this.root = new Node<>(10);
        this.root.left = new Node<>(5);
        this.root.right = new Node<>(12);
        this.root.left.left = new Node<>(3);
    }

    @Test
    void isValidBSTRecursive() {
        boolean actual = validateBinarySearchTree.isValidBSTRecursive(root);
        assertTrue(actual);
    }

    @Test
    void isValidBST() {
        boolean actual = validateBinarySearchTree.isValidBST(root);
        assertTrue(actual);
    }
}