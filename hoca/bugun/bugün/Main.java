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

public class Main {
    public static void main(String[] args) {
        // BoxCircle nesnesi oluştur (örnek: r = 2, w = 4, h = 5)
        BoxCircle bc = new BoxCircle(2, 4, 5);
        System.out.println("Toplam alan: " + bc.area());
    }
}