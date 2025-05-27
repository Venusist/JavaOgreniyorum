public class hocayedi {
    public static void main(String[] args) {
        
    for (int n = 2; n <= 100; n++) {
            boolean isPrime = true; // Varsayılan olarak her sayıyı asal kabul edelim
            // Sayıyı kontrol etmek için 2'den n-1'e kadar olan sayılarla bölme testi yapalım
            for (int i = 2; i < n; i++) {
                if (n % i == 0) { // Eğer n herhangi bir sayıya tam bölünüyorsa asal değildir
                    isPrime = false;
                    break; // Asal olmadığını gördük, döngüden çıkalım
            }
            }
                    // Eğer sayımız asal ise ekrana yazdıralım
                    if (isPrime) {
                        System.out.print(n + ", ");
                    }
                }
            }
        }
        