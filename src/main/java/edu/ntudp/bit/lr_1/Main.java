package edu.ntudp.bit.lr_1;

import java.util.Random;
import java.util.Scanner;

class Matrix {
    private int rows;
    private int cols;
    private int[][] matrix;

    // Constants for random numbers
    private static final int MIN_RANDOM_VALUE = 1;
    private static final int MAX_RANDOM_VALUE = 100;

    // Constructor to initialize the matrix with specified dimensions
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
    }

    // Method to create the matrix manually
    public void createMatrixManually() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to create the matrix randomly
    public void createMatrixRandomly() {
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(MAX_RANDOM_VALUE - MIN_RANDOM_VALUE + 1) + MIN_RANDOM_VALUE;
            }
        }
    }

    // Method to print the matrix
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to find the minimum element in the matrix
    public int findMin() {
        int min = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    // Method to find the maximum element in the matrix
    public int findMax() {
        int max = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    // Method to calculate the arithmetic mean
    public double calculateArithmeticMean() {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
                count++;
            }
        }
        return sum / count;
    }

    // Method to calculate the geometric mean
    public double calculateGeometricMean() {
        double product = 1;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                product *= matrix[i][j];
                count++;
            }
        }
        return Math.pow(product, 1.0 / count);
    }
}

public classMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter matrix dimensions
        System.out.print("Enter the number of rows (no more than 20): ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns (no more than 20): ");
        int cols = scanner.nextInt();

        // Check for maximum matrix size
        if (rows > 20 || cols > 20) {
            System.out.println("The maximum matrix size is 20 by 20!");
            return;
        }

        // Create the matrix
        Matrix matrixApp = new Matrix(rows, cols);

        // Choose how to create the matrix
        System.out.println("How would you like to create the matrix?");
        System.out.println("1. Enter manually");
        System.out.println("2. Create randomly");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                matrixApp.createMatrixManually();
                break;

            case 2:
                matrixApp.createMatrixRandomly();
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Print the matrix
        System.out.println("Matrix:");
        matrixApp.printMatrix();

        // Find the minimum and maximum element
        int min = matrixApp.findMin();
        int max = matrixApp.findMax();
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);

        // Calculate the arithmetic mean
        double avg = matrixApp.calculateArithmeticMean();
        System.out.println("Arithmetic mean: " + avg);

        // Calculate the geometric mean
        double geoAvg = matrixApp.calculateGeometricMean();
        System.out.println("Geometric mean: " + geoAvg);
    }
}
