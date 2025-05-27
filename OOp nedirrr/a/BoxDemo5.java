class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    //sets dimensions of box
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth=d;
        //setDim ismi hazır değil btw istersen ayarcek() de dersin LOL
    //Java’da bir sınıfa yazdığın metot isimlerini kendin belirlersin.
    }
}

public class BoxDemo5 {
    public static void main(String[] args) {
        
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //initialize eaxh box
        mybox1.setDim(10,20,15);
        mybox2.setDim(3,6,9);

        //get volume of first box 
        vol = mybox1.volume();
        System.out.println("Volume is "+vol);

        vol = mybox2.volume();
        System.out.println("Volume is "+vol);
    }
}

/* OR

  public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        System.out.println("mybox1 hacmi: " + mybox1.volume()); // 3000
        System.out.println("mybox2 hacmi: " + mybox2.volume()); // 162
    }
}
 */


 //ŞİMDİ ŞU MEVZUYA GELELİM

 /* 

 🔄 this Ne İşe Yarıyor? — Kafaları Karıştıran Kısım
 Sen şöyle bir metot yazarsan:
 void setDim(double width, double height, double depth) {
    width = width;
    height = height;
    depth = depth;
}

Bu HİÇBİR İŞE YARAMAZZZZ çünkü Java burada hangi width hangisi anlayamaz.
Yani parametre ile nesne değişkeni çakışıyor.


bu yüzdennn this kullanırız 
void setDim(double width, double height, double depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
}
Burada olan şey:
this.width → kutunun içindeki (class'ın) değişken
width → metoda gelen değer (parametre)

Bu durumda: “kutunun içindeki width değişkenine, metoda gelen width değerini ata” demek oluyor.

🤓 Peki w, h, d yapsaydık ne olurdu?
java
Kopyala
Düzenle
void setDim(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
}
Bu da gayet çalışır çünkü bu sefer çakışma yok.
w parametresi → width değişkenine atanıyor, sıkıntı yok.
Ama diyelim ki değişkenlerin adını aynı yapmak istiyorsun — işte o zaman this şart.

YAAAAAAAAAAAANİ CNM

// This program uses a parameterized method with `this`.
class Box {
    double width;
    double height;
    double depth;

    // compute and return volume
    double volume() {
        return width * height * depth;
    }

    // sets dimensions of box using `this`
    void setDim(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}

class BoxDemo5 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // initialize each box
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}

 */