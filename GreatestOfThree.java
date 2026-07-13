public class GreatestOfThree {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 7;
        int num3 = 3;
        int max = Math.max(num1, Math.max(num2,num3));
        System.out.println(max);
    }
}
