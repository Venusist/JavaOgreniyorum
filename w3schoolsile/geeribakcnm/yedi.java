public class yedi {
    public static void main(String[] args){

        int x = 10;
        int y = 20;
        int z = x + y; 
        System.out.println("z: " + z); // Çıktı: z: 30

        String a = "10";
        String b = "20";
        String c = a + b; 
        System.out.println("c: " + c); // Çıktı: c: 1020
/* toplama yapmaz, birleştirme (concatenation) yapar. */

        String d = String.valueOf(x + y); // veya "" + (x + y)
        System.out.println("d: " + d); // Çıktı: d: 30
        /* String.valueOf() bu bir standart kütüphanemizdeki fonksiyon bu yüzden işlem yapar sıkıntı olmaz string demesine rağmen */

}
}

/* Kod	Açıklama	Sonuç
String c = "10" + "20";	String + String → birleştir	"1020"
String d = String.valueOf(10 + 20);	Önce topla, sonra string yap	"30"
String d = "" + 10 + 20;	Soldan sağa ekler → "1020"	"1020" Yani burada ilk operand bir string olduğu için her şey birleştirme olarak devam ediyor.
String d = 10 + 20 + "";	Önce sayılar toplanır, sonra eklenir	"30"
 */