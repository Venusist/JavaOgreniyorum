public class hcayedi {

    static int sumArray(int array[][]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j]; 
            }}
        return sum;
    }
    static double sumArray(double array[][]) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j]; }}
        return sum;
    }
    public static void main(String[] args) {
        int[][] intArray = { {1, 2, 3},{1, 0, 2}};
        
        int intSum = sumArray(intArray);
        System.out.println("Sum of int array elements: " + intSum);

        double[][] doubleArray = {{2.4, 3, 5.5},{1.5, 7.3, 3}};
        double doubleSum = sumArray(doubleArray); 
        System.out.println("Sum of double array elements: " + doubleSum);
    }
}
