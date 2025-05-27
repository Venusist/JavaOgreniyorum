
/*
Static vs. Public
You will often see Java programs that have either static or public attributes and methods.
In the example above, we created a static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects:
 */

 public class yirmialti {
    //Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating obj");
    }

    //Public Method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating obj");
    }

    //Main method
    public static void main(String[] args) {
        myStaticMethod();// Call the static method
        // myPublicMethod(); This would compile an error
       
        yirmialti myObj = new yirmialti(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object
      }
    }
    /*static metodu, sınıfın bir örneği olmadan çağırabilirken, public metodu çağırabilmek için mutlaka bir nesne (object) oluşturmanız gerekir.

static metotlar genellikle sınıf düzeyinde işlevsellik sağlarken, public metotlar nesneye özgü işlemleri gerçekleştirmek için kullanılır. */



/*
     // Create a Main class
    
     public class Main {
  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    Main myCar = new Main();   // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}

// The car is going as fast as it can!
// Max speed is: 200
     */


     /*Example explained
1) We created a custom Main class with the class keyword.
2) We created the fullThrottle() and speed() methods in the Main class.
3) The fullThrottle() method and the speed() method will print out some text, when they are called.
4) The speed() method accepts an int parameter called maxSpeed - we will use this in 8).
5) In order to use the Main class and its methods, we need to create an object of the Main Class.
6) Then, go to the main() method, which you know by now is a built-in Java method that runs your program (any code inside main is executed).
7) By using the new keyword we created an object with the name myCar.
8) Then, we call the fullThrottle() and speed() methods on the myCar object, and run the program using the name of the object (myCar), followed by a dot (.), followed by the name of the method (fullThrottle(); and speed(200);). Notice that we add an int parameter of 200 inside the speed() method.

Remember that..
The dot (.) is used to access the object's attributes and methods.
To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).
A class must have a matching filename (Main and Main.java). */