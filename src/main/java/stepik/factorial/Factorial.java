package stepik.factorial;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int value) {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("1");
        for(int i=0;i<value;i++){
            a = a.multiply(b);
            b = b.add(c);
        }
        System.out.println(a);
        return a;
    }
}
