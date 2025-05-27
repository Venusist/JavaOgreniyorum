/* In Java, every application begins with a class name, and that class must match the filename.
 */
 public class bir {
    public static void main(String[] args){
        System.out.println("Hello world");/*print line  */
        


 /*Java'da her public class kendi ayrı bir dosyada olmalı ve dosya adı, sınıf adıyla aynı olmalı.
Eğer sadece bir tane ana programın (main metodu olan sınıfın) olacaksa, tek bir dosyada çalışabilirsin.
Eğer birden fazla sınıfın varsa, hepsi main metodu içermek zorunda değil. Sadece programı başlatmak için bir yerde public static void main(String[] args) bulunmalı.
Kendi oluşturduğun yardımcı sınıfları (helper class) public yapmana gerek yok. Public yaparsan, onları da ayrı dosyalara koymalısın.
  */

  /*Every line of code that runs in Java must be inside a class. And the class name should always start with an uppercase first letter. In our example, we named the class Main.
    public class Main {
    public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
   */

/*Java is case-sensitive: "MyClass" and "myclass" has different meaning */

/*PRINT AND PRINTLN The only difference is that it does not insert a new line at the end of the output: */
System.out.print("Hello World!");/*next line a geçmeyecek bundan sonra gelen */
System.out.print("I will print on the same line.");
 
/*You can also perform mathematical calculations inside the println() method: */

System.out.println(3+3);

//comment /*comment*/


}
}