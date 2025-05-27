
// Java PACKAGES
/* 
Java'da package (paket), ilgili sınıfları gruplamak için kullanılır. Dosya sistemi gibi çalışır ve kodun düzenli, okunabilir ve yönetilebilir olmasını sağlar.

1️⃣ Java'da Paket Türleri
📌 Built-in Packages (Hazır Paketler) → Java'nın kendi sunduğu kütüphaneler (Java API).
📌 User-defined Packages (Kullanıcı Tanımlı Paketler) → Kendi oluşturduğumuz paketler.

2️⃣ Built-in Packages (Hazır Paketler)
📍 Java API → Java’nın hazır sınıflarını içerir. Örnek:
🔹 java.util.Scanner → Kullanıcıdan giriş almak için.
🔹 java.util.Random → Rastgele sayı üretmek için.
🔹 java.time.LocalDate → Tarih ve saat işlemleri için.

✅ Bir sınıfı içe aktarma (import etme)
import java.util.Scanner;  // Sadece Scanner sınıfını ekler
✅ Bir paketin tüm sınıflarını içe aktarma
import java.util.*;  // java.util içindeki tüm sınıfları ekler

3️⃣ User-defined Packages (Kendi Paketimizi Oluşturma)
📌 Adım 1: Paketi tanımlayın

package mypack; // Paketi tanımla
class MyPackageClass {
    public static void main(String[] args) {
        System.out.println("Bu benim paketim!");
    }
}

📌 Adım 2: Dosyayı derleyin

javac -d . MyPackageClass.java
Bu komut mypack adında bir klasör oluşturur ve sınıf dosyasını içine koyar.

📌 Adım 3: Paketi çalıştırın

java mypack.MyPackageClass

Çıktı:
Bu benim paketim!
📌 Özetle:
✅ Paketler, sınıfları düzenlemek ve çakışmayı önlemek için kullanılır.
✅ Hazır paketler Java API içinde yer alır (java.util, java.io gibi).
✅ Kendi paketimizi oluşturmak için package anahtar kelimesini kullanırız.
✅ Paketleri çalıştırmak için, önce javac -d . ile derlemeliyiz.

*/
