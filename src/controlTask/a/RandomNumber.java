package controlTask.a;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args){
        System.out.println("Type amount of random numbers: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Output in different lines: ");
        for(int i = 0;i<num;i++){
            System.out.println(Math.random());
        }
        System.out.println("Output in same line: ");
        for(int i = 0;i<num;i++){
            System.out.print(Math.random()+" ");
        }
    }
}
