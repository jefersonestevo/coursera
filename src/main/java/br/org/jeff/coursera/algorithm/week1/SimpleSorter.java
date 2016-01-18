package br.org.jeff.coursera.algorithm.week1;

public class SimpleSorter {

    public void bubbleSort(int[] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 1; j < n.length; j++) {
                if (n[j] < n[j - 1]) {
                    int temp = n[j - 1];
                    n[j - 1] = n[j];
                    n[j] = temp;
                }
            }
        }
    }

    public void mergeSort(int[] n) {
        if (n.length <= 1) {
            return;
        }

        int start = 0;
        int end = n.length;
        int mid = end / 2;

        int[] a = new int[mid - start];
        int[] b = new int[end - mid];

        System.arraycopy(n, start, a, 0, (mid - start));
        System.arraycopy(n, mid, b, 0, (end - mid));

        mergeSort(a);
        mergeSort(b);

        int i = 0;
        int j = 0;
        for (int k = 0; k <= n.length; k++) {
            if (i < a.length && j < b.length) {
                if (a[i] < b[j]) {
                    n[k] = a[i++];
                } else if (b[j] < a[i]) {
                    n[k] = b[j++];
                } else {
                    // Contents are equals, so get the first one
                    n[k] = a[i++];
                }
            }
            else if (i < a.length) {
                n[k] = a[i++];
            }
            else if (j < b.length) {
                n[k] = b[j++];
            }
        }
    }

}
