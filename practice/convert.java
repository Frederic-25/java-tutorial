import java.util.Scanner;

class convert {
    public static void main (String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter a radius :");
         int r = sc.nextInt();
         double c = 3.14*r*r;
         System.out.println("radius of the circle:"+c);
         
         System.out.println("the given celsious is :"+c);
         double f=(c*9/5)+32;
         System.out.println("celsious to frahentit:"+f);
    }
}