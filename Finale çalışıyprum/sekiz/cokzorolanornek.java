class Person {
    String name;

    Person(String n) {
        name = n;
    }

    void greet(Person other) {
        System.out.println("Benim adim "+ name);
        System.out.println("Senin adin "+other.name);
    }
}
public class cokzorolanornek {
    public static void main(String[] args) {
        Person p1=new Person("Ayşe");
        Person p2 = new Person("Fatma");

        p1.greet(p2);
    // this      other
    System.out.println("///////////////////");
        p2.greet(p1);
    }
}
/*Metodu kim çağırırsa, o this olur.
Parantez içine kimi verirsen, o da other olur. */