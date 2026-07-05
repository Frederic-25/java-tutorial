import java.lang.System;
import java.util.Scanner;

class nameandage{
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    String a= sc.nextLine();
    int b= sc.nextInt();
    System.out.println("Name:"+a);
    System.out.print("age:"+b);
    }
}