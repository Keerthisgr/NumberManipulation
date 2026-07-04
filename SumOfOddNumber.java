public class SumOfOddNumber {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0;i<=50;i++){
            if(i%2==0){
                continue;
            }else {
                sum = sum + i;
            }
        }
        System.out.println("Sum of first 50 odd numbers "+sum);
    }
}
