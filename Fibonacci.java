import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int maxNumber = scanner.nextInt();
        int a=0;
        int b = 1;
        int c;
        System.out.print("Fibonacci series upto "+maxNumber+": "+a+" ");
        while (b<=maxNumber){
            System.out.print(b+ " ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
