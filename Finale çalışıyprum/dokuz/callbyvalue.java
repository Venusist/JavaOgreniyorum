/* Passing Argument to Methods
call by value and
call by reference
 */

 /* 💡 Call by Value (Değerle Çağırma) ne demek?
Java’da primitive (ilkel) türleri (int, float, double, long, vb.) 
bir metoda gönderdiğinde, orijinal değerin bir kopyası gönderilir. Yani metodun içinde
 ne yaparsan yap, dışarıdaki asıl değişken etkilenmez. */

 public class callbyvalue {
    static void changeValue(int x) {
        x=10; //// sadece kopyayı değiştiriyoruz
        }

        public static void main(String[] args) {
            int original = 5;
            changeValue(original);
            System.out.println("Original value: "+original);// Çıktı: 5

        }
 }
 /*🔍 Ne oldu burada?
original = 5 idi.

changeValue(original) çağrıldığında, x değişkeni original'ın bir kopyası oldu.

Metodun içinde x = 10 yaptık, ama bu sadece kopyayı etkiledi.

original hâlâ 5 olarak kaldı çünkü Java'da primitive türler "call by value" ile gönderilir.

🧠 Kısaca:
✅ Orijinal değişken korunur.

❌ Metodun içindeki değişiklik dışarıyı etkilemez.

🔁 Bu sadece int, float, double, vb. gibi primitive türler için geçerlidir. */