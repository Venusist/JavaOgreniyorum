/* 
We have defined a class named COmplex to represent complex numbers x+yi,
Write the definiton of a member method for this class such that 
    Name of method is add
    it takes obj of type Complex as parameter
    Method will calculate the addiyion of the number reoresebted by itself
    the result will be returned by the method
 */

 class Complex {
    double x;
    double y;

    public Complex(double x1, double y1) {
        x= x1;
        y=y1;
    }
    public void show() {
        System.out.println(x+"+"+y+"i");
    }
    public Complex add(Complex n) {
        double sumx,sumy;
        sumx=x+n.x;
        sumy=y+n.y;
        Complex t = new Complex(sumx, sumy);
        return t;
    }
 }

 public class LabTask3 {
    public static void main(String[] args) {
        Complex n1 = new Complex(2,3);
        Complex n2 = new Complex(4,1);
        Complex n3;
        n3=n1.add(n2);
        n3.show();
    }
 }