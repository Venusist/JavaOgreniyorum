public class yirmi_Methods {
    static void myMethod() {
      System.out.println("I just got executed!");
    }

    /*myMethod() is the name of the method
static means that the method belongs to the Main class and not an object of the Main class.
void means that this method does not have a return value. You will learn more about return values later in this chapter
 */
  
    public static void main(String[] args) {
      myMethod();
      myMethod();
      myMethod();
    }
  }
  
  // I just got executed!
  // I just got executed!
  // I just got executed!