import java.util.Scanner;

class temprature {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a temprature");
        double temp= sc.nextDouble();
        double f=(temp*9/5)+32;
        System.out.println("celsious to faher:"+f);
        double c=(f-32)*5/9;
        System.out.println("faher to celsious:"+c);
        
    }
    
}
