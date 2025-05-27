public class ondokuz {
    public static void main(String[] args){

        int[][] myNumbers = { {1,2,3,4},{5,6,7}};
        System.out.println(myNumbers[1][2]);
        /*sayıyı değiştiriyoruz */
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);
        System.out.println(myNumbers.length);//iki öğe var

        for(int i = 0; i< myNumbers.length; ++i){
            for(int j =0; j<myNumbers[i].length; ++j){
                System.out.println(myNumbers[i][j]);
            } } } }
/*
 İlk dış döngü (i = 0):
myNumbers[0] alt dizisini alır: {1, 2, 3, 4}
İç döngü (j'yi 0'dan 3'e kadar artırarak):
myNumbers[0][0] (1)
myNumbers[0][1] (2)
myNumbers[0][2] (3)
myNumbers[0][3] (4)

İkinci dış döngü (i = 1):
myNumbers[1] alt dizisini alır: {5, 6, 7}
İç döngü (j'yi 0'dan 2'ye kadar artırarak):
myNumbers[1][0] (5)
myNumbers[1][1] (6)
myNumbers[1][2] (7)
 */