 /* Here, Box uses a parameterized constructor to 
   initialize the dimensions of a box. 
*/

class Box {
    double width;
    double height;
    double depth;

// Parametreli constructor
     // This is the constructor for Box
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //compute and return volume
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String[] args ){
            // Parametreli constructor ile nesneleri oluşturuyoruz
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box(3,6,9);

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume(); 
        System.out.println("Volume is " + vol); 
    }
}
/*
 * 🌟 Nasıl Çalışır?
 * Box mybox1 = new Box(10, 20, 15);
Burada 10, 20, ve 15 parametrelerdir ve bu değerler constructor’a (yapıcı metoda) iletilir. Bu parametreler sırasıyla w, h, d parametrelerine atanır ve bu değerler width, height, depth gibi instance değişkenlerine aktarılır.
 
📍 Önemli Notlar:
Constructor sınıfın ismiyle aynı olmalıdır.
Return type olmaz. Çünkü constructor bir değer döndürmez, nesne oluşturur.
Parametreli constructor ile nesneleri oluşturduğumuzda, her nesne için farklı değerler belirleyebiliriz.
*/