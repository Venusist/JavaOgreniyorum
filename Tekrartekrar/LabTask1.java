/*
Define circle class 
define two constructors
    one takes only radius as parameter(center will be (0,0))
    another one takes radius and center as parameters.
create two OBJECT 
    one providing only the radius
    another one providing radius and center
Print area of the circle objects calling the appropriate member function
 */

class Circle {
    public double x , y;// center of circle
    public double r ;

    //birinci constructor sadece radius alır merkez 0,0 
    Circle(double radius) {
        r = radius;
        x= 0 ;
        y= 0 ; } 

    Circle(double radius,double CenterX, double CenterY) {
        x= CenterX;
        y=CenterY;
        r=radius;    }
    public double area() {
        return 3.14 * r * r;
    
    }
}

public class LabTask1 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(1,2,3);

        System.out.println("Area of c1 : "+c1.area());
        System.out.println("Area of c2 : "+c2.area());
    }
}