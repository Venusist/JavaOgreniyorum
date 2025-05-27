class StaticTest {
    static int b = 99; // static: tüm nesneler için ortak
}
/* b adlı bir static değişken tanımlanmış.

Bu demek oluyor ki: hangi nesne değiştirirse değiştirsin, hepsi aynı b değişkenini paylaşır. */
public class Main {
    public static void main(String args[]) {
        StaticTest obj1 = new StaticTest();
        StaticTest obj2 = new StaticTest();
        //İki tane StaticTest nesnesi oluşturuluyor: obj1 ve obj2. Ama bunlar aynı static değişkeni paylaşır.

        StaticTest.b = 5;
        System.out.println("b = "+obj1.b);
        /*StaticTest.b = 5; → sınıf adıyla static değişken güncelleniyor.
obj1.b derken, aslında yine StaticTest.b demekle aynıdır.
Ekrana 5 yazdırılır. */

        obj1.b = 11;
        System.out.println("b = "+obj2.b);
        /*obj1.b = 11; gibi görünse de, aslında bu da StaticTest.b = 11; demektir. Yani obj1 üzerinden erişiliyor ama tüm sınıf etkileniyor.
Dolayısıyla obj2.b de 11 olur.
Ekrana 11 yazdırılır. */
    }
}
//static değişkenler nesneye özel değildir, tüm nesneler tarafından ortaklaşa kullanılır.
//Nesne üzerinden değiştirsen bile, aslında sınıfın ortak static değişkeni değişmiş olur.

