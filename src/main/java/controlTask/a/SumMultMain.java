package controlTask.a;

public class SumMultMain {
    public static void main(String[] args) {
        int num = args.length;
        int sum = 0;
        int mult = 1;
        //changin str to int
        int[] mas = new int[num];
        for (int i = 0; i < num; i++) {
            try {
                mas[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                mas[i] = 0;
            }
        }
        //countin ans
        for (int i = 0; i < num; i++) {
            sum += mas[i];
            mult *= mas[i];
        }
        System.out.println("Sum of args is even to : " + sum);
        System.out.println("Mult of args is even to : " + mult);
    }
}
