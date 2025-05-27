/*ENCAPSULATİON

Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable

Get and Set
private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.
The get method returns the variable value, and the set method sets the value.


public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}
The get method returns the value of the variable name.
The set method takes a parameter (newName) and assigns it to the name variable. The this keyword is used to refer to the current object.
However, as the name variable is declared as private, we cannot access it from outside this class:

Example
public class Main 
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.name = "John";  // error
    System.out.println(myObj.name); // error 
  }
}

If the variable was declared as public, we would expect the following output:

John
However, as we try to access a private variable, we get an error:

MyClass.java:4: error: name has private access in Person
    myObj.name = "John";
         ^
MyClass.java:5: error: name has private access in Person
    System.out.println(myObj.name);
                  ^
2 errors
Instead, we use the getName() and setName() methods to access and update the variable:

Example
public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
  }
}

// Outputs "John"
 */

    