public class DuckNumber {
        public static void main(String[] args) {
            int num = 1203;
            String str = String.valueOf(num);

            if (!str.startsWith("0") && str.contains("0"))
                System.out.println("Duck Number");
            else
                System.out.println("Not Duck Number");
        }
    }

