//multi level class Hierarchy

class A {
    public int a;
}

class B extends A {
    public int b;
}

class C extends B {
    public int c;
}

public class multiclass {
    public static void main(String[] args) {
    C ob = new C();
    ob.a = 5;
}
}