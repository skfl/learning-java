package controlTask.b;

public class Division {
    public static void oddEven(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                System.out.println("Number " + mas[i] + " is even");
            } else {
                System.out.println("Number " + mas[i] + " is odd");
            }
        }


    }

    public static void dividedByThreeNine(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 3 == 0) {
                System.out.println("Number " + mas[i] + "can be divided by 3 or 9");
            }
        }
    }

    public static void dividedByFiveSeven(int[] mas) {
        for(int i=0;i<mas.length;i++){
            if(mas[i]%5==0){
                System.out.println("Number "+mas[i]+" can be divided by 5");
            }else if (mas[i]%7==0){
                System.out.println("Number "+mas[i]+" can be divided by 7");
            }
        }
    }
    public static void isPrime(int[] mas){
        for(int i=0;i<mas.length;i++){
            if(mas[i]%2==0 || mas[i]%3==0 || mas[i]%5==0 || mas[i]%7==0){
                System.out.println("Number "+mas[i]+" is not Prime");
            }else {
                System.out.println("Number "+mas[i]+" is Prime");
            }
        }
    }
}
