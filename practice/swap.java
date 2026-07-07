import java.util.Scanner;

class swap {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value of a and b");
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println("before swapping a:"+a+"B:"+b); 
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
    
}
