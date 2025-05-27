class ClasssA {
    int a;
}
class ClasssB extends ClasssA {
    int b;
}

public class Inheritence {
    public static void main(String[] args) {
        ClasssB ob = new ClasssB();
        ob.b=4;
        ob.a=6;
        System.out.println(ob.b +" " +ob.a);
    }
}