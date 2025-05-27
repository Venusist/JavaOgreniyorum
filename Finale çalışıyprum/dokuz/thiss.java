class Tes {
    private int a;// 'a' değişkeni private, sadece bu sınıf içinde erişilebilir.

    // 'a' değişkenine değer atamak için setter metodu
    public void set_a(int a) {
        this.a = a; // burada 'this.a' sınıfın değişkeni, sağdaki 'a' ise parametre
    }

     // 'a' değişkeninin değerini almak için getter metodu
    public int get_a() {
        return a;
    }
}

public class thiss {
    public static void main(String[] args) {
        Tes ob = new Tes(); // Test sınıfından bir nesne oluşturduk
        ob.set_a(5);      // nesnenin 'a' değişkenine 5 değeri atandı
        System.out.println(ob.get_a()); //// 'a'nın değeri ekrana yazdırıldı (5)
    }
}