import java.util.Scanner;

public class SeasonPredictor
{
    public static void main(String[] args) {
        System.out.println("Enter the month in number");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String season = "";
        switch (month){
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
            season = "Summer";
            break;
            case 9:
            case 10:
            case 11:
                season = "Fall";
                break;
            default:
                season = "Invalid month!";
                break;
        }
        System.out.println("the month number "+month+" corresponds to "+season+".");
        scanner.close();
    }
}
