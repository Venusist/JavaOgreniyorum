public class hocabes {    
    public static void main(String[] args) {
        for (int n = 2; n <= 100; n++) {
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) { 
                    count++;
                    break;
                } }
            if (count == 0) {
                System.out.print(n + ", ");
            } } } }
 
  