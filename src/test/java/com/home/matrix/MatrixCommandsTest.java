package com.home.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixCommandsTest {
    private final MatrixCommands matrixCommands = new MatrixCommands();

    @Test
    void swapRows() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        matrixCommands.executeCommand(matrix, new String[]{"swapRows 0 2"});
        int[][] expected = {{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        assertArrayEquals(expected, matrix);
    }

    @Test
    void swapColumns() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        matrixCommands.executeCommand(matrix, new String[]{"swapColumns 1 2"});
        int[][] expected = {{1, 3, 2}, {4, 6, 5}, {7, 9, 8}};
        assertArrayEquals(expected, matrix);
    }

    @Test
    void reverseRow() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        matrixCommands.executeCommand(matrix, new String[]{"reverseRow 0"});
        int[][] expected = {{3, 2, 1}, {4, 5, 6}, {7, 8, 9}};
        assertArrayEquals(expected, matrix);
    }

    @Test
    void reverseColumn() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        matrixCommands.executeCommand(matrix, new String[]{"reverseColumn 1"});
        int[][] expected = {{1, 8, 3}, {4, 5, 6}, {7, 2, 9}};
        assertArrayEquals(expected, matrix);
    }

    @Test
    void rotate90() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        matrix = matrixCommands.executeCommand(matrix, new String[]{"rotate90"});
        int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertArrayEquals(expected, matrix);
    }

    @Test
    void matrixTest() {
        int[][] matrix = {{1, 2}, {4, 5}, {7, 8}};
        assertEquals(3, matrix.length);
        assertEquals(2, matrix[0].length);
    }

}