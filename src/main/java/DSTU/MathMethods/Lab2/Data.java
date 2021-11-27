package DSTU.MathMethods.Lab2;

public class Data {
    public static double[] getXdata() {
        double[] arr = new double[20];
        double x = -2;
        for (int i = 0; i < 20; i++) {
            arr[i] = x;
            x += 0.5;
        }
        return arr;
    }

    public static double[] getYdata() {
        double[] arr = new double[20];
        double x = -0.5;
        for (int i = 0; i < 20; i++){
            arr[i]=((Math.sin(x))/x)-0.5;
            x+=0.31;
        }
            return arr;
    }
}
