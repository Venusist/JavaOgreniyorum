class Testt {
    public int a;
    Testt(int i) {
        a=i; //// Constructor: "a" değerini alır
    }
    public Testt add(Testt ob){
        int i;
        i = this.a + ob.a; // // bu nesnenin "a" değeri + gelen nesnenin "a" değeri
        Testt t = new Testt(i); // yeni bir Test nesnesi oluşturur
        return t; //Yeni nesneyi döndürür
    }
    /* 📌 add(Test ob) metodu ne yapıyor?
    add metodu, başka bir Test nesnesini parametre olarak alıyor (Test ob).
Kendi a değeri ile, gönderilen ob nesnesinin a değerini topluyor.
Yeni a değeri ile bir Test nesnesi oluşturuyor ve geri döndürüyor.
     */

}

public class takeo {
    public static void main(String[] args) {
        Testt ob1 = new Testt(3); //ob1.a = 3
        Testt ob2 = new Testt(5); //ob2.a = 5
        Testt ob3;

        ob3 = ob1.add(ob2); // ob3.a = ob1.a + ob2.a = 3+5 = 8
        System.out.println(ob3.a);
    }
}