package controlTask.a;

import java.util.Scanner;

public class Password {
    public static void main(String[] args){
        String PASSWORD = "JAVAETOKRUTO";
        System.out.println("Type in pass... ");
        Scanner scan = new Scanner(System.in);
        String usrPass = scan.next();
        if (PASSWORD.equals(usrPass)){
            System.out.println("Access granted");
        }else {
            System.out.println("Access denied");
        }
    }
}
