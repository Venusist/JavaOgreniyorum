/* In an array we have 10 objects of Class Circle 
Find out the index of the object which has the minimum radius(r)
BUNA TEKRAR BAAAAAAAK GELİŞTİRRR
 */

 class Circle {
    public double r;

    Circle(double r1) {
        r = r1;
    }

    public double area() {
        return 3.1416*r*r;
    }
 }

 public class indexwithsmallest {
    public static void main(String[] args) {

        Circle circles[] = new Circle[10];
        for (int i = 0; i < 10; i++) {
            circles[i] = new Circle(i+1); //or take input
        }

        double min = circles[0].r;
        int index=0;
        for(int i=0;i<10;i++) {
            if(circles[i].r<min){
                min=circles[i].r;
                index=i;
                //index → Şu anki en küçük yarıçapın bulunduğu indeksi tutar.
            }
        }
        System.out.println(index);
    }
 }