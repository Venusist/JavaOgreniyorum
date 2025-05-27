/*  We have defined a class named Complex to represent complex numbers: x+yi, 3+2i.
Write the definition of a member method for this class such that:
Name of the method is add.
It takes an object of type Complex as parameter.
The method will calculate the addition of the number represented by itself (which object calls this method) and the parameter.
The result will be assigned to a new object of type Complex and the new object will be returned by the method.

Complex (karmaşık sayı) adında bir sınıf tanımlanmış, örneğin x + yi veya 3 + 2i gibi karmaşık sayıları temsil ediyor.
Şimdi, bu sınıfa ait bir üye metot (yani o sınıfa bağlı bir fonksiyon) yazman isteniyor.
Metodun adı add olacak.
Bu metodun parametre olarak bir başka Complex nesnesi alacak (yani toplama yapılacak ikinci sayı).
Metodun yaptığı iş:
Kendi (yani metodu çağıran nesnenin) karmaşık sayısı ile parametre olarak aldığı karmaşık sayıyı toplayacak.
Sonuç olarak, toplama işleminin sonucunu yeni bir Complex nesnesi olarak oluşturacak ve bu yeni nesneyi geri döndürecek
*/


class Complex {
    private double x; // Karmaşık sayının gerçek kısmı (örneğin 3 + 2i'deki 3)
    private double y;


    //constructor
    //Yeni bir Complex nesnesi oluştururken gerçek ve sanal kısmı belirleriz
    public Complex(double x1, double y1) {
        x=x1;
        y=y1;
    }
//karmaşık sayıyı ekranda gösterir
    public void show() {
        System.out.println(x+"+"+y+"i");
    }

     // add metodu: başka bir Complex nesnesini parametre olarak alır
    // Bu nesneyle kendisini toplar, yeni Complex nesnesi döner
    public Complex add(Complex n) {
        double sumx, sumy;
        sumx = x+n.x;
        sumy=y+n.y;
        Complex t= new Complex(sumx,sumy);
        return t;
    }
}

public class Labtask {
    public static void main(String[] args) {
        Complex n1 = new Complex(2, 3);   // 2 + 3i
        Complex n2 = new Complex(4, 1);   // 4 + 1i

        Complex n3;  
        n3 = n1.add(n2);                  // n1 ile n2'yi toplar, sonucu n3'e atar

        n3.show();                       // n3'ü ekranda gösterir: 6.0+4.0i
    }
}