public class onsekiz {
    public static void main(String[] args){

        int ages[] = {20, 22, 18, 45, 36, 21,70,80,9};
        int length = ages.length;
        System.out.println("küme uzunuluğu "+ length);
    /*.length, dizinin eleman sayısını veren Java'nın hazır bir özelliğidir. */
    /*ages.length yazdığında, ages dizisinin kaç eleman içerdiğini öğrenmiş oluyorsun. */
    
        int lowestAge = ages[0];

        for(int age : ages)
        //enhanced for loop kullanarak dizinin tüm elemanlarını kontrol ediyorsun. Eğer lowestAge, şu an kontrol edilen age değerinden büyükse, onu güncelliyorsun.
        {
            if(lowestAge>age){
                lowestAge = age;
            }
        }
System.out.println("The lowest age in the array is: " + lowestAge);
    } }
