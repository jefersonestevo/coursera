package br.org.jeff.coursera.algorithm.week1;

public class MatrixAlgorithm {

    /**
     * Expects a simple N x N matrix
     */
    public int[][] simpleMultiplication(int[][] x, int[][] y) {
        int length = x.length;
        int[][] z = new int[length][];
        for (int i = 0; i < z.length; i++) {
            z[i] = new int[length];
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < length; k++) {
                    z[i][j] += x[i][k] * y[k][j];
                }
            }
        }

        return z;
    }


}
