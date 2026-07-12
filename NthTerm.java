import java.util.Scanner;

public class NthTerm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = scanner.nextInt();
        int x = (n*(n+1)/2);
        System.out.println("The "+n+"th term of serirs is "+x+".");
    }
}
