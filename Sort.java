package controlTask.b;

public class Sort {
    public static void sortMinMax(int[] mas) {
        int[] tmp = mas;
        int iter = 0;
        int num = 1;
        while (iter < mas.length - 1) {

            for (int i = 0; i < mas.length - num; i++) {
                if (i + 1 > mas.length - 1) {
                } else if (mas[i] > mas[i + 1]) {
                    int tmpVar = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = tmpVar;
                }
            }
            num += 1;
            iter += 1;

        }


        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
        System.out.flush();
    }
    public static void maxMin(int[] mas){
        Sort.sortMinMax(mas);
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }
}