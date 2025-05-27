class Box {
    double width;
    double height;
    double depth;
    //Bu sınıfın şu anlık sadece verisi var, metodu yok.
}

//This class declares an object of type Box ana sınıfımızdır
class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();     // Box türünde nesne oluşturduk
        Box myBox2 = new Box();
        double vol;

        myBox.width = 10;          // Özellikleri atıyoruz
        myBox.height = 20;
        myBox.depth = 15;

        myBox2.width = 1;          // Özellikleri atıyoruz
        myBox2.height = 2;
        myBox2.depth = 5;


        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Volume of myBox is " + vol);

        vol = myBox2.width * myBox2.height * myBox2.depth;
        System.out.println("Volume of myBox2 is " + vol);
        // Hacmi yazdırdık
    }
}

//YA DA DAHA İYİSİ 

/*  
   class Box {
    double width;
    double height;
    double depth;
!!!!!!!!!!!!!!!!!!!!!!
    double calculateVolume() {
        return width * height * depth;
    }
        ve main kısmı şöyle biter 
         System.out.println("Volume of myBox is " + myBox.calculateVolume());
}

*/
