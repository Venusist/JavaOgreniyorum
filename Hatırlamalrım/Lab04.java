/* Write the definition of two methods to evaluate the summation of the elements of a 2D array. 
One for integer array.
Another for a double type array.
Both methods will have same name.
The methods should return the summation.*/

/*Kod, iki farklı türde (int ve double) 2D (iki boyutlu) dizinin elemanlarının toplamını hesaplamak
 için iki tane aynı isimli metod (fonksiyon) tanımlar. Bir metod, integer (tam sayı) dizileri için, 
 diğeri ise double (ondalık) dizileri için çalışır. Kodda hem tam sayı dizileri hem de ondalıklı sayı 
 dizileri için toplam hesaplanıp ekrana yazdırılmaktadır. */

public class Lab04 {
    public static int sumArray(int[][] array) { //Bu metod, integer (tam sayı) türündeki 2D dizileri alır.
        int sum = 0; //Toplamı tutacak olan değişken.
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                sum += array[i][j];// burada her bir eleman sum değişkenine ekleniyor.
            }
        }
        return sum;
    }

    public static double sumArray(double[][] array) {
        double sum = 0.0;
        for(int i = 0; i<array.length;i++) {
            for (int j = 0; j <array[i].length;j++){
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example usage with an integer 2D array
        int[][] intArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Sum of integer array: " + sumArray(intArray));

        // Example usage with a double 2D array
        double[][] doubleArray = {
            {1.5, 2.5, 3.5},
            {4.5, 5.5, 6.5},
            {7.5, 8.5, 9.5}
        };
        System.out.println("Sum of double array: " + sumArray(doubleArray));
    }
}

