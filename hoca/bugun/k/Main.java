class Complex {
    private double x;
    private double y;

    public Complex(double x1, double y1) {
        x = x1;
        y = y1;
    }
    public void show() {
        System.out.println(x + "+" + y + "i");
    }

    public Complex add(Complex n) {
        double newX = x + n.x;
        double newY = y + n.y;
        return new Complex(newX, newY);
    }
}
public class Main {
    public static void main(String[] args) {
        Complex n1 = new Complex(2, 3);
        Complex n2 = new Complex(4, 1);
        Complex n3;

        n3 = n1.add(n2); 
        n3.show();
    }
} 