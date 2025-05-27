//Classes and Objects in java

/* Create objects of a class:
 * Declare object
 * Allocate memory
public class Baby {
fields 
methods
} */

// Sınıf tanımı
public class Baby {
    String name;
    boolean isMale;
    double weight;

    void getName() { //bu bi metod
        System.out.println("Baby name is " + name);
    }

    // main metodu da bu sınıfın içinde yer alabilir
    public static void main(String[] args) {
        Baby baby1 = new Baby();      // Nesne oluşturduk

        baby1.name = "Alex";          // Özellikleri atadık
        baby1.isMale = true;
        baby1.weight = 3.0;

        baby1.getName();              // Metodu çağırdık → Baby name is Alex
    }
}
