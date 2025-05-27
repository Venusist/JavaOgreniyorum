public class hcabes {
    static void inc(int b[]){
        for (int i=0; i<b.length;i++) {
            b[i]++;
        }
    }
/*Bu metot, bir diziyi (b[]) alır ve dizinin her elemanını 1 artırır.
Döngü ile dizinin her elemanına tek tek erişir ve b[i]++ ile o elemanı 1 artırır.
Örneğin:
b[0]'ı 1 artırır.
b[1]'i 1 artırır.
Bu şekilde devam eder. */
    public static void main(String[] args) {
        int a[]={2,1};
        inc(a);
        System.out.println("Value of a[0] here is "+a[0]);
    } }
    
//TEKRAR ANLAMAYA ÇALIŞ
//call by reference
