public class ondortfordonguleri {
    public static void main(String[] args) {
    
    
    /****for (statement 1; statement 2; statement 3) {
    Statement 1 is executed (one time) before the execution of the code block.
    Statement 2 defines the condition for executing the code block.
    Statement 3 is executed (every time) after the code block has been executed. */
     
for (int i = 0; i <5; i++){
    System.out.println(i);
}

/***************NESTED LOOPS***********************/

//oUTER LOOP 
    for(int k = 1; k <= 2 ; k++){
        System.out.println("Outer: "+ k);

        //inner loop
    for (int j = 1; j<= 3; j++){
        System.out.println("Inner: " + j);
        /*Outer loop 2 kere çalışır (k = 1, k = 2)
        Her outer loop çalıştığında, inner loop 3 kere çalışır (j = 1 → 3) */
    } }

/**For Each Loop ****************** */
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for(String i : cars){
        System.out.println(i);
    }
//"cars dizisindeki her bir elemanı tek tek al, i adını ver, ve onunla döngüyü çalıştır."
//: burada şunu ifade ediyor: "şunun içindeki her eleman için"


for ( int k = 0; k<= 10; k= k+2){
    System.out.println(k);
}


int number = 2;
for(int m = 1; m<= 10; m++){
    System.out.println(number + "x" + m + " = " + (number * m));
}

for (int n = 0; n <10; n++){
    if (n == 4){
        break;//continue yazsaydık 4 ü atlayıp devam ederdi 012356789
    }
    System.out.println(n);
} // sadece 0123 yazıldı ve bitti Eğer continue kullansaydın, sadece o turu atlar, döngü devam ederdi



int i = 0;          // i'yi 0 olarak başlatıyoruz
while (i < 10) {    // i 10'dan küçük olduğu sürece döngü çalışacak
  if (i == 4) {     // Eğer i değeri 4'e eşit olursa,
    i++;            // i'yi artır
    continue;       // ve "continue" kullanarak geri döngüye dön (alttaki kodları atla!)
  }
  System.out.println(i);  // i'yi ekrana yazdır
  i++;                    // i'yi bir artır
}  
/*Sonuç olarak 0 1 2 3 5 6 7 8 9 ekrana yazdırılır (4 hariç). */



    }
    }
