package br.org.jeff.coursera.algorithm.week1;

public class InversionAlgorithm {

    public int countSplitInversionWithBruteForce(int[] array) {
        int splitInvCount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    splitInvCount++;
                }
            }
        }
        return splitInvCount;
    }

    public int countSplitInversion(int[] array) {
        if (array.length <= 1) {
            return 0;
        }

        int start = 0;
        int end = array.length;
        int mid = end / 2;

        int[] a = new int[mid - start];
        int[] b = new int[end - mid];

        System.arraycopy(array, start, a, 0, (mid - start));
        System.arraycopy(array, mid, b, 0, (end - mid));

        int leftCount = countSplitInversion(a);
        int rightCount = countSplitInversion(b);
        int splitInvCount = 0;

        int i = 0;
        int j = 0;
        for (int k = 0; k <= array.length; k++) {
            if (i < a.length && j < b.length) {
                if (a[i] < b[j]) {
                    array[k] = a[i++];
                } else if (b[j] < a[i]) {
                    array[k] = b[j++];
                    splitInvCount += (a.length - i);
                } else {
                    // Contents are equals, so get the first one
                    array[k] = a[i++];
                }
            }
            else if (i < a.length) {
                array[k] = a[i++];
            }
            else if (j < b.length) {
                array[k] = b[j++];
            }
        }

        return leftCount + rightCount + splitInvCount;
    }

}
