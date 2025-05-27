

/* We have 10 integer numbers in a n array. Write a Java program to sort the numbers in the array (smallest to largest)*/


public class Lab07 {
    public static void main(String[] args) {
        int numbers[] = {25,47,12,69,5,7,34,87,1,55};

        int n = numbers.length;
        for( int i = 0; i<n-1;i++) {
            for(int j= 0; j<n-i-1;j++) {
                if ( numbers[j] > numbers[j+1]) {
                    //numbers[j] > numbers[j+1] ise: demek ki önceki sayı daha büyük. O zaman bunların yerini değiştir.
                    int temp = numbers[j];
                numbers[j] = numbers[j+1];
                numbers[j+1]=temp;
                }
            }
        }

        System.out.print("Sorted array : ");
        for (int num: numbers) {
            System.out.print(num + " ");
        }
    }
}