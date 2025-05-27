// Circle (Daire) sınıfı
/*Define the circle class.
Create two objects.
Calculate distance between the centers of the two */
public class Lab02 {
    double x, y;  // Dairenin merkezi
    double r;     // Dairenin yarıçapı

    // Yapıcı metod (Constructor) ile daireyi başlatıyoruz
    public Lab02(double x, double y, double r) {
        this.x = x;  // Dairenin x koordinatını atıyoruz
        this.y = y;  // Dairenin y koordinatını atıyoruz
        this.r = r;  // Dairenin yarıçapını atıyoruz
    }

    // İki dairenin merkezleri arasındaki mesafeyi hesaplayan metod
    public double distanceTo(Lab02 otherLab02) {
        // Öklidyen mesafe formülü
        return Math.sqrt(Math.pow(this.x - otherLab02.x, 2) + Math.pow(this.y - otherLab02.y, 2));
    }

    // Main metod
    public static void main(String[] args) {
        // İlk daire nesnesi (merkez: (0, 0), yarıçap: 5)
        Lab02 circle1 = new Lab02(0, 0, 5);
        
        // İkinci daire nesnesi (merkez: (3, 4), yarıçap: 3)
        Lab02 circle2 = new Lab02(3, 4, 3);

        // Daireler arasındaki mesafeyi hesaplıyoruz
        double distance = circle1.distanceTo(circle2);

        // Sonucu ekrana yazdırıyoruz
        System.out.println("The distance between the centers of the two circles is: " + distance);
    }
}
