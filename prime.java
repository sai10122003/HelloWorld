import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();
        scanner.close();

        boolean isPrime = isPrime(number);
        
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        // Check from 2 to the square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // If divisible by any number, it's not prime
            }
        }
        return true; // If not divisible by any number, it's prime
    }
}
