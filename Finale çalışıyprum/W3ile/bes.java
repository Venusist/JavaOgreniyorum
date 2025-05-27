//default constructor 
public class bes {
    int x;

    public bes() {// Constructor (parametresiz)
        x = 10;  }//Burada bes() adlı constructor, otomatik olarak x'i 10 yapıyor.
/*🔑 Özellikleri:
Constructor'ın adı, sınıf adıyla aynı olmak zorundadır.
Geri dönüş tipi (void, int vs) yoktur!
Nesne oluşunca otomatik çalışır (sen çağırmazsın, Java çağırır).
 */

    public static void main(String[] args) {
        bes myObj = new bes();
        System.out.println(myObj.x);
    }
    }
