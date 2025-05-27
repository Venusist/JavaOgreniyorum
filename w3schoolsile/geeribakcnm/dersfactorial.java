public class dersfactorial {
    public static void main(String[] args) {
        int n = 4;  // Faktöriyeli hesaplanacak sayı
        int i, fact = 1;

        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println(n + "! = " + fact);  // Sonucu ekrana yazdır
    }
} 