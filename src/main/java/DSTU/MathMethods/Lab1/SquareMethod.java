package DSTU.MathMethods.Lab1;

public class SquareMethod {
    public static void squareMethod() {
        int n = 100; //количество интервалов разбиения
        double h = (((4 * Math.sqrt(3)) - 4) / n); // вычислляем шаг
        double x = 0;
        double a = 4;
        double b = Math.sqrt(3) * 4;
        double sum = 0;
        double lastElem =0;
        double firstElem = 0;

        for (int i = 0; i <= n; i++) {
            x = a + h * i;
            sum += 1 / (x * Math.sqrt(x * x + 16));
            if(i==0){
                lastElem = 1 / (x * Math.sqrt(x * x + 16));
            }else if (i==5){
                lastElem = 1 / (x * Math.sqrt(x * x + 16));
            }
        }

        System.out.println("Результат по формуле левых прямоугольников равен :"+h*(sum-lastElem));
        System.out.print("Результат по формуле правых прямоугольников равен :"+h*(sum-firstElem));
    }
}
