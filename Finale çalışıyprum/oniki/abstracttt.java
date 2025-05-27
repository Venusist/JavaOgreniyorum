/*  🟨 Soyutlama nedir?
Bazen bir üst sınıf (superclass) tanımlamak isteriz ama bu sınıf sadece genel bir yapı tanımlar, kendi başına kullanılmaz.
Örneğin: Hayvan sınıfı genel bir şeydir, ama doğrudan "bir hayvan" nesnesi yaratmak mantıklı değildir; onun yerine Köpek, Kedi gibi alt sınıflar oluştururuz.
🟩 abstract metot nedir?
Eğer bir metot, sadece adı ve parametreleriyle tanımlanır ama gövdesi yoksa, bu metoda abstract metot denir.
abstract void speak();
Bu metot alt sınıflar tarafından override edilmek zorundadır. Aksi halde derleyici hata verir.
🟥 abstract sınıf nedir?
En az bir abstract metot içeriyorsa sınıf da abstract olmak zorundadır.
abstract sınıflardan doğrudan nesne oluşturulamaz.


Sometimes we want to create a superclass that only defines a generalized form that will be shared by all of its subclasses.
We can require that certain methods be overridden by subclasses by specifying the abstract type modifier. 
To declare an abstract method:
  abstract type name(parameter-list);
No method body will be present.
If sub-class does not override the abstract method, compiler will generate an error.
No object of an abstract class can be created.
*/

abstract class Figure {
    double dim1;
    double dim2;

    Figure (double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}
class Rectangle extends Figure {
    Rectangle(double a,double b) {
        super(a,b);
    }

    double area() {
        System.out.println("Inside area for rectangle ");
        return dim1 * dim2;
    }
}
public class abstracttt {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9,5);
        System.out.println("Rea is "+ r.area());
    }
}