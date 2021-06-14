package controlTask.b;

public class Sort {
    public static void sortMinMax(int[] mas) {
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
    }

    public static void sortMaxMin(int[] mas) {
        int tmp[];
        tmp = new int[mas.length];
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
        int tmpVar = mas.length-1;
        for(int i = 0;i< mas.length ;i++){
            tmp[i]=mas[tmpVar];
            tmpVar -= 1;
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.println(tmp[i]);
        }
    }
}
