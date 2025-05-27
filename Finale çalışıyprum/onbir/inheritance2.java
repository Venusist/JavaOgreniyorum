
class A {
    int i , j ; // A sınıfının iki tane değişkeni var

    // i ve j'nin değerlerini ekrana yazdıran metot
    void showij() {
        System.out.println("i and j: " + i + " " + j );
    }
}

// Alt sınıf (subclass) - A'dan kalıtım alır
class B extends A {
    int k ; // B sınıfına özgü bir değişken

    // k değerini yazdırır
    void showk() {
        System.out.println("k: " + k);
    }

    // i + j + k toplamını yazdırır
    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}

// Programın çalıştırıldığı ana sınıf (dosya adınla aynı olmalı)
public class inheritance2 {
    public static void main(String[] args) {

        // A sınıfından bir nesne oluşturuluyor
        A superOb = new A();

        // B sınıfından bir nesne oluşturuluyor (B sınıfı A'dan kalıtım aldığı için A'nın tüm özelliklerini kullanabilir)
        B subOb = new B();

        // superOb için i ve j değerlerini atıyoruz
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.showij(); // sadece i ve j yazdırılır (çünkü A sınıfından)
        System.out.println();

        // subOb için i, j ve k değerlerini atıyoruz
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;

        System.out.println("Contents of subOb: ");
        subOb.showij();  // A sınıfından miras alındı
        subOb.showk();   // B sınıfına özgü
        System.out.println();

        System.out.println("Sum of i, j, k in subOb: ");
        subOb.sum();     // i + j + k toplar
    }
}
