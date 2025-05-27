public class FuncOverloading {
    static int add(int a, int b) {
        int c;
        c = a + b;
        return c;
    }
    static float add(float a, float b){
        float c;
        c =  a + b;
        return c;
    }
//⚠️ Bunların ikisinin ismi add ama Java içeride "hangi türü gönderdiğine göre" karar veriyor.
    public static void main(String[] args) {
        int i=4, j=5, sum;
        float f1=2.5f, f2=3.5f, fsum;
        sum = add(i,j);
        fsum= add(f1,f2);
        System.out.println("Sum of the integers:"+sum);
        System.out.println("Sum of the floats is "+fsum);
    }
}
 
/* 📌 Konunun Temeli: "Aynı isimde birden fazla fonksiyon yazmak"
Java'da birden fazla add() fonksiyonu yazabilirsin
Yeter ki parametre türleri veya sayıları farklı olsun!
Buna Method Overloading deniyor. */