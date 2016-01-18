package br.org.jeff.coursera.algorithm.week1;

import org.junit.Test;

import static org.junit.Assert.*;

public class InversionAlgorithmTest {

    @Test
    public void testCountSplitInversionWithBruteForce() throws Exception {
        int[] array = new int[] {1, 3 ,5 ,2 ,4, 6};

        int result = new InversionAlgorithm().countSplitInversionWithBruteForce(array);
        assertEquals(3, result);
    }

    @Test
    public void testCountSplitInversionWithBruteForceWithTotallyInvertedArray() throws Exception {
        int[] array = new int[] {6, 5, 4, 3, 2, 1};

        int result = new InversionAlgorithm().countSplitInversionWithBruteForce(array);
        assertEquals(15, result);
    }

    @Test
    public void testCountSplitInversion() throws Exception {
        int[] array = new int[] {1, 3 ,5 ,2 ,4, 6};

        int result = new InversionAlgorithm().countSplitInversion(array);
        assertEquals(3, result);
    }

    @Test
    public void testCountSplitInversionWithEmptyArray() throws Exception {
        int[] array = new int[] {};

        int result = new InversionAlgorithm().countSplitInversion(array);
        assertEquals(0, result);
    }

    @Test
    public void testCountSplitInversionWithSingleValye() throws Exception {
        int[] array = new int[] {1};

        int result = new InversionAlgorithm().countSplitInversion(array);
        assertEquals(0, result);
    }

    @Test
    public void testCountSplitInversionWithTwoElements() throws Exception {
        int[] array = new int[] {3, 1};

        int result = new InversionAlgorithm().countSplitInversion(array);
        assertEquals(1, result);
    }

    @Test
    public void testCountSplitInversionWithTotallyInvertedArray() throws Exception {
        int[] array = new int[] {6, 5, 4, 3, 2, 1};

        int result = new InversionAlgorithm().countSplitInversion(array);
        assertEquals(15, result);
    }

    @Test
    public void compareTime() {
        int[] array = TestUtils.createInvertedArray(25000);

        long startTime = System.currentTimeMillis();
        new InversionAlgorithm().countSplitInversionWithBruteForce(array);
        System.out.println("Split Inversion (Brute Force) time: " + (System.currentTimeMillis() - startTime));

        array = TestUtils.createInvertedArray(25000);

        startTime = System.currentTimeMillis();
        new InversionAlgorithm().countSplitInversion(array);
        System.out.println("Split Inversion time: " + (System.currentTimeMillis() - startTime));
    }

}