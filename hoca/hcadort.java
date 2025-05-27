public class hcadort {
    static int power(int x, int n){
        int product=1;
        for(int i=0; i<n;i++){
            product=product*x;
        }
        return product;
    }
    public static void main(String[] args){
        int a=2, n=4;
        System.out.println("Value of a^n is " + power(a,n));
    }
}
