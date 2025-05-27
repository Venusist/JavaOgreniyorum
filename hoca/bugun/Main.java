// Main.java
public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[10];

        // 1'den 10'a kadar yarıçaplarla daireler oluşturuluyor
        for (int i = 0; i < 10; i++) {
            circles[i] = new Circle(i + 1);
        }

        // Yarıçapların ortalaması hesaplanıyor
        double r1 = 0;
        for (int i = 0; i < 10; i++) {
            r1 = r1 + circles[i].r;
        }
        r1 = r1 / circles.length;

        // Ortalama yarıçapla yeni bir daire oluşturuluyor
        Circle c1 = new Circle(r1);

        // Bu dairenin alanı yazdırılıyor
        System.out.println("Ortalama yarıçaplı dairenin alanı: " + c1.area());
    }
}
  