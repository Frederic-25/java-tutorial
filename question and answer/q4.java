import java.util.Scanner;

class q2 {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    String a= sc.nextLine();
    float b= sc.nextFloat();\\also use both float and double\\
    sc.nextLine();
    String c= sc.nextLine();
    System.out.println("name:"+a);
    System.out.println("marks:"+b/10+"/10");
    System.out.print("department:"+c);
    }
}