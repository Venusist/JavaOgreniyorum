/* 
 * define circle class and two constructor
One takes only radius as parameter (center will be (0,0)).
Another one takes radius and center as parameters.
Create two objects.
One providing only the radius.
Another one providing radius and center.
Print the area of the circle objects calling the appropriate member function.
 */

 class Circle {
    public double x, y; //ccetner of the circle
    public double r; //radius of circle

    // Constructor 1: Sadece yarıçap verilir, merkez (0,0) olur
    Circle(double radius) {
        x = 0;
        y = 0;
        r = radius;
    }

    // Constructor 2: Yarıçap ve merkez verilir
    Circle(double radius, double centerX , double centerY ) {
        r = radius;
        x = centerX;
        y = centerY;
    }

    //methods to return circumference and area
    public double area() {
        return 3.14*r*r; //pi r kare
    }
    public double circumference() {
        return 2* 3.14 * r;
    }
 }

 public class Labtask {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7,2,3);

        System.out.println("Circle 1 are: "+circle1.area());
        System.out.println("Circle 1 circuference : "+ circle1.circumference());

        System.out.println("Circle2 area: " + circle2.area());
        System.out.println("Circle2 circumference: " + circle2.circumference());
    }
 }