public class methodstatic {
    static int add(int a, int b) {
        int c;
        c=a+b;
        return c;
        /*Bu metot iki sayı alır ve toplayıp sonucu döndürür.
static olduğu için, metodu sınıf adı üzerinden veya doğrudan çağırabilirsin.
Örn: add(4, 5) ya da methodstatic.add(4, 5) */

    }

    public static void main(String[] args) {
        
        /*Eğer add metodu static olmasaydı, şunu yapmak gerekirdi:
        methodstatic obj = new methodstatic();
        sum = obj.add(i, j);
 */
        int i=4, j=5, sum;
        sum = add(i,j);
        System.out.println("Sumination is "+sum);
    }
}
/*add metodu nesne oluşturmadan çalıştırılabilsin diye static yapılmış.
main metodu da zaten static, bu yüzden içinde static olmayan bir metodu
 direkt çağırman mümkün olmazdı (önce nesne oluşturmak gerekirdi). */