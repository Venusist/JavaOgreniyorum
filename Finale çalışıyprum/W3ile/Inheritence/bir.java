/* 
💡 Java'da Kalıtım (Inheritance) Nedir?
Java'da bir sınıf başka bir sınıfın özelliklerini (değişkenler) ve davranışlarını (metotlar) devralabilir (inherit).
Bu durumda iki tür sınıf vardır:

🔸 superclass (ebeveyn/sınıf):
Özellikleri ve metotları tanımlar.
Diğer sınıflar bu sınıftan kalıtım alabilir.
Örnek: Vehicle

🔹 subclass (alt sınıf / child):
superclass'tan kalıtım alır.
extends anahtar kelimesi ile tanımlanır.
Örnek: Car, Truck, Bike

 */

 class Vehicle {
    protected String brand = "Ford";  // Alt sınıflar erişebilsin diye 'protected' yapıldı
    public void honk() {
        System.out.println("Tuut tuut");
    }
}

public class bir extends Vehicle {  // 'bir' yerine daha anlamlı bir isim: Car
    private String modelName = "Mustang";

    public static void main(String[] args) {
        bir myCar = new bir();     // Car nesnesi oluşturduk
        myCar.honk();              // Vehicle sınıfından miras alınan metot

        // modelName private olduğu için doğrudan erişilemez, getter kullanman gerekir
        System.out.println(myCar.brand + " " + myCar.modelName); // Bu satır hata verir
    }
}
/* kod hata verir  private olduğu için zaten amaç öğrenmek */