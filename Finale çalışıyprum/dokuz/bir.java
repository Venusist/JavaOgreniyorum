class Circle {

    public double radius;
    Circle(double r) {
        radius = r;
    }
    void method(Circle c) {
        System.out.println(radius);
        System.out.println(c.radius);

    }
}


public class bir {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        c2.method(c1);
    }
}