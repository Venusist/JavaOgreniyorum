public class dokuz {
    public static void main(String[] args) {
        
        // En büyük değeri bulma
        int maxVal = Math.max(5, 10);
        System.out.println("Max: " + maxVal); // Çıktı: Max: 10

        // En küçük değeri bulma
        int minVal = Math.min(5, 10);
        System.out.println("Min: " + minVal); // Çıktı: Min: 5

        // Karekök hesaplama
        double sqrtVal = Math.sqrt(64);
        System.out.println("Square Root: " + sqrtVal); // Çıktı: Square Root: 8.0

        // Mutlak değer hesaplama
        double absVal = Math.abs(-4.7);
        System.out.println("Absolute: " + absVal); // Çıktı: Absolute: 4.7

        // Rastgele sayı üretme (0.0 ile 1.0 arasında)
        double randomVal = Math.random();
        System.out.println("Random (0-1): " + randomVal);

        // 0 ile 100 arasında rastgele bir tam sayı üretme
        int randomNum = (int) (Math.random() * 101);
        System.out.println("Random (0-100): " + randomNum);
    }
}
