class Test {
    void meth(int i, int j){
        i *= 2;
        j /=2;
    }/* İçeride i iki katına çıkarılıyor, j ise ikiye bölünüyor.
Ama bunlar sadece kopyalar! */
}

class callbyvalue2 {
    public static void main(String[] args) {
        Test ob = new Test();

        int a=15, b =20;
        System.out.println("a and b before call: " +a + " " +b);

        ob.meth(a,b);//bu metodun içine a ve b’nin kopyaları (i, j) gönderildi.
        /* i *= 2 → i = 30        j /= 2 → j = 10
Ama bunlar sadece metodun içindeki yerel değişkenler.
main’deki a ve b hiç değişmedi.*/
        System.out.println("a and b after call"+a +" " +b);

    }
}