/*
Defined a class named Point to represent a point in 2D space
write definiton of a method such that:
    Name of the method is midPoint
    It takes two obj of type Point as parameters
    The method will calculate the middle point between the tqo points taken as parameter
    The result will be assigned to a new object of type Point and the new object will be returned by method
 */


class Point {
    double x;
    double y;
    
    public Point(double x1, double y1) {
        x = x1;
        y = y1;
    }
}
    public class HomeTask1 {

        static Point midPoint(Point p, Point q) {
            double mx,my;
            mx=(p.x + q.x)/2;
            my=(p.y + q.y)/2;
            Point m = new Point(mx,my);
            return m;
        }
        public static void main(String[] args) {
            Point p1 = new Point(1,1);
            Point p2 = new Point(3,3);
            Point p3;

            p3=midPoint(p1,p2);
            System.out.println("Midpoint is: ("+p3.x+" ," +p3.y + ")");

        }

    }