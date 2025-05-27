public class onbesarrays {
    public static void main(String[] args) {
        
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);//outputs 4
        // Now outputs Opel instead of Volvo
//To change the value of a specific element, refer to the index number:
//cars[0] = "Opel";

//LOOOOOP THROUGH ARRAY
    String[] carss = {"tofaş", "eşek", "araba", "kamyon"};
    for (int i = 0; i < carss.length; i++) {
    System.out.println(carss[i]);
}
/* Dizilerde, .length dizinin toplam eleman sayısını verir (4) ve indexler 0'dan başlayarak son elemana (3) kadar devam eder, 
bu yüzden i < carss.length koşulu ile döngü, tüm elemanları yazdırır.0.tofaş olduğu için sıkıntı çıkmıyo */



/*There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:
 * String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
 */
    }
    
}
