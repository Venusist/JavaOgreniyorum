public class on_ifelse {
    public static void main(String[] args){

/*
Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed
*/

    if(10 > 8) {
        System.out.println("10 is greater than 8");
        /* yani normal if kullanımı */
   }


   int x = 20;
   int y = 18;
   if (x > y) {
     System.out.println("x is greater than y");
   }


   int time = 22;
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// Outputs "Good evening."
/*Use the else if statement to specify a new condition if the first condition is false */
//*******************************/
//Short hand if..else (TERNARY OPERATOR)
//variable = (condition) ? expressionTrue :  expressionFalse;


int timee = 12;
String result = (timee < 18) ? "Good day." : "Good evening.";
System.out.println(result);

/* while kullanımı da aynı  */
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}
}
}