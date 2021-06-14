package controlTask.b;

public class Misc {
    public static void isLucky(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 3 || mas[i] == 42 || mas[i] == 69) {
                System.out.println("You are a lucky one!");
            } else {
                System.out.println("Unlucko malucko :(");
            }
        }
    }

    public static void minMax(int[] mas) {
        int tmp1 = mas[1];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < tmp1) {
                tmp1 = mas[i];
            }
        }
        System.out.println("Min number is " + tmp1);
        int tmp2 = mas[1];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > tmp2) {
                tmp2 = mas[i];
            }
        }
        System.out.println("Max number is " + tmp2);
    }

    public static void isHalfSum(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            if (i == 0 || i == 1) {
            } else if (mas[i] == (mas[i - 1] + mas[i - 2]) / 2) {
                System.out.println("Number " + mas[i] +" with index "+i+" is half sum of elements before");
            }
        }
    }
}
