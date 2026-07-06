import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number!");
        int number = scanner.nextInt();
        int reversedNumber = 0;
        while(number > 0){
            int ld = number % 10;
            reversedNumber = reversedNumber * 10 + ld;
            number /= 10;
        }
        System.out.println(reversedNumber + " is reversed! ");
        scanner.close();
    }
}
