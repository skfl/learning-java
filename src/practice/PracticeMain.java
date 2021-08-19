package practice;

import practice.first.DeleteFromArray;

import java.util.Arrays;

public class PracticeMain {
    public static void main(String[] args) {
        int[] STATIC = new int[5];
        STATIC[0] = 9;
        STATIC[1] = 3;
        STATIC[2] = 9;
        STATIC[3] = 1;
        STATIC[4] = 9;                                               // [9, 3, 4, 1, 6]

        DeleteFromArray dlt = new DeleteFromArray();
        int[] res = dlt.deleteBySignature(STATIC,9);
        System.out.println(Arrays.toString(res));
        System.out.println(Math.sqrt(-2));
    }
}
