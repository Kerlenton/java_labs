package ru.mirea.lab41.task4;

public class MatrixTester {
    public static void main(String[] args) {
        double[][] matrixData1 = {{1, 2}, {3, 4}};
        Matrix matrix1 = new Matrix(matrixData1);
        matrix1.print();

        double[][] matrixData2 = {{5, 6}, {7, 8}};
        Matrix matrix2 = new Matrix(matrixData2);
        matrix2.print();

        matrix1.add(matrix2);
        matrix1.print();

        matrix2.multiplyByNumber(2);
        matrix2.print();

        double[][] matrixData3 = {{1, 2}, {3, 4}, {5, 6}};
        Matrix matrix3 = new Matrix(matrixData3);
        matrix3.print();

        double[][] matrixData4 = {{1, 2, 3}, {4, 5, 6}};
        Matrix matrix4 = new Matrix(matrixData4);
        matrix4.print();

        matrix3.multiply(matrix4);
        matrix3.print();
    }
}
