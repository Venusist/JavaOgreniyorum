/* JAVA MODİFİERS HİC Bİ SEY ANLAMADIM ÖNCEMLİ

Java'daki modifiers (değiştiriciler), sınıfların, metodların, ve değişkenlerin erişim seviyelerini ve davranışlarını belirleyen anahtar kelimelerdir. Modifier kullanarak, bir sınıfın, metodun veya değişkenin erişilebilirliğini, davranışını ve diğer özelliklerini kontrol edebilirsiniz. Bu değiştiriciler iki ana kategoriye ayrılır:

1️⃣ Access Modifiers (Erişim Belirleyiciler)
Bu tür değiştiriciler, bir sınıfın, metodun ya da değişkenin nerelerden erişilebileceğini belirler.
Access Modifiers:
public:
Sınıflar için: Her yerden erişilebilir.
Metodlar, Değişkenler, Constructorlar için: Her yerden erişilebilir.

default (Belirtilmezse):
Sınıflar için: Aynı paketteki sınıflar erişebilir.
Metodlar, Değişkenler, Constructorlar için: Aynı paketteki sınıflar erişebilir.

Not: default erişim seviyesi, bir erişim belirleyici belirtilmediğinde otomatik olarak varsayılan olarak kullanılır.

private:
Sınıflar için: Kullanılamaz, çünkü sınıflar yalnızca sınıf dışından erişilebilir (dışarıdan erişilemez).
Metodlar, Değişkenler, Constructorlar için: Sadece tanımlandığı sınıfta erişilebilir.

protected:
Sınıflar için: Kullanılamaz.
Metodlar, Değişkenler, Constructorlar için: Aynı paketteki sınıflar ve alt sınıflar (subclass) erişebilir.

2️⃣ Non-Access Modifiers (Erişim Dışı Belirleyiciler)
Bu tür değiştiriciler, sınıfların, metodların ve değişkenlerin davranışlarını kontrol eder. Bu değiştiriciler, erişim seviyesinden bağımsız olarak ek işlevsellik sağlar.

Non-Access Modifiers:
final:
Sınıflar için: Bu sınıf miras alınamaz (inheritance). Yani, bu sınıftan başka bir sınıf türetilemez.
Metodlar için: Metod değiştirilemez veya override edilemez. Yani alt sınıflar bu metodu değiştiremez.
Değişkenler için: Değişkenin değeri bir kez atandıktan sonra değiştirilemez.

abstract:
Sınıflar için: Bu sınıf soyut bir sınıf olur. Yani, doğrudan nesne oluşturulamaz. Sadece alt sınıfları tarafından kullanılabilir.
Metodlar için: Metodun gövdesi yoktur, sadece declaration (tanım) bulunur. Bu metodu alt sınıflar tamamlamak zorundadır. abstract metodlar sadece soyut sınıflarda bulunur.

static:
Metodlar ve Değişkenler için: Sınıfa ait ve doğrudan sınıfla ilişkili bir özelliktir, nesneye ait değildir. Yani, nesne oluşturmadan çağrılabilir.

transient:
Değişkenler için: Serialization sırasında yok sayılır. Yani, nesne serileştirilirken bu değişkenin değeri kaydedilmez.

synchronized:
Metodlar için: Bu metodun çalışması sırasında yalnızca bir thread (işlem) aynı anda çalışabilir. Thread güvenliği sağlamak için kullanılır.

volatile:
Değişkenler için: Değişkenin değeri thread'ler arasında senkronize edilir. Bu değişken her erişildiğinde ana bellekten okunur. Yani, her thread her zaman en güncel değeri görür.

 
*/
public class yirmisekiz {
    public static final int MAX_VALUE = 100; // final: sabit değer, değiştirilemez
    public static void printMessage() {      // static: sınıfa ait, nesne oluşturulmadan çağrılabilir
        System.out.println("Hello, Java!");
    }

    public static void main(String[] args) {
        printMessage(); // static method çağrılıyor, nesne gerekmez
        System.out.println("Max value: " + MAX_VALUE); // final değişken kullanılıyor
    }
}
