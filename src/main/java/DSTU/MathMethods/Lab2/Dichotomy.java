package DSTU.MathMethods.Lab2;

public class Dichotomy {
    public static void dichotomyMethod() {
        double eps = 0.0001;
        double a = 1.75;
        double b = 2;
        int step_count = 1000;
        double f_a = ((Math.sin(a)) / a) - 0.5;
        double f_b = ((Math.sin(b)) / b) - 0.5;
        double f_xm;
        int cnt = 0;
        double xm = 0;
        int i = 0;
        while (b - a > eps && i < step_count) {
            xm = (a + b) / 2;
            cnt += 1;
            f_xm = ((Math.sin(xm)) / xm) - 0.5;
            if (f_a * f_xm <= 0) {
                b = xm;
                f_b = f_xm;
            } else {
                a = xm;
                f_a = f_xm;
            }
            i += 1;
        }
        System.out.println("Корень равен (дихот) : " + ((a + b) / 2 + " кол-во шагов " + cnt));
    }
}
