public class SquareOfNaturalNumber {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<=20;i++){
            int sqr = i*i;
            sum = sum+sqr;
        }
        System.out.println("Sum of first 20 natural number is "+sum);
    }
}
