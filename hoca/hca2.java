public class hca2 {
    public static void main(String[] args) {
        int twoD[][] = new int[4][5];
        int i,j , k=0;

        for(i=0;i<4;i++) //Satırlar
        for(j=0; j<5;j++){ //sütunlar
            twoD[i][j] = k;
            k++;//her hücreye 0 dan başlayarak bir sayı koy
        }
        for(i=0;i<4;i++){ //satırları dolaş bu part ekrana yazdırma kısmı
            for(j=0;j<5;j++) //sütnları
            System.out.println(twoD[i][j] + " "); //elemanı yazdırır
            System.out.println();//satır tamamlanınca yeni satıra geçer

        }
    }
}


/* bu şekidle gözükür sütun ve satırlar
0 1 2 3 4
5 6 7 8 9
10 11 12 13 14
15 16 17 18 19 */

