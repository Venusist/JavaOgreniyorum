class Circle {
    private double x, y, radius;  // private yaparak dışarıdan doğrudan erişimi engelledik

    // Constructor
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Getter metodları
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    // distance metodunu static yapmaya devam edebiliriz
    public static double distance(Circle c1, Circle c2) {
        // İki çemberin merkezleri arasındaki mesafe
        return Math.sqrt(Math.pow(c2.getX() - c1.getX(), 2) + Math.pow(c2.getY() - c1.getY(), 2));
    }
}

public class Main {
    public static void main(String[] args) {
        
        Circle circle1 = new Circle(1.0, 2.0, 5.0);
        Circle circle2 = new Circle(4.0, 6.0, 3.0);

        double dist = Circle.distance(circle1, circle2);

        System.out.println("The distance between centers of the circle is " + dist); 
    }
}
