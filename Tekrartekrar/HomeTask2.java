/* 
Defined a class named Point to represent a point in 2D space
Write the definiton of a member method for this class such that:
    Name of the method is midPoint
    It takes an object of type Point as parameter
    The method will calculate the middle point between the points represebted by itseld and the oaraater
The result will be asssined to a new object ıf tyoe Oışbr and the new Ibject will be returned bt the metgod
 */

class Pointt {
    double x;
    double y;

    public Pointt(double x1,double y1) {
        x = x1;
        y = y1;
    }

    Pointt midPoint(Pointt p) {
        double mx,my;
        mx=(x+p.x)/2;
        my=(y+p.y)/2;

        Pointt m = new Pointt(mx,my);
        return m;
    }
}

public class HomeTask2 {
    public static void main(String[] args){
        Pointt p1 = new Pointt(1,1);
        Pointt p2 = new Pointt(3,3);
        Pointt p3;
        p3= p1.midPoint(p2);
        System.out.println("Midpoint is : ("+p3.x+" , "+p3.y +")");
    }
}

