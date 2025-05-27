public class hocaaaa {
        public static void main(String[] args) {
          int a[] = {5, 7, 3, 1, 11, 12, 8, 4, 9, 15};
            int smallest = a[0];
            for (int i = 1; i < a.length; i++) {
                if (a[i] < smallest) {
                    smallest = a[i];
                } }
            System.out.println("The smallest number in the array is: " + smallest);
        } } 
 