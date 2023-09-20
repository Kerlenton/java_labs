package ru.mirea.lab41.task4;

public class Matrix {
    private double[][] matrix;
    private int rows;
    private int columns;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.columns = matrix[0].length;
    }

    public void add(Matrix otherMatrix) {
        if (this.rows == otherMatrix.rows && this.columns == otherMatrix.columns) {
            double[][] result = new double[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result[i][j] = this.matrix[i][j] + otherMatrix.matrix[i][j];
                }
            }
            this.matrix = result;
        } else {
            System.out.println("Матрицы имеют разные размеры. Сложение невозможно.");
        }
    }

    public void multiplyByNumber(double number) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] *= number;
            }
        }
    }

    public void multiply(Matrix otherMatrix) {
        if (this.columns == otherMatrix.rows) {
            double[][] result = new double[this.rows][otherMatrix.columns];
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < otherMatrix.columns; j++) {
                    for (int k = 0; k < this.columns; k++) {
                        result[i][j] += this.matrix[i][k] * otherMatrix.matrix[k][j];
                    }
                }
            }
            this.matrix = result;
            this.columns = otherMatrix.columns;
        } else {
            System.out.println("Количество столбцов первой матрицы не равно количеству строк второй матрицы. Умножение невозможно.");
        }
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

