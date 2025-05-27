/*Java'da dizi (array) sadece int, double gibi sayıları değil, nesneleri de tutabilir.
Bu örnekte biz 4 tane Circle nesnesini tutacak bir dizi oluşturuyoruz. */

class Circle {
    public double r;

    Circle(double r1){
        r = r1;
    }

    public double area() {
        return 3.1416 * r * r;
    }
}

public class arrayofobj {
    public static void main(String[] args) {

     Circle circles[] = new Circle[4];
     /*Bu satır: Circle türünden 4 elemanlık boş bir dizi oluşturur.
Ama dikkat: Bu nesneler henüz oluşturulmadı, sadece yerleri hazırlandı! */

     circles[0] = new Circle(7); //indekse yarıçapı 7 olan bir çember yerleştiriyor
     circles[3]=new Circle(1); //indekse yarıçapı 1 olan bir çember yerleştiriyor
     //(1 ve 2. indekslere henüz bir şey atanmadı.)

     double a = circles[3].area();
     System.out.println(a);   
    }
}