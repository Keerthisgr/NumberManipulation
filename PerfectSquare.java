import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int origin = number;
        double num = Math.sqrt(number);
        if(num == Math.floor(num)){
            System.out.println(number+ " is perfect square");
        }else{
            System.out.println(number+" is not perfect square");
        }
    }
}
