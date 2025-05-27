public class hcaalti {
    static int add(int a, int b){
        int c;
        c=a+b;
        return c;
    }
    static float add(float a, float b){
        float c;
        c=a+b;
        return c;
    }

    public static void main(String[] args) {
        int i=4, j=5,sum;
        float f1=2.5f, f2=3.5f, fsum;
        sum = add(i,j);
        fsum = add(f1,f2);
        System.out.println("Sum of the integers is "+sum);
        System.out.println("Sum of the floats is "+fsum);
        
    }
}
