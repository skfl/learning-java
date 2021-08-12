package Sort;

import java.util.Arrays;

public class Sort {
    public int check(int[] mas) {
        int cnt = 0;
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] < mas[i + 1] || mas[i] == mas[i + 1]) {
                cnt += 1;
            }
        }
        return cnt;
    }

    public int[] dumbSort(int[] mas) {

        int tmp = 0;

        while (check(mas) != mas.length - 1) {

            for (int i = 0; i < mas.length; i++) {
                if (mas[i] > mas[i + 1]) {
                    tmp = mas[i + 1];
                    mas[i + 1] = mas[i];
                    mas[i] = tmp;
                    break;
                }
            }
            System.out.println(Arrays.toString(mas));
        }
        return mas;
    }

    public int[] bubbleSort(int[] mas) {

        int tmp = 0;

        while (check(mas) != mas.length - 1) {

            for (int i = 0; i < mas.length; i++) {
                if (i + 1 < mas.length && mas[i] > mas[i + 1]) {
                    tmp = mas[i + 1];
                    mas[i + 1] = mas[i];
                    mas[i] = tmp;
                }

            }
            System.out.println(Arrays.toString(mas));

        }

        return mas;
    }

    public int[] cocktailSort(int[] mas) {

        int tmp = 0;

        while (check(mas) != mas.length - 1) {

            for (int i = 0; i < mas.length; i++) {
                if (i + 1 < mas.length && mas[i] > mas[i + 1]) {
                    tmp = mas[i + 1];
                    mas[i + 1] = mas[i];
                    mas[i] = tmp;
                }

            }
            for (int j = mas.length - 1; j > 0; j--) {
                if (mas[j] < mas[j - 1]) {
                    tmp = mas[j];
                    mas[j] = mas[j - 1];
                    mas[j - 1] = tmp;
                }
            }

        }

        return mas;
    }

    public int[] oddEvenSort(int[] mas) {
        int tmp = 0;

        while (check(mas) != mas.length - 1) {

            for (int i = 0; i < mas.length; i += 2) {
                if (i + 2 < mas.length && mas[i] > mas[i + 1]) {
                    tmp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = tmp;
                }
            }
            for (int j = 1; j < mas.length; j += 2) {
                if (j + 1 < mas.length && mas[j] > mas[j + 1]) {
                    tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;
                }
            }


        }
        return mas;
    }

    public int[] brushSort(int[] mas) {
        int tmp = 0;
        double CONST_DECREASE = 1.247;
        int step = mas.length;

        while (check(mas) != mas.length - 1) {
            int decFactor = (int) Math.round(step / CONST_DECREASE);
            if(decFactor==1){
                Sort srt = new Sort();
                srt.bubbleSort(mas);
            }
            for (int i = 0; i < mas.length;i++){
                if(mas[i]>mas[decFactor]){
                    tmp=mas[i];
                    mas[i]=mas[decFactor];
                    mas[decFactor]=tmp;
                }
            }
            step=decFactor;
        }
        return mas;
    }
}
