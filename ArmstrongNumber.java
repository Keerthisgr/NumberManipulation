import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int cnt = 0;
        int temp = number;
        while(temp > 0){
            temp = temp / 10;
            cnt++;
        }
        int sum = 0;
        int n = number;
        while(n>0){
            int ld = n % 10;
            sum = sum + (int)Math.pow(ld,cnt);
            n /= 10;
        }
        if(number==sum){
            System.out.println(number+" is Armstrong number!!");
        }else{
            System.out.println(number+" is not Armstrong number!!");
        }
    }
}
