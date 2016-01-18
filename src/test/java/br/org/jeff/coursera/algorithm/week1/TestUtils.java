package br.org.jeff.coursera.algorithm.week1;

import org.junit.Ignore;

@Ignore
public class TestUtils {

    public static int[] createInvertedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (size - i);
        }
        return array;
    }

}
