class StaticDemo {
    static int a = 42;
    static int b = 99;

    static void callme() { //callme() adında bir static metot var. Bu sınıftaki static üyeler sınıf adıyla doğrudan erişilebilir.
        System.out.println("a = "+a);
    }
}

class staticexample {
    public static void main(String[] args) {
        StaticDemo.callme();// Static metot doğrudan sınıf adıyla çağrıldı
        System.out.println("b = "+StaticDemo.b);// Static değişken b’ye doğrudan erişim
    }
}
 /* static metotlar ve değişkenler, sınıf adı üzerinden doğrudan çağrılabilir.
StaticDemo sınıfından hiç nesne oluşturulmadı ama yine de metot ve değişkenlerine erişildi.
Bu da static üyelerin sınıfa ait olduğunu, nesneye ait olmadığını gösterir. */