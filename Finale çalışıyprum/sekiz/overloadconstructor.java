class Box {
    double width;
    double height;
    double depth;

    //// 1. Constructor - 3 parametreli: Boyutları kullanıcı belirler.
    Box(double w, double h, double d) {
        System.out.println("uclu constructor çalisti.");
        width = w;
        height = h;
        depth = d;
    }

    //// 2. Constructor - Parametresiz: Tüm boyutları 0 olarak ayarlar.
    Box() {
        System.out.println("Parametresiz constructor çalıştı.");
        width = 0;
        height = 0;
         depth = 0;
    }

    // // 3. Constructor - Tek parametreli: Tüm boyutlara aynı değeri verir (küp kutu).
    Box(double len) {
        width = height = depth = len;
    }

    //kutunun hacmini hesaplar
    double volume() {
        return width*height*depth;
    }
}


// Uygulama sınıfı
    public class overloadconstructor {
        public static void main(String[] args) {
                // 1. Üçlü parametreli constructor ile kutu oluştur
                Box box1 = new Box(2, 3, 4);  // width=2, height=3, depth=4
                System.out.println("Box1 hacim: " + box1.volume());
        
                // 2. Parametresiz constructor ile kutu oluştur (tüm boyutlar 0)
                Box box2 = new Box();         // width=0, height=0, depth=0
                System.out.println("Box2 hacim: " + box2.volume());
        
                // 3. Tek parametreli constructor ile kutu oluştur (küp kutu)
                Box box3 = new Box(5);        // width=5, height=5, depth=5
                System.out.println("Box3 hacim: " + box3.volume());
            
            // ya da vol = mybox1.volume yapıyoduk ya o şekilde de print ettirebilirsin slaytta öyle bi bak
            }
        }
        /* 💡 Ekstra Açıklama:
Constructor Overloading → Aynı isimli (Box) ama farklı parametreli yapıcılar tanımlayarak farklı şekillerde nesne üretebilmeni sağlar.
new Box(…) → Hangi constructor’a parametre uyuyorsa, Java otomatik onu çağırır. */