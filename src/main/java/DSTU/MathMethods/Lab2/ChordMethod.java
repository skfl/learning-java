package DSTU.MathMethods.Lab2;

public class ChordMethod {
    public static double method_chord(double x_prev, double x_curr, double e) {
        double x_next = 1;
        double tmp;
        do {
            tmp = x_next;
            x_next = x_curr - f(x_curr) * (x_prev - x_curr) / (f(x_prev) - f(x_curr));
            x_prev = x_curr;
            x_curr = tmp;
        } while (Math.abs(x_next - x_curr) > e);
        return x_next;

    }

    public static double f(double x) {
        return ((Math.sin(x)) / x) - 0.5;
    }
}
/**
 * double x0 = 1.75;
 * double x1 = 2;
 * double e = 0.0001;
 * double x = ChordMethod.method_chord(x0, x1, e);
 * System.out.println("Корень равен (хорд) : "+x);
 **/
