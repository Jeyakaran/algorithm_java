package com.home.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthofBinaryTreeTest {

    private final MaximumDepthofBinaryTree maximumDepthofBinaryTree = new MaximumDepthofBinaryTree();
    private Node<Integer> root;

    @BeforeEach
    void setUp() {
        // Create the tree before each test to ensure a clean state
        //       10
        //      /  \
        //     12   5
        //    /
        //   20
        this.root = new Node<>(10);
        root.left = new Node<>(12);
        root.right = new Node<>(5);
        root.left.left = new Node<>(20);
    }


    @Test
    void maxDepthRecursion_recursive() {
        int actual = maximumDepthofBinaryTree.maxDepthRecursion(root);
        assertEquals(3, actual);
    }

    @Test
    void maxDepthRecursion() {
        int actual = maximumDepthofBinaryTree.maxDepth(root);
        assertEquals(3, actual);
    }
}