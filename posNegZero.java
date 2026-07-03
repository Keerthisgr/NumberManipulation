import java.util.Scanner;

public class posNegZero {
    public static void main(String[] args) {
        System.out.println("Enter a number to check given number is Positive, Negative or Zero");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input > 0){
            System.out.println(input+" is positive number");
        }else if(input == 0) {
            System.out.println(input + " is zero");
        }else{
            System.out.println(input+" is negative number");
        }
    }
}
