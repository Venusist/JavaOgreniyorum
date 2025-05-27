class Circle {

    public double radius;
    Circle(double r)
    {
        radius = r;
    }

    void method(Circle c){ //"Ben bir Circle nesnesi alırım (yani parametre olarak), adı da c olur."
        System.out.println(radius); // bu c2’nin radius’u
        //radius → bu metodu çağıran objenin radius’u
        System.out.println(c.radius);// bu c1’in radius’u
        //c.radius → metoda gönderilen objenin radius’u
    }
}
public class consttakesobjj2 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);

        c2.method(c1); //// demek = "c2 içinde yazılı olan method çalışsın, ama içine c1’i veriyorum"
        /* 
         method fonksiyonunu c2 nesnesi çağırıyor.
        Ama içine c1 nesnesini gönderiyor.
         */
    }
}
