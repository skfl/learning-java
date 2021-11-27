package controlTask.a;

public class StringArgs {
    public static void main(String[] args) {
        int num = args.length;
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[num-1]);
            num -= 1;
        }
    }
}
