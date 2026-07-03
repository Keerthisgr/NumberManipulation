import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter a year to check is it leap year or not");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
//
        boolean isLeapYear = false;
        if(year % 4 == 0){
            if(year%100!=0||year%400==0){
//                System.out.println(year+ " is leap year");
                isLeapYear = true;
            }
            }
        if(isLeapYear==true){
            System.out.println(year +" is leap year");
        }else{
            System.out.println(year+" is not leap year");
        }
//        System.out.println(year+" is not a leap year");
        }
    }

