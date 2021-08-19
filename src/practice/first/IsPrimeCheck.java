package practice.first;

public class IsPrimeCheck {
    public static void primeCheck(String[] args) {

        for (int i = 2; i < 100; i++) {
            if (i == 2 || i == 3 || i == 5 || i == 7) {
                System.out.println("Number " + i + " is prime");
            } else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
            } else {
                System.out.println("Number " + i + " is prime");
            }
        }
    }
}
