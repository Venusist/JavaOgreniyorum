/* 
We have a class named Circle already defined.
Define a class named BoxCircle inheriting the class Circle.
The shape of an object of the class BoxCircle is shown below.
Declare the necessary instance variables in the class BoxCircle.
Define a constructor for the class BoxCircle.
Define a method named area() to calculate and return the area of a BoxCircle object.
In the main function create an object of the class BoxCircle. Call the area() method to print it’s area.
 
🟡 Soru:
Zaten tanımlanmış bir Circle sınıfı var (yani bir daireyi temsil eden sınıf).
Senin yapman gereken:

🟣 Yapılacaklar:
BoxCircle adında yeni bir sınıf tanımla.
Bu sınıf, Circle sınıfından kalıtım almalı (yani extends Circle olacak).
BoxCircle sınıfı, aşağıdaki şekle sahipmiş:
Yani bu sınıf dairenin etrafını çevreleyen kareyi/çerçeveyi (kutuyu) temsil ediyor olabilir. (Çizim olmadığı için bunu varsayıyoruz.)
BoxCircle içinde gerekli değişkenleri tanımla.
(Bu, büyük ihtimalle yarıçap gibi şeyler olacak.)
BoxCircle için bir yapıcı metot (constructor) yaz.
(Yani public BoxCircle(...) gibi.)
area() adında bir metot yaz.
Bu metot, BoxCircle nesnesinin alanını hesaplayıp döndürecek.
main fonksiyonunda:
Bir BoxCircle nesnesi oluştur.
area() metodunu çağır ve sonucu ekrana yazdır.

🍯 Ekstra Not:
Eğer Circle sınıfı zaten yarıçapı içeriyorsa (radius), BoxCircle için ayrı bir değişken yazmana gerek olmayabilir. BoxCircle sadece Circle'ı miras alır ve ek olarak kutunun (karenin) alanını hesaplar.

*/

class Circle {
    public double r;
    Circle(double r1) { // yapıcı (constructor)
        r = r1;   
    }
    public double area() {
        return 3.1416 * r * r;
    }
}
// BoxCircle sınıfı - Circle sınıfından miras alır
class BoxCircle extends Circle {
    public double width; 
    public double height;

    // BoxCircle yapıcısı (hem daire hem kutu için değer alır)
    BoxCircle(double r, double w, double h) {
        super(r);         // daire (üst) kısmın yarıçapını üst sınıfa gönder
        width = w;
        height = h;
    }

    // Toplam alan = daire alanı + dikdörtgen alanı
    public double area() {
        double circleArea = super.area(); 
        double rectangleArea = width * height;
        return circleArea + rectangleArea;
    }
}

public class Labtask {
    public static void main(String[] args) {
        // BoxCircle nesnesi oluştur (örnek: r = 2, w = 4, h = 5)
        BoxCircle bc = new BoxCircle(2, 4, 5);
        System.out.println("Toplam alan: " + bc.area());
    } }