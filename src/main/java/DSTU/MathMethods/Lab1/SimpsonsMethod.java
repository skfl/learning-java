package DSTU.MathMethods.Lab1;


public class SimpsonsMethod {
    public static void simpsonsMethod() {
        double eps = 0.001;  // так как не была задана необходимая точность , то мною произвольно была задано такое значение
        double h_min = 0.178; // минимальный шаг для данной точности равен корню четвертой степени из эпсилон
        double a = 4;
        double b = Math.sqrt(3) * 4;
        double n = 20;  //число разбиений равно (b-a)/h_min округленный вверх до ближайшего числа кратного 4
        double h = (b - a) / n;
        double y0 = 1 / (a * Math.sqrt(a * a + 16));
        double yLast = 1 / (b * Math.sqrt(b * b + 16));
        double yOdd = 0;
        double yEven = 0;
        double res = 0;

        for (int i = 1; i < n; i += 2) {
            double x = a + h * i;
            yOdd += 1 / (x * Math.sqrt(x * x + 16));
        }

        for (int j = 2; j < n; j += 2) {
            double x = a + h * j;
            yEven += 1 / (x * Math.sqrt(x * x + 16));
        }

        res = h / 3 * (y0 + yLast + (4 * yOdd) + (2 * yEven));
        System.out.println(res);
    }
}
