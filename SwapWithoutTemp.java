public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 9;
        int b = 2;
        System.out.println("Before swaping: ");
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swaping: ");
        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
}
