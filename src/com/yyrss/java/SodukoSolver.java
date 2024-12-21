package com.yyrss.java;

import java.util.Random;

class SudokuSolver {
    private static final int SIZE = 9;
    private static final int SUBGRID_SIZE = 3;
    private int[][] board = new int[SIZE][SIZE];
    private Random random = new Random();

    public static void main(String[] args) {
        SudokuSolver solver = new SudokuSolver();
        solver.generateSudokuBoard();
        solver.printBoard();
    }

    // Generate a filled Sudoku board using backtracking
    public void generateSudokuBoard() {
        fillDiagonalBlocks();
        fillRemainingCells();
    }

    // Fill the two main diagonal 3x3 blocks with valid numbers
    private void fillDiagonalBlocks() {
        for (int i = 0; i < SUBGRID_SIZE; i++) {
            for (int j = 0; j < SUBGRID_SIZE; j++) {
                fillSubGrid(i * SUBGRID_SIZE, j * SUBGRID_SIZE);
            }
            for (int j = SUBGRID_SIZE; j < SIZE; j += SUBGRID_SIZE) {
                fillSubGrid(i * SUBGRID_SIZE, j);
            }
        }
    }

    // Fill a 3x3 subgrid with valid numbers
    private void fillSubGrid(int row, int col) {
        boolean[] usedNumbers = new boolean[SIZE + 1];
        for (int i = 0; i < SUBGRID_SIZE; i++) {
            for (int j = 0; j < SUBGRID_SIZE; j++) {
                while (true) {
                    int num = random.nextInt(SIZE) + 1;
                    if (!usedNumbers[num] && isValid(num, row + i, col + j)) {
                        board[row + i][col + j] = num;
                        usedNumbers[num] = true;
                        break;
                    }
                }
            }
        }
    }

    // Fill the remaining cells using backtracking
    private boolean fillRemainingCells() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= SIZE; num++) {
                        if (isValid(num, row, col)) {
                            board[row][col] = num;

                            if (fillRemainingCells()) {
                                return true;
                            } else {
                                board[row][col] = 0; // Backtrack
                            }
                        }
                    }
                    return false; // No valid number found for this cell
                }
            }
        }
        return true; // All cells are filled
    }

    // Check if a number is valid in a specific cell
    private boolean isValid(int num, int row, int col) {
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        int startRow = (row / SUBGRID_SIZE) * SUBGRID_SIZE;
        int startCol = (col / SUBGRID_SIZE) * SUBGRID_SIZE;
        for (int i = 0; i < SUBGRID_SIZE; i++) {
            for (int j = 0; j < SUBGRID_SIZE; j++) {
                if (board[startRow + i][startCol + j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    // Print the Sudoku board
    private void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%2d ", board[i][j]);
                if ((j + 1) % SUBGRID_SIZE == 0 && (j + 1) != SIZE) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if ((i + 1) % SUBGRID_SIZE == 0 && (i + 1) != SIZE) {
                System.out.println("-----" + "---------".repeat(SUBGRID_SIZE - 1) + "-----");
            }
        }
    }
}