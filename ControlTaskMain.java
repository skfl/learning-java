package controlTask.b;


public class ControlTaskMain {
    public static void main(String[] args) {
        args = new String[]{"303","133","881","001","1","22"};
        int[] mas = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                mas[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                mas[i] = 0;
            }
        }
        TripleNumCheck.checkForRepeatedNums(args);
    }
}

