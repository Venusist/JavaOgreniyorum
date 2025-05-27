/*
Lab Task
Define the circle class. Define two constructors
One takes only radius as parameter (center will be (0,0)).
Another one takes radius and center as parameters.
Create two objects.
One providing only the radius.
Another one providing radius and center.
Print the area of the circle objects calling the appropriate member function. 
 */

 class Circle {
    public double x, y;  // Merkez koordinatları (x, y)
    public double r;  // Çap (radius)

    // Çap parametresi ile sadece merkez (0, 0) alacak constructor
    Circle(double radius) {
        r = radius;
        x = 0;  // Merkez x koordinatı
        y = 0;  // Merkez y koordinatı
    }

    // Çap ve merkez koordinatları parametresi alacak constructor
    Circle(double radius, double centerX, double centerY) {
        r = radius;
        x = centerX;
        y = centerY;
    }

    // Alan hesaplayan metod
    public double area() {
        return 3.14 * r * r;  // Alan: π * r^2
    }
}


    public class Lab03 {
        public static void main(String[] args) {
            // sadece çap vererek circle nesnesi oluşturma
            Circle circle1 = new Circle(5);
            System.out.println("Circle 1 area : "+circle1.area());

        // Çap ve merkez koordinatları vererek Circle nesnesi oluşturma
        Circle circle2 = new Circle(5, 2, 3);
        System.out.println("Circle 2 area: " + circle2.area());

        }
    }

