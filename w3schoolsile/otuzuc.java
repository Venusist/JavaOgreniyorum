import java.util.ArrayList; // Doğru import

public class otuzuc {
    // Burada ArrayList'i sınıf düzeyinde tanımlıyoruz
    ArrayList<String> cars = new ArrayList<String>();

    public static void main(String[] args) {
        // Static main metodunda ArrayList'i tanımlıyoruz
        otuzuc myObj = new otuzuc(); // Otuzuc sınıfından bir nesne oluşturuluyor
        myObj.cars.add("Volvo");  // cars listesine öğe ekleniyor
        myObj.cars.add("BMW");
        myObj.cars.add("Ford");
        
        // Listede bulunan elemanları yazdırıyoruz
        for (String car : myObj.cars) {
            System.out.println(car);
        }
    }
}
