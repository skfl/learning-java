package Sort;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Random;

public class SortMain {
    public static void main(String[] args) {
        int[] mas = new int[5];
        int MAX = 10;
        Random rnd = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rnd.nextInt(MAX);
        }

        int[] STATIC = new int[5];
        STATIC[0] = 9;
        STATIC[1] = 3;
        STATIC[2] = 4;
        STATIC[3] = 1;
        STATIC[4] = 6;                                               // [9, 3, 4, 1, 6]

        Sort srt = new Sort();
        System.out.println(Arrays.toString(mas));
        System.out.println(Arrays.toString(srt.brushSort(mas)));

    }

}
