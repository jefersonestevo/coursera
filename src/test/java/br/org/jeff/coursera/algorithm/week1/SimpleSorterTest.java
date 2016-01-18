package br.org.jeff.coursera.algorithm.week1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SimpleSorterTest {

    @Test
    public void testBubbleSort() throws Exception {
        int[] array = new int[] {9, 22, 8, 7, 16};

        new SimpleSorter().bubbleSort(array);

        assertArrayEquals(new int[] {7, 8, 9, 16, 22}, array);
    }

    @Test
    public void testBubbleSortWithEmptyArray() throws Exception {
        int[] array = new int[] {};

        new SimpleSorter().bubbleSort(array);

        assertArrayEquals(array, array);
    }

    @Test
    public void testBubbleSortWithSingleValueArray() throws Exception {
        int[] array = new int[] {9};

        new SimpleSorter().bubbleSort(array);

        assertArrayEquals(array, array);
    }

    @Test
    public void testBubbleSortWithEqualsValues() throws Exception {
        int[] array = new int[] {9, 22, 8, 7, 16, 8, 3, 10};

        new SimpleSorter().bubbleSort(array);

        assertArrayEquals(new int[] {3, 7, 8, 8, 9, 10, 16, 22}, array);
    }

    @Test
    public void testMergeSortWithEmptyArray() throws Exception {
        int[] array = new int[] {};

        new SimpleSorter().mergeSort(array);

        assertArrayEquals(array, array);
    }

    @Test
    public void testMergeSortWithSingleValueArray() throws Exception {
        int[] array = new int[] {1};

        new SimpleSorter().mergeSort(array);

        assertArrayEquals(array, array);
    }

    @Test
    public void testMergeSortWithOddNumberOfValues() throws Exception {
        int[] array = new int[] {9, 22, 8, 7, 16};

        new SimpleSorter().mergeSort(array);

        assertArrayEquals(new int[] {7, 8, 9, 16, 22}, array);
    }

    @Test
    public void testMergeSortWithEqualsValues() throws Exception {
        int[] array = new int[] {9, 22, 8, 7, 16, 8, 3, 10};

        new SimpleSorter().mergeSort(array);

        assertArrayEquals(new int[]{3, 7, 8, 8, 9, 10, 16, 22}, array);
    }

    @Test
    public void compareTime() {
        int[] array = TestUtils.createInvertedArray(25000);

        long startTime = System.currentTimeMillis();
        new SimpleSorter().bubbleSort(array);
        System.out.println("Bubble sort time: " + (System.currentTimeMillis() - startTime));

        array = TestUtils.createInvertedArray(25000);

        startTime = System.currentTimeMillis();
        new SimpleSorter().mergeSort(array);
        System.out.println("Merge sort time: " + (System.currentTimeMillis() - startTime));
    }

}