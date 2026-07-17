public class HarshadNumber {
    public static void main(String[] args) {
        int num = 18;
        int original = num;
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        if (original % sum == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not Harshad Number");
    }
}