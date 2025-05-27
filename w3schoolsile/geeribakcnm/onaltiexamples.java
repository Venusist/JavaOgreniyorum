public class onaltiexamples {
    public static void main(String[] args) {
        
        int ages[] = {20, 22, 18, 35, 87, 70, 64, 32};
        float avg, sum = 0;
        int length = ages.length;

        // Dizinin elemanlarını toplayarak ortalamayı hesaplıyoruz
        for (int age : ages) {
            sum += age;
        }
        /*int age ifadesi, dizinin her bir elemanını sırasıyla temsil eder.
         Bu her bir eleman, ages dizisindeki değerleri alacaktır.
: işareti burada "her bir elemanı" anlamına gelir. 
Yani age, ages dizisindeki her bir değeri sırasıyla alır ve döngüde işlem yapar.
ages dizisindeki her bir öğe sırasıyla age değişkenine atanır ve döngüde işlem yapılır. */

        avg = sum / (float) length; // float bölme yaptık
        System.out.println("The average age is: " + avg);

        // En küçük yaşı bulma
        int lowestAge = ages[0]; // Aynı diziyi kullanıyoruz

        for (int age : ages) {
            if (lowestAge > age) {
                lowestAge = age;
            }
        }

        System.out.println("The lowest age in the array is: " + lowestAge);
    }
}

