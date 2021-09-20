package stepik.mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] a1, int[] a2) {
        int[] res = new int[a1.length + a2.length];
        int[] tmp1 = new int[a1.length];
        int[] tmp2 = new int[a2.length];
        boolean v = true;
        int pos = 0;
        while (v) {
            if (a1.length != 0 && a2.length != 0) {
                if (a1[0] < a2[0]) {
                    res[pos] = a1[0];
                    pos += 1;
                    tmp1 = Arrays.copyOfRange(a1, 1, a1.length);
                    a1 = tmp1;
                } else if (a2[0] < a1[0]) {
                    res[pos] = a2[0];
                    pos += 1;
                    tmp2 = Arrays.copyOfRange(a2, 1, a2.length);
                    a2 = tmp2;
                } else {
                    res[pos] = a1[0];
                    pos += 1;
                    res[pos] = a2[0];
                    pos += 1;
                    tmp1 = Arrays.copyOfRange(a1, 1, a1.length);
                    a1 = tmp1;
                    tmp2 = Arrays.copyOfRange(a2, 1, a2.length);
                    a2 = tmp2;

                }
            } else v = false;

            if (a1.length == 0) {
                for (int j = 0; j < a2.length; j++) {
                    if (pos < res.length) {

                        res[pos] = a2[j];
                        pos += 1;
                    }
                }
            }
            if (a2.length == 0) {
                for (int j = 0; j < a1.length; j++) {
                    if (pos < res.length) {
                        res[pos] = a1[j];
                        pos += 1;
                    }
                }
            }
        }
        return res;
    }
}

