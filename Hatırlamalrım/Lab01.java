public class Lab01 {
    public double x, y;
    public double r;

    // Constructor ekleyerek daireyi daha düzgün bir şekilde başlatabiliriz
    public Lab01(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public static void main(String[] args) {
        // Lab01 sınıfından c1 ve c2 adında iki daire nesnesi oluşturuyoruz
        Lab01 c1 = new Lab01(0, 0, 5);  // (0,0) merkezli ve 5 yarıçaplı daire
        Lab01 c2 = new Lab01(3, 4, 2);  // (3,4) merkezli ve 2 yarıçaplı daire

        // Daireler arasındaki mesafeyi hesaplıyoruz
        double dx = c2.x - c1.x;
        double dy = c2.y - c1.y;
        double distance = Math.sqrt(dx * dx + dy * dy);  // İki merkez arasındaki mesafe

        // İki dairenin toplam yarıçapını hesaplıyoruz
        double totalr = c2.r + c1.r;

        // Eğer mesafe toplam yarıçaptan küçük veya eşitse, daireler örtüşüyor demektir
        if (distance <= totalr) {
            System.out.println("Circles overlap");
        } else {
            System.out.println("Circles do not overlap");
        }
    }
}
