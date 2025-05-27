class Circle {
    public double x, y;
    public double r;

    public double circumference() {
        return 2 * 3.14 * r;
    }
    public double area() {
        return 3.14 * r * r;
    }
    public double distance(Circle other) {
        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
    }
}

public class bgm {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c1.x = 2;
        c1.y = 3;
        c1.r = 5;

        c2.x = 8;
        c2.y = 6;
        c2.r = 4;

        System.out.println("C1 Çevre: " + c1.circumference());
        System.out.println("C1 Alan: " + c1.area());
        System.out.println("C2 Çevre: " + c2.circumference());
        System.out.println("C2 Alan: " + c2.area());

        System.out.println("Merkezler Arasindaki Mesafe: " + c1.distance(c2));
    }
}