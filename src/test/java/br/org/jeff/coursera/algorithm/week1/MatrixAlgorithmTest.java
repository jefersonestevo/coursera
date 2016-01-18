package br.org.jeff.coursera.algorithm.week1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAlgorithmTest {

    @Test
    public void testSimpleMultiplication() throws Exception {
        int[][] x = new int[][]{new int[] {1, 2},
                                new int[] {3, 4}};

        int[][] y = new int[][]{new int[] {5, 6},
                                new int[] {7, 8}};

        int[][] z = new MatrixAlgorithm().simpleMultiplication(x, y);

        int[][] expectedArray = new int[][]{new int[] {19, 22},
                                            new int[] {43, 50}};

        assertArrayEquals(expectedArray, z);
    }

    @Test
    public void testSimpleMultiplication2() throws Exception {
        int[][] x = new int[][]{new int[] {1, 2, 3},
                                new int[] {4, 5, 6},
                                new int[] {7, 8, 9}};

        int[][] y = new int[][]{new int[] {10, 11, 12},
                                new int[] {13, 14, 15},
                                new int[] {16, 17, 18}};

        int[][] z = new MatrixAlgorithm().simpleMultiplication(x, y);

        int[][] expectedArray = new int[][]{new int[] {84, 90, 96},
                                            new int[] {201, 216, 231},
                                            new int[] {318, 342, 366}};

        assertArrayEquals(expectedArray, z);
    }

}