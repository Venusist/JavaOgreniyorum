/*
We have a class named Circle already defined.
Define a class named BoxCircle inheriting the class Circle.
The shape of an object of the class BoxCircle is shown below.
Declare the necessary instance variables in the class BoxCircle.
Define a constructor for the class BoxCircle.
Define a method named area() to calculate and return the area of a BoxCircle object.
In the main function create an object of the class BoxCircle. Call the area() method to print it’s area.
 */

 class Circlee {
    public double r;
    
    Circlee(double r1) {
        r=r1;
    }
    public double area() {return 3.1416 * r*r ;
    }
 }

 class BoxCircle extends Circlee {
        public double width;
        public double height;

        BoxCircle(double r, double w, double h) {
            super(r);
            width=w;
            height = h;
        }

        public double area() {
            double circleArea = super.area();
            double rectangleArea = width*height;
            return circleArea + rectangleArea;
        }
 }

 public class LabTask4 {
    public static void main(String[] args) {
        BoxCircle bc = new BoxCircle(2,4,5);
        System.out.println("Toplam alan: "+bc.area());
    }
 }