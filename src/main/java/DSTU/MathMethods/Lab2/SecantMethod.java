package DSTU.MathMethods.Lab2;

import java.util.Random;

public class SecantMethod {
    public static void secantMethod() {
        Random rnd = new Random();
        double eps = 0.0001;
        double X = rnd.nextInt(100);
        double Xlast = rnd.nextInt(100);
        double XGrandLast;
        double dx = 100;
        while (Math.abs(dx) > eps) {
            XGrandLast = Xlast;
            Xlast = X;
            X -= f(Xlast) * (Xlast - XGrandLast) / f(Xlast) - f(XGrandLast);
            dx = X - Xlast;
        }
        System.out.println("Корень равен (секущих) : " + X);
    }

    public static double f(double x) {
        return ((Math.sin(x)) / x) - 0.5;
    }
}
