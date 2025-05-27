public class hcayedi {

    // 2D int array için toplam hesaplayan metod
    static int sumArray(int array[][]) {
        int sum = 0;  // Toplamı tutacak değişken
        for (int i = 0; i < array.length; i++) {  // Satırları gezmek için döngü
            for (int j = 0; j < array[i].length; j++) {  // Her satırdaki elemanları gezmek için döngü
                sum += array[i][j];  // Elemanları toplama ekle
            }
        }
        return sum;  // Toplamı döndür
    }    

    // 2D double array için toplam hesaplayan metod
    static double sumArray(double array[][]) {
        double sum = 0;  // Toplamı tutacak değişken
        for (int i = 0; i < array.length; i++) {  // Satırları gezmek için döngü
            for (int j = 0; j < array[i].length; j++) {  // Her satırdaki elemanları gezmek için döngü
                sum += array[i][j];  // Elemanları toplama ekle
            }
        }
        return sum;  // Toplamı döndür
    }

    public static void main(String[] args) {
        // int türünde bir 2D dizi
        int[][] intArray = { {1, 2, 3},{1, 0, 2}}; 
        
        // int dizisi için sumArray metodunu çağırıyoruz
        int intSum = sumArray(intArray);  
        System.out.println("Sum of int array elements: " + intSum);  // Sonuç yazdırılıyor

        // double türünde bir 2D dizi
        double[][] doubleArray = {{2.4, 3, 5.5},{1.5, 7.3, 3}};
        
        // double dizisi için sumArray metodunu çağırıyoruz
        double doubleSum = sumArray(doubleArray);  
        System.out.println("Sum of double array elements: " + doubleSum);  // Sonuç yazdırılıyor
    }
}
