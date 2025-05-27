class Box {
    double width;
    double height;
    double depth;
}

    public class ReferenceExample {
        public static void main(String[] args) {
            Box kutu1 = new Box();
            // b1 bir Box nesnesini referans ediyor

            kutu1.width = 5;
            kutu1.height =10;
            kutu1.depth=15;


            Box kutu2 = kutu1; // b2 de aynı Box nesnesini referans ediyor (yeni bir nesne yok!)

             // kutu2 üzerinden bir değişiklik yapalım
             kutu2.width = 100;

             System.out.println("kutu1 width = "+kutu1.width);//100
             System.out.println("kutu2 width = "+ kutu2.width);//100

             kutu1 = null;

             System.out.println("kutu2 width after kutu1 null= "+ kutu2.width);//100

              // b1 artık nesneye ulaşamaz, ama nesne hala b2 ile erişilebilir
        // System.out.println(b1.width); // bu satır hata verir çünkü b1 artık null
        }
    }

    /*
     📌 Neden b1 ulaşamıyor ama b2 hâlâ ulaşabiliyor?
     🧠 Çünkü:
b1 ve b2 nesnenin kendisini değil, o nesneye giden yolu (referansı) tutuyor. Yani Box nesnesi bellekte bir yerde duruyor ve b1 ile b2 onun adresini (yerini) biliyor.

şu satır şuu yapıyor 
Box b2 = b1;
"Hey b2, sen de b1’in gösterdiği nesneyi göster."

Yani b1 ve b2, aynı adresi tutuyorlar → aynı nesneye bakıyorlar.


b1 = null;
"b1 artık hiçbir nesneyi göstermesin. Elindeki adresi unut."

Ama bu sırada b2, o adresi hâlâ tutuyor. Yani nesneye hala erişebilen bir yol var, o da b2.


     */