/* 
 * In array we have 10 obj of class Circle 
 * calculate the average of radius r of the objects 
 * create a new obj with the radius r equal to the calculated average

 🎯 Amaç:
10 tane Circle (çember) nesnesi olan bir dizi (array) oluşturuluyor.
Bu 10 çemberin yarıçaplarının (radius) ortalaması hesaplanıyor.
Bu ortalama yarıçapla yeni bir çember oluşturuluyor.
Bu yeni çemberin alanı (area) ekrana yazdırılıyor.

 */
    class Circle {
        public double r;

        Circle(double r1) {
            r=r1;
        }
        public double area() {
            return 3.1416*r*r;
        }
    }

    public class arrayofobjaverage {
        public static void main(String[] args) {
            //10 elemanlı bir Circle dizisi oluşturduk ama henüz içinde nesne yok.
            Circle circles[] = new Circle[10];

            for (int i=0; i < 10; i++) {
                circles[i] = new Circle(i+1);
/* i + 1 sayesinde yarıçaplar 1’den 10’a kadar olacak
circles[0] = new Circle(1)
circles[1] = new Circle(2)
...
circles[9] = new Circle(10)

circles = [ Circle(1), Circle(2), ..., Circle(10) ]
 */
            }
//tüm yarıçapların toplamını bulma
            double r1=0; //toplamı tutacağımız yeri 0 yaptık başlangıç değeri
            for (int i = 0; i<10; i++) { //0 dan 9 a kadar çalışır 10 defa
                r1 = r1 + circles[i].r;                
            }
/* 
| i | `circles[i].r` | `r1` yeni değeri | Açıklama                   |
| - | -------------- | ---------------- | -------------------------- |
| 0 | 1              | 0 + 1 = 1        | İlk çemberin yarıçapı 1    |
| 1 | 2              | 1 + 2 = 3        | İkinci çemberin yarıçapı 2 |
| 2 | 3              | 3 + 3 = 6        | Üçüncü çemberin yarıçapı 3 |
| 3 | 4              | 6 + 4 = 10       | ...                        |
| 4 | 5              | 10 + 5 = 15      |                            |
| 5 | 6              | 15 + 6 = 21      |                            |
| 6 | 7              | 21 + 7 = 28      |                            |
| 7 | 8              | 28 + 8 = 36      |                            |
| 8 | 9              | 36 + 9 = 45      |                            |
| 9 | 10             | 45 + 10 = 55     | Son çemberin yarıçapı 10   |

✅ Sonuç:
Tüm r değerlerini topladık:
r1 = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
Bu r1 artık ortalama hesaplamak için kullanılacak.


🧠 Unutma:
circles[i] → i’nci çember nesnesi (Circle object)
circles[i].r → o nesnenin yarıçapı
r1 → tüm yarıçapların toplamı (başta 0, sonra tek tek ekleniyor)
 */

            r1=r1/circles.length;
            Circle c1=new Circle(r1);
            System.out.println(c1.area());
        }
    }
