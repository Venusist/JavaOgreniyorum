import java.util.Scanner;
public class hocauc {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);

        int i, n, prime;
        System.out.println("Enter a number");
        n = sObj.nextInt();

        prime = 1; // Başlangıçta asal olduğunu varsayıyoruz
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = 0;
                break;
            }
        }

        if (prime == 1)
            System.out.println("The number is prime");
        else
            System.out.println("The number is not prime");
    
        sObj.close(); // Scanner'ı kapatmayı unutma

    }
}
