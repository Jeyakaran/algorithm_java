package com.home.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeHeightTest {
    private final BinaryTreeHeight binaryTreeHeight = new BinaryTreeHeight();
    private Node root;

    @BeforeEach
    void setUp() {
        // Create the tree before each test to ensure a clean state
        //       10
        //      /  \
        //     12   5
        //    /
        //   20
        this.root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(5);
        root.left.left = new Node(20);
    }

    @Test
    void heightRecursive() {
        int actual = binaryTreeHeight.heightRecursive(root);
        assertEquals(3, actual);
    }

    @Test
    void height() {
        int actual = binaryTreeHeight.height(root);
        assertEquals(3, actual);
    }
}