import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi girin: ");           
        int n = input.nextInt();
        long factorial = 1;
        
        for (int i = 1; i <= n; i++) {       
            factorial = factorial*i;
        }

        System.out.println("Faktöriyel: " + factorial);
    } }