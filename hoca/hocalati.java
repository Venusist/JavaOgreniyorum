public class hocalati {
    public static void main(String[] args) {
        int ages[] = {20,22,18,35,48,26,87,70};
        float avg, sum=0;
        for(int i=0; i<8;i++){
            sum = sum + ages[i];
        }

        avg=sum/8;
        System.out.println("The average is: " + avg);
        
    }
}
