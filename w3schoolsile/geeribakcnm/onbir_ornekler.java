public class onbir_ornekler {
    public static void main(String[] args) {
        
        //Find out if a person is old enough to vote:
    int myAge = 25;
    int votingAge = 18;

    if (myAge >= votingAge) {
        System.out.println("Old enough to vote!");
    } 
    else {
    System.out.println("Not old enough to vote.");
    }


    //Find out if a number is even or odd
    int myNum = 5;

    if (myNum % 2 == 0 ){
        System.out.println(myNum + " is even");
    } else {
        System.out.println(myNum + " is odd");
    }


// Real life example
int doorCode = 1337;
if (doorCode == 1337){
    System.out.println("Correct code. The door is now open ");
}   else {
    System.out.println("Wrong code. The door remains closed");
}


int myNumm = 10; // Is this a positive or negative number?
if (myNumm > 0) {
  System.out.println("The value is a positive number.");
} else if (myNumm < 0) {
  System.out.println("The value is a negative number.");
} else {
  System.out.println("The value is 0.");
}


    }
}