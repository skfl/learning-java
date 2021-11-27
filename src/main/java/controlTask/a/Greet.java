package controlTask.a;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args){
        System.out.println("Hello,what is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Greetings, "+ name);
    }
}
