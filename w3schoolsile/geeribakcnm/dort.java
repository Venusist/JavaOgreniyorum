public class dort {
    public static void main(String[] args){

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        int x = 10;
        System.out.println(x == 10); //returns true,
        System.out.println(9 >  10 ); //returns false

/*The char data type is used to store a single character. Alternatively,
 if you are familiar with ASCII values, you can use those to display certain characters:
 mesela 54. sayı a dır o zaman 54 olarak atarsın ama sana a olarak çıktı verir vs. */
 
int items = 50;
float costPerItem = 9.99f;
float totalCost = items * costPerItem;
char currency = '$';

System.out.println("Number of items: " + items);
System.out.println("Cost per item: " + costPerItem + currency);
System.out.println("Total cost = " + totalCost + currency);

   // Set the maximum possible score in the game to 500
int maxScore = 500;

// The actual score of the user
int userScore = 423;

/* Calculate the percantage of the user's score in relation to the maximum available score.
Convert userScore to float to make sure that the division is accurate */
float percentage = (float) userScore / maxScore * 100.0f;
/*Eğer biri float, diğeri int ise → Java, diğerini otomatik olarak float'a çevirir. */
System.out.println("User's percentage is " + percentage);
}
}
