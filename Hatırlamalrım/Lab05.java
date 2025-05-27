/* Write the definition of two methods to evaluate the summation of the elements of an array. 
One for integer array.
Another for a float array.
Both methods will have same name.
The methods should return the summation
*/

/* bu sınıf kendi içinde kullanılacak küçük bir sınıf ise ve başka yerlerden erişilmesine gerek yoksa class lab05 da yeterli olur. */
    class lab05 {
    public static int sumArray(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    } /*return deyince, metodun sonucu başka yerlerde kullanılabilir hale geliyor. Yani "şu sonucu dışarı gönderiyorum" demek. */
    

    public static float sumArray(float[] array) {
        float sum= 0.0f;
        for (int i = 0;i<array.length;i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        System.out.println("Sum of the integer arrays is: "+sumArray(intArray));

        float[] floatArray = {1.5f,2.5f,3.5f,4.5f,5.5f};
        System.out.println("Sum of the float array is: "+sumArray(floatArray));

    }
}