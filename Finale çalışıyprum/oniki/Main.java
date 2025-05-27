/// a superclass variable can reference a subclass objecct

class ClassA { //superclass
    int a;
}
class ClassB extends ClassA { //ClassB, ClassA sınıfından kalıtım alıyor.
    int b;
}//a değişkenini miras alır (çünkü ClassA'dan geliyor) ve kendisi b adında yeni bir değişken ekler.

public class Main {
    public static void main(String[] args) {
        ClassA obA;
        ClassB obB = new ClassB();
        /*obB, hem a hem b değişkenlerine sahip bir ClassB nesnesi.
obA ise ClassA tipinde bir değişken. */
        obB.b=4;
        obB.a=6;
        obA = obB;
        //obB nesnesi, ClassA türündeki obA referansına atanıyor.
//Bu durumda obA, artık obB'yi gösteriyor ama sadece ClassA'da tanımlı üyeleri görebilir (a).
        System.out.println(obA.a);


    }//obA sadece a'ya erişebilir, b'ye erişemez. Ekrana 6 yazdırı
}//eğer System.out.println(obA.b); yazsaydık error olurdu çünkü b is not am meber of classA