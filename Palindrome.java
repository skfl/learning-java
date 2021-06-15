package controlTask.b;

import java.util.Arrays;

public class Palindrome {
    public static void isPalindrome(String[] mas) {
        for (int i = 0; i < mas.length; i++) {
            String str = mas[i];
            String[] spltd = str.split("");
            String[] tmp;
            tmp = new String[spltd.length];
            int tmpVar = spltd.length - 1;
            for (int j = 0; j < spltd.length; j++) {
                tmp[tmpVar] = spltd[j];
                tmpVar -= 1;
            }
            if (Arrays.deepEquals(tmp, spltd)) {
                System.out.println("Number with index " + i + " is palindrome");
            }
        }
    }
}
