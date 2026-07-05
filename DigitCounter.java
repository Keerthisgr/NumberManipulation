import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        System.out.println("Enter numbers");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int counter = 0;
        int val = num;
        while (val > 0){
            val = val /10;
            counter = counter + 1;
        }
        System.out.println("The number "+num+" has "+counter+" Digits");
    }
}
