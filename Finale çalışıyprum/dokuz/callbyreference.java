/* 
Java'da nesneler (object) metoda referansları ile gönderilir.
Bu ne demek? 👇
Yani metotta yapılan değişiklikler orijinal nesneye yansır.
Çünkü metotta aslında aynı nesneye ulaşılır, bir kopya değil.
 */

 class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    //Pass an object
    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
 }

 public class callbyreference {
    public static void main(String[] args) {
        Test ob = new Test(15,20);
        System.out.println("ob.a and ob.b before call : "+ob.a +" " +ob.b);

        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: "+ob.a +" "+ob.b);

    }
 }