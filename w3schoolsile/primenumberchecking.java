
public class primenumberchecking {
    public static void main(String[] args){

        int n=17 ,i,isPrime;
        isPrime=1;
        for(i=2;i<n;i++){
            if(n%i==0)
                isPrime=0;
        }
        if(isPrime==1)
            System.out.println("The number is prime.");
            else
            System.err.println("The number is not prime");

        }
    }
    
