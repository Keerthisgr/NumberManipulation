import java.util.Scanner;

public class NEvenNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i=1; i<=number; i++){
           int result = i * 2;
            System.out.println(result);
        }

    }
}
