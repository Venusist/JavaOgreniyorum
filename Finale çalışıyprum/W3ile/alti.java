//parametreli constructor 
public class alti {
    int x;

    public alti(int y) { //Constructor’ın içine int y diye bir parametre verdik.
        x=y;
    }

    public static void main(String[] args) {
        alti myObj = new alti(5); //new alti(5) diyerek y=5 olmuş oldu.
       //x = y sayesinde x = 5 oldu.
        System.out.println(myObj.x);
    }
    /*🔁 Parametreyle Neyi Sağlıyoruz?
Her nesneye farklı başlangıç değeri vermemizi sağlar.
Aynı sınıftan farklı özelliklere sahip nesneler üretiriz. */
}
