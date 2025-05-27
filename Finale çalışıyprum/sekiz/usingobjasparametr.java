class Test {
    int a, b;

    Test(int i, int j) {
        a=i;
        b=j;
    }
    /*Burada iki tane sayıyı (a ve b) tutan bir sınıf tanımladık. Constructor'la ilk değerleri alıyoruz.  */
boolean equalTo(Test o) { 
    if(o.a == a && o.b ==b ) 
    /*Bu nesnenin (o.a ve o.b) kendi nesnesiyle (this.a ve this.b) eşit olup olmadığını kontrol ediyor. */
    return true;
    else 
    return false;
}
}
public class usingobjasparametr {
    public static void main(String[] args) {
        Test ob1 = new Test(100,22);
        Test ob2 = new Test(100,22);
        Test ob3 = new Test(-1,-1);

        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));

/*equalTo(Test o) → bu nesneyle başka bir nesneyi karşılaştırıyor.
Nesneyi metoda parametre olarak geçiriyoruz.
Bu yöntem Java'da çok yaygın: equals, compareTo, vs. */
    }
}
