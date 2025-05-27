class Test {
    int a;

    Test(int i) {
        a = i;
    }

    Test incByTen() {
        Test temp = new Test(a+10); //yeni nesne oluşturuluor
        return temp; //Yeni nesneyi döndürüyor +10 şeklinde
    }
}

public class Main {
    public static void main(String[] args) {
        Test ob1 = new Test(2);
        Test ob2; //şuan sadece referansı var, içinde nesne yok
/*Bu satırdan sonra ob2 null durumundadır, yani boş bir referanstır.
Ama sonra şu satır geliyor: 
ob2 = ob1.incByTen();
ob1.incByTen() çağrılıyor → bu bir yeni Test nesnesi döndürüyor (a = 12).
Bu yeni nesne, ob2 değişkenine atanıyor.
Artık ob2 gerçek bir nesneyi gösteriyor.
*/
        ob2 = ob1.incByTen();
        System.out.println("ob1.a: "+ob1.a); //2
        System.out.println("ob2.a: "+ob2.a); //12

        ob2 = ob2.incByTen();
        System.out.println("ob2.a after second increase: "+ ob2.a); //22
    }
}