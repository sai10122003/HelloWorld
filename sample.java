public class sample {
    public static void main(String[] args) {
        int numberToCheck = 17; // Change this to the number you want to check

        boolean isPrime = isPrime(numberToCheck);

        if (isPrime) {
            System.out.println(numberToCheck + " is a prime number.");
        } else {
            System.out.println(numberToCheck + " is not a prime number.");
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
