import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check is it palindrome");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int n = number;
        while (number > 0){
            int ld = number % 10;
            sum = sum * 10 +ld;
            number = number / 10;
        }
        if(n==sum){
            System.out.println(n+" is palindrome number");
        }else{
            System.out.println(n+" is not palindrome number!!");
        }
    }
}
