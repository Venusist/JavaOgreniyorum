class Circle {
    public double x, y, r;
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double circumference() {
        return 2 * 3.14 * r;
    }

    public double area() {
        return 3.14 * r * r;
    }

    public static double distance(Circle c1, Circle c2) {
        return Math.sqrt(Math.pow(c2.x - c1.x, 2) + Math.pow(c2.y - c1.y, 2));
    }
}

public class bugunkiders {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2, 3, 5);
        Circle circle2 = new Circle(7, 1, 4);

        double dist = Circle.distance(circle1, circle2);
        System.out.println("Distance between centers: " + dist);

        System.out.println("Circle 1 - Circumference: " + circle1.circumference() + ", Area: " + circle1.area());
        System.out.println("Circle 2 - Circumference: " + circle2.circumference() + ", Area: " + circle2.area());
    }
}
