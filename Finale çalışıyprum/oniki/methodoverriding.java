/* 
 When a method in a subclass has the same name and type signature as a method in its superclass, then the method in the subclass is said to override the method in the superclass.
When an overridden method is called from within its subclass, it will always refer to the version of that method defined by the subclass.

🔹 Alt sınıfta, üst sınıftaki bir metodun aynı isimle ve aynı parametrelerle yeniden yazılması olayına method overriding (metot ezme) denir.
🔹 Eğer bir metot ezilmişse (override edilmişse) ve bu metot alt sınıftan çağrılırsa, üst sınıftaki değil, alt sınıftaki versiyonu çalışır.
 */
class A {
    int i,j;
    A( int a, int b) {
        i = a;
        j= b;
    }
    void show() {
        System.out.println("i and j :" +i+ " " +j);
    }
}
class B extends A {
    int k;
    B(int a, int b, int c) {
        super (a,b);
        k=c;
    }

    //display k - this overrides show() in A 
    void show() {
        System.out.println("k: "+k);
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        B subOb = new B(1,2,3);

        subOb.show();
    }
}