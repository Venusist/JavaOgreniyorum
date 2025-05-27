 // Now, volume() returns the volume of a box.

 class Box {
    double width;
    double height;
    double depth;


    //volume() sadece hacmi hesaplasın ve geri döndürsün (return).
    //Yazdırmak istersek main içinde yazdırırız
    double volume() {
        return width * height * depth;
    /*Bu metot çağrıldığında double tipinde bir sayı döner.
Sen bu değeri bir değişkende tutabilirsin ya da direkt println() içinde kullanabilirsin. */
    
    }
 }

 public class BoxDemo4 { 
    public static void main(String[] args) { 
      Box mybox1 = new Box(); 
      Box mybox2 = new Box(); 

      mybox1.width = 10; 
      mybox1.height = 20; 
      mybox1.depth = 15; 

      mybox2.width = 3; 
      mybox2.height = 6; 
      mybox2.depth = 9; 

      double vol;

      // get volume of first box 
      vol = mybox1.volume(); 
      System.out.println("Volume is " + vol); 
      // get volume of second box 
      vol = mybox2.volume(); 
      System.out.println("Volume is " + vol); 
    } 
  }
  //OR
  //SON KISIM
  /*
   * System.out.println("mybox1 hacmi: " + mybox1.volume()); // 3000
        System.out.println("mybox2 hacmi: " + mybox2.volume()); // 162
   
   Eğer dönen değeri sadece göstereceksen, ayrı bir vol değişkeni tanımlamana gerek yok.
Ama eğer o değeri başka hesaplamalarda kullanacaksan, bir değişkene atamak mantıklı
        */


