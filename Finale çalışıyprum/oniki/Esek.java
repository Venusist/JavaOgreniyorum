//using super to call superclass constructors

class ClassA {
    public int a;
    ClassA(int i) {
        a=i;
    }
}
class ClassB extends ClassA {
    public int b;
    ClassB(int i, int j) {
        super(i); // burada üst sınıfın constructor'ı çağrılıyor
        this.b=j; //Bu da ClassB'nin kendi b değişkenine j'yi atar.
    } /*The keyword super can be used as a reference to the superclass of the subclass in which it is used.
    This usage has the following general form: 
        super.member */
}
public class Esek  {
    public static void main(String[] args) {
        ClassB ob = new ClassB(5,9);
        System.out.println(ob.a);
        System.out.println(ob.b);
    }
}

