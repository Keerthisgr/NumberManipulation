import java.util.Scanner;

public class TemperaturePrediction {
    public static void main(String[] args) {
        System.out.println("Enter Temperature:");
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();

        if (temperature < 0) {
            System.out.println(temperature + " Freezing");
        } else if (temperature >= 0 && temperature <= 15) {
            System.out.println(temperature + " Cold");
        } else if (temperature >= 16 && temperature <= 25) {
            System.out.println(temperature + " Moderate");
        } else if (temperature >= 26 && temperature <= 35) {
            System.out.println(temperature + " Warm");
        } else {
            System.out.println(temperature + " Hot");
        }
    }
}
