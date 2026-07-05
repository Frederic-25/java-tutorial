import java.lang.System;
import java.util.Scanner;

class user {

      public long add(){
            Scanner sc = new Scanner(System.in);
            int a1  = sc.nextInt();
            int b1 = sc.nextInt();
            long n = a1+b1;
            sc.close();
            return n;    
        }

    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // sc.nextLine();
        // String b = sc.nextLine();
        // System.out.println(a);
        // System.out.print(b);

        user addition = new user();

        long result = addition.add();
        System.out.println(result);
    }
    
}
