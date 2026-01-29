package praticeJava;

public class Pratice3 {
    public static void main(String[] args) {
        int limit = 10;

        for (int num = 1; num <= limit; num++) {
            int count = 0; // reset count for each number

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) { // prime numbers have exactly 2 divisors
                System.out.println(num + ": Prime number");
            }
        }
    }
}
