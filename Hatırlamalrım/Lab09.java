/*Lab Task: Prime Numbers
Write a Java program to print all the prime numbers between 2 and 100.
2, 3, 5, 7, 11,…. */


public class Lab09 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 2 and 100:");

        for (int num = 2; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Asal sayıyı kontrol eden fonksiyon
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


