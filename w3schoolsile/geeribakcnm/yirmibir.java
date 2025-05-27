public class yirmibir {
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");

    }
    /*The following example has a method that takes a String called fname as parameter. When the method is called, we pass along a first name, which is used inside the method to print the full name: */
    public static void  main(String[] args){
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
    }
}

/*
 * When a parameter is passed to the method, it is called an argument. So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments.
 */

 