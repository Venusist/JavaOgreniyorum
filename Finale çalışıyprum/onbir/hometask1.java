
/* 
Defined a class named Point to represent a point in 2D space.
Write the definition of a method such that:
Name of the method is midPoint.
It takes two objects of type Point as parameter.
The method will calculate the middle point  between the two points taken as parameter.
The result will be assigned to a new object of type Point and the new object will be returned by the method. 

2B (iki boyutlu) uzayda bir noktayı temsil eden Point adında bir sınıf tanımladın.
Şimdi senden istenen:
Adı midPoint olan bir metot tanımla.
Bu metot, iki tane Point türünde nesne almalı (parametre olarak).
Bu metot, bu iki nokta arasındaki orta noktayı (middle point) hesaplamalı.
Hesaplanan orta nokta, yeni bir Point nesnesine atanmalı.
Ve bu yeni nesne, metot tarafından geri döndürülmeli.

*/

class Point {
    double x;
    double y;
    //x ve y: Noktanın koordinatlarını tutan değişkenler. private oldukları için sadece Point sınıfı içinden erişilebilir.
    
    public Point(double x1, double y1) {
        x=x1;
        y=y1;
    }
}
    public class hometask1 {
        static Point midPoint(Point p, Point q) {
            double mx,my;
            mx=(p.x + q.x) / 2 ;
            my=(p.y + q.y) / 2 ;
            Point m = new Point(mx,my);
            return m;
        }

        public static void main(String[] args){
            Point p1 = new Point(1,1);
            Point p2 = new Point(3,3);
            Point p3;
            p3 = midPoint(p1,p2);
            System.out.println("Midpoint is : ("+p3.x+ ","+p3.y+")");
        }
    }