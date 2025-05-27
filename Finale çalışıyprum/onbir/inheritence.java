/* 
inheritance (kalıtım)
"Inheritance, hiyerarşik sınıflar oluşturmayı sağlar."
Bir genel sınıf (örneğin: Hayvan) oluştururuz.
Bu sınıf, ortak özellikleri ve davranışları tanımlar.
Örneğin: nefesAl(), hareketEt() gibi.
Daha sonra, bu genel sınıftan kalıtım alan daha özel sınıflar tanımlarız.
Örneğin: Kedi, Köpek, Kuş sınıfları → Hayvan sınıfından türetilir.

| İngilizce      | Türkçe                    | Açıklama                                                    |
| -------------- | ------------------------- | ----------------------------------------------------------- |
| **Superclass** | Üst sınıf / ebeveyn sınıf | Ortak özellikleri tanımlar.                                 |
| **Subclass**   | Alt sınıf / çocuk sınıf   | Superclass’tan kalıtım alır. Kendi özel şeylerini de ekler. |


Subclass, superclass’ta tanımlı olan tüm özellikleri ve metotları otomatik olarak alır.
Ek olarak, kendi özel özelliklerini de tanımlayabilir.
 */

 class Vehicle { // Superclass ve maker adında bir değişkeni var 
    public String maker; 

    //maker → Tüm araçlar için geçerli bir özellik. bu yüzden superclasse yazdık(Car, Truck, Bus… hepsinin bir üreticisi vardır.)
 }
 class Car extends Vehicle { // car alt sınıf subclass Vehicle sınıfından kalıtım alır 
    public String modelName;
 }
 /* Car da bir Vehicle'dır. Ama ona özgü özellikleri de olabilir.  */

 class inheritence {
    public static void main(String[] args) {
        
        Car myCar = new Car();
        myCar.maker = "Honda";
        myCar.modelName =" Accord";

        System.out.println(myCar.maker + " " +myCar.modelName);
    }
 }
