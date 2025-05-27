public class yirmidort {
    //Java Recursion
/*    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k-1);
        } else {
            return 0;
        }
    }
}*/
/*
When the sum() function is called, it adds parameter k to the sum of all numbers smaller than k and returns the result. When k becomes 0, the function just returns 0. When running, the program follows these steps:

10 + sum(9)
10 + ( 9 + sum(8) )
10 + ( 9 + ( 8 + sum(7) ) )
...
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
 */




 /*Use recursion to add all of the numbers between 5 to 10. */

  public static void main(String[] args) {
      // 5 ile 10 arasındaki sayıları toplar
      int result = sum(5, 10);
      System.out.println(result); // Sonucu ekrana yazdırır
  }

  // Bu fonksiyon, start ve end arasındaki tüm sayıları toplar
  public static int sum(int start, int end) {
      if (end > start) {
          // end değeri, start'dan büyükse, end ile bir alt değeri toplar
          return end + sum(start, end - 1);
      } else {
          // end ile start eşitse, son değeri döner (burada start == end olduğunda sona ulaşır)
          return end;
      }
  }
}
