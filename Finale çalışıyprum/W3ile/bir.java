public class bir {
    int x=5; 
/*Bu satırda, x değişkeni sınıfın içinde ama static olmayan bir değişken olarak tanımlanmıştır. 
Yani bu değişken her Main nesnesi için ayrı ayrı vardır. */

    public static void main(String[] args) {
        bir myObj = new bir(); // myObj adında bi nesne oluşturduk Artık myObj içinde bir x değişkeni var (değeri 5).
        System.out.println(myObj.x); //Burada myObj nesnesinin içindeki x değişkenine ulaşılıyor ve yazdırılıyor. Çünkü x değişkeni nesneye aittir.
    }
  }
    /* Java'da x değişkeni sınıfa (class’a) değil, o sınıftan oluşturulan nesneye (object’e) aittir. Bu yüzden x değişkenine ulaşmak için önce o nesneye ulaşmamız gerekiyor.
main metodu static. Static metotların içinde non-static (yani nesneye ait) bir değişkene doğrudan erişilemez. Çünkü static metotlar çalışırken henüz nesne yaratılmamış olabilir.

Eğer x de static olsaydı, o zaman nesneye gerek kalmazdı:
public class Main {
  static int x = 5;

  public static void main(String[] args) {
    System.out.println(x); // ✅ Bu çalışır
  }
}

 */