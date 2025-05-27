/* define the circle class, create two objects, determine whether the circles overlap or not */
/* Daire sınıfını tanımlayın. İki nesne oluşturun.
Dairelerin örtüşüp örtüşmediğini belirleyin*/
/*👉 İki dairenin merkezleri arasındaki mesafe
↪️ Eğer bu mesafe yarıçaplarının toplamından küçük ya da eşitse,
🔔 Kesişirler (overlap ederler). */


public class Lab01Circle {
    double x,y;
    double r;

    public Lab01Circle(double x,double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double distanceTo(Lab01Circle other) {
        return Math.sqrt(Math.pow(this.x-other.x,2)+Math.pow(this.y-other.y,2));
    }

    public boolean isOverlapping(Lab01Circle other) {
        double centerDistance = this.distanceTo(other);
        double totalRadius = this.r+other.r;
        return centerDistance <= totalRadius;
    }

    public static void main(String[] args) {
        Lab01Circle c1 = new Lab01Circle(0, 0, 5);
        Lab01Circle c2 = new Lab01Circle(3, 4, 5);


        if (c1.isOverlapping(c2)) {
            System.out.println("Daireler birbirini kesiyor");
        } else {
            System.out.println("Daireler birbirini kesmiyor");
        }
    }
}