import java.util.Scanner;

public class CitizenshipCheck {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age>=65){
            System.out.println("You are eligible for senior citizen discount!");
        }else {
            System.out.println("You are not eligible for senior citizen discount!");
        }
    }
}
