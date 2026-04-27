package com.home.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeLevelTraversalTest {

    private final BinaryTreeLevelTraversal binaryTreeLevelTraversal = new BinaryTreeLevelTraversal();
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
    void levelTraversal() {
        List<Object> expected = Arrays.asList(10, 12, 5, 20, 10, 30, 35);
        List<Object> result = new ArrayList<>();
        binaryTreeLevelTraversal.levelTraversal(root, result);
        assertEquals(expected, result);
    }
}