import java.util.Scanner;

public class VowelAndConsonants {
    public static void main(String[] args) {
        System.out.println("Enter any alphabet to check whether it is vowel or consonant");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        if(ch == 'a'||ch == 'e'||ch =='i'||ch =='o'||ch=='u'||ch=='A'||ch == 'E'||ch == 'I'||ch=='O'||ch=='U'){
            System.out.println(ch + " is vowel");
        }else if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
            System.out.println(ch +" is consonant");
        }
        else{
            System.out.println("Invalid character!");
        }

    }
}
