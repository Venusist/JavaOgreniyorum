public class iki {
    public static void main(String[] args){

/*
  Java Variables
String - stores text
int - stores integers (whole numbers), without decimals 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 -19.9
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false
*/

/*To create a variable
 type variableName = value;
Where type is one of Java's types (such as int or String)
 */

 String name = "John";
 System.out.println(name);

int myNum = 15;
System.out.println(myNum);

/*You can also declare a variable without assigning the value, and assign the value later: */

int myNumbb;
myNumbb = 12;
System.out.println(myNumbb);

/*If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only): */
/* 
final int myNum = 15;
myNum = 20; //başka bi şey atadığın için sisstem will generate an error: cannot assign a value to a final variable
*/

    int number = 5; // Değişken ismi küçük harfle başlamalı
    float myFloatNum = 5.99f;
    char myLetter = 'D';
    boolean myBool = true;
    String myText = "Hello";

    // Değişkenleri ekrana yazdırarak çıktıyı görmek için
    System.out.println(number);
    System.out.println(myFloatNum);
    System.out.println(myLetter);
    System.out.println(myBool);
    System.out.println(myText);


    String namme = "Ipek";
    System.out.println("hELLO" + namme);
    /*You can also use the + character to add a variable to another variable: */

    String firstname = "David";
    String lastName = "Doe";
    String fullName = firstname + lastName;
    System.out.println(fullName);

    int x =5;
    int y = 8;
    System.out.println(x+y);

    /*Can also write
     int x = 5, y = 6, z = 50; //yani yan yana virgülle yazabilirsin
     */

    int a, b, c;
    a = b = c = 50;
    System.out.println(a + b + c);

/*All Java variables must be identified with unique names. a b c name number vs vs
These unique names are called identifiers. */

}
}