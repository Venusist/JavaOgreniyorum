class Test {
    int a; // default access public - sadece aynı paket içinden erişilebilir
    public int b; //public access - her yerden erişilebilir
    private int c; //private access- sadece bu sınıfın içinden erişilebilir 

     // c değişkenine erişmek için setter metodu
    void setc(int i) {
        c = i;
    }
     // c değişkeninin değerini almak için getter metodu
    int getc() {
        return c;
    }
}

class accescontrol {
    public static void main(String[] args) {
        Test ob = new Test();

        ob.a = 10;
        ob.b = 20;
        //these are ok, a n b may be accessed directly 

        //this is not Ok will ccause an error 
        //ob.c = 100; ERROR

        //you must acces c through its methods
        // c değişkenine değer atamak için setc metodunu kullanıyoruz
        ob.setc(100);
        System.out.println("a and b and c "+ob.a +" "+ob.b +" " +ob.getc()); //!!!!!!!!!
    }
}/*Neden c doğrudan erişilemiyor?
c private olarak tanımlandığı için sadece Test sınıfının içinden erişilebilir.
Başka sınıflar veya kodlar doğrudan ob.c = 100; yazamaz.
Bu, değişkenin gizliliğini ve kontrolünü sağlamak için kullanılır.
setc ve getc metodları ne işe yarıyor?
setc(int i) metodu ile dışarıdan güvenli bir şekilde c değerini değiştirebiliyoruz.
getc() metodu ile de c değişkeninin değerini alabiliyoruz.
Bu şekilde encapsulation (kapsülleme) sağlanır, yani veriye kontrollü erişim sağlanır.


 */