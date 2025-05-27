/* In an array we have 10 integer numbers. 
Write a Java program to find and print the smallest number in the array. */

public class Lab08 {
    public static void main(String[] args) {
        int numbers[] = {25, 47, 12, 89, 5, 33, 19, 41, 7, 55}; // Örnek dizi
        int min = numbers[0]; // İlk elemanı en küçük kabul ediyoruz

        for (int i = 1; i < numbers.length; i++) { // Diziyi dolaş
            if (numbers[i] < min) { // Daha küçük bir sayı bulursa güncelle
                min = numbers[i];
            }
        }

        System.out.println("Smallest number in the array: " + min);
    }
}
