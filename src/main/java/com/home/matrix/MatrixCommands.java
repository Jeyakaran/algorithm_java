package com.home.matrix;

public class MatrixCommands {
    public int[][] executeCommand(int[][] matrix, String[] commands) {
        for (String command : commands) {
            String[] parts = command.split(" ");
            switch (parts[0]) {
                case "swapRows":
                    swapRows(matrix, Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                    break;
                case "swapColumns":
                    swapColumns(matrix, Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                    break;
                case "reverseRow":
                    reverseRow(matrix, Integer.parseInt(parts[1]));
                    break;
                case "reverseColumn":
                    reverseColumn(matrix, Integer.parseInt(parts[1]));
                    break;
                case "rotate90":
                    matrix = rotate90(matrix);
                    break;
            }
        }
        return matrix;
    }

    private int[][] rotate90(int[][] matrix) {
        int[][] rotated = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rotated[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }

    private static void reverseColumn(int[][] matrix, int col) {
        int columnLength = matrix.length;
        for (int i = 0; i < columnLength / 2; i++) {
            int temp = matrix[i][col];
            matrix[i][col] = matrix[columnLength - 1 - i][col];
            matrix[columnLength - 1 - i][col] = temp;
        }
    }

    private static void reverseRow(int[][] matrix, int row) {
        int rowLength = matrix[row].length;
        for (int i = 0; i < rowLength / 2; i++) {
            int temp = matrix[row][i];
            matrix[row][i] = matrix[row][rowLength - 1 - i];
            matrix[row][rowLength - 1 - i] = temp;
        }
    }

    private static void swapColumns(int[][] matrix, int col1, int col2) {
        for (int[] row : matrix) {
            int tempValue = row[col1];
            row[col1] = row[col2];
            row[col2] = tempValue;
        }
    }

    private void swapRows(int[][] matrix, int row1, int row2) {
        int[] temp = matrix[row1];
        matrix[row1] = matrix[row2];
        matrix[row2] = temp;
    }
}
