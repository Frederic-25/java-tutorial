import java.util.Scanner;

 class average {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = a+b+c/3;
        System.out.println("average of three numbers:"+avg);
    }
    
}
