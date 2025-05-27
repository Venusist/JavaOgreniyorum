public class yirmibes {

  //JAVA CLASS ATTRIBUTES
  /* 
    int x = 5;

    public static void main(String[] args) {
      yirmibes myObj1 = new yirmibes();  // Object 1
      yirmibes myObj2 = new yirmibes();  // Object 2
      myObj2.x = 25;
      System.out.println(myObj1.x);  // Outputs 5
      System.out.println(myObj2.x);  // Outputs 25
    }
  }
Multiple Objects
If you create multiple objects of one class, you can change the attribute values in one object, without affecting the attribute values in the other:

Example
Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged:

 
  */

    String fname = "John";
    String lname = "Doe";
    int age = 24;
  
    public static void main(String[] args) {
      yirmibes myObj = new yirmibes();
      System.out.println("Name: " + myObj.fname + " " + myObj.lname);
      System.out.println("Age: " + myObj.age);
    }
  }
