import java.util.Scanner; 

class takeinputfromuser {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //created scanner object
        System.out.println("Enter a number ");

        int i = obj.nextInt(); //read user input
        System.out.println("The input is: "+i); //output user input
    }
}