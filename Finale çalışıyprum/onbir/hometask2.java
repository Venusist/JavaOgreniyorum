/* 
Defined a class named Point to represent a point in 2D space.
Write the definition of a member method for this class such that:
Name of the method is midPoint.
It takes an object of type Point as parameter.
The method will calculate the middle point  between the points represented by itself (which object calls this method) and the parameter.
The result will be assigned to a new object of type Point and the new object will be returned by the method.


2B uzayda bir noktayı temsil eden Point adlı bir sınıf tanımlandı.
Bu sınıfa ait bir üye metot (member method) tanımla:
Metodun adı: midPoint
Parametresi: Point türünde bir nesne almalı (örneğin otherPoint)
Bu metot kendisini çağıran nesne ile parametre olarak aldığı nesne arasındaki orta noktayı hesaplamalı.
Hesaplanan orta nokta, Point türünde yeni bir nesneye atanmalı ve bu yeni nesne geri döndürülmeli.

*/

class Point{
    double x;
    double y;
    
    public Point(double x1, double y1) {
        x=x1;
        y=y1;
    }

    Point midPoint(Point p) {
        double mx, my;
        mx=(x + p.x) / 2;
        my=( y + p.y) / 2;
        /* 
Bu metodu çağıran nokta ile (örneğin p1)
Parametre olarak gelen nokta (p) arasında
Orta noktayı hesaplıyor ve yeni bir Point nesnesi olarak döndürüyor. */


        Point m = new Point(mx,my);
        return m;
    }
}

public class hometask2 {
    public static void main(String[] args) {
        Point p1 = new Point(1,3);
        Point p2 = new Point(3,3);
        Point p3;

        /* p1 = (1,3) ve p2 = (3,3)
    midPoint() çağrılıyor: p1.midPoint(p2) 
    hesabı şu şekilde oluyor 
    mx = (1 + 3) / 2 = 2  
    my = (3 + 3) / 2 = 3
Yeni nokta: (2, 3) → Bu Point nesnesi olarak döndürülüyor.
    */
        p3=p1.midPoint(p2);
        System.out.println("Midpoint is: ("+p3.x + " " +p3.y + ")");
    }
}