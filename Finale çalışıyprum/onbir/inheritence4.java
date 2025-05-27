//using super to call superclass constructors

class Box {
    double length;
    double width;
    double depth;
    Box(double l, double w, double d) {
        length= l ;
        width = w;
        depth = d;

    }
}

class BoxWeight extends Box {
    double weight;
    BoxWeight(double l, double w, double d, double wgt) {
        super(l , w ,d ); //Bu, üst sınıf olan Box sınıfının constructor'ını çağırıyor ve length, width, depth değişkenlerini orada ayarlıyor.
        weight = wgt; //BoxWeight sınıfına özgü ağırlık değişkenini ayarlıyor.
    }
}

public class inheritence4 {
    public static void main (String[] args) {
        BoxWeight ob = new BoxWeight(3,2,1,5);
        System.out.println(ob.length);
    }
} 
/* BoxWeight sınıfından bir nesne (ob) yaratılıyor.
Ölçüler 3, 2, 1 ve ağırlık 5 olarak constructor'a veriliyor.
super(l, w, d); satırı sayesinde length, width, depth Box sınıfında atanıyor.
ob.length ekrana yazdırılıyor, yani 3 yazacak. */