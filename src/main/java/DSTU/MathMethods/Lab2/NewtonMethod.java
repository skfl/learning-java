package DSTU.MathMethods.Lab2;

public class NewtonMethod {
    public static void newtonMethod() {
        double x_c = 1.7;
        double x_n = 1.7;
        double eps = 0.0001;
        int cnt = 0;
        do {
            x_c = x_n;
            cnt += 1;
            x_n = x_c - ((f(x_c)) / (fd(x_c)));
        } while (Math.abs(x_n - x_c) > eps);
        System.out.println("Корень равен (Ньютон) : " + x_n + " кол-во шагов " + cnt);
    }

    public static double f(double x) {
        return ((Math.sin(x)) / x) - 0.5;
    }

    public static double fd(double x) {
        return ((Math.cos(x) / x) - (Math.sin(x) / (x * x)));
    }
}
