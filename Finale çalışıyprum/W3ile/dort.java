//Access Methods With an Object
public class dort {
    
    public void fullThrottle() {
        System.out.println("The car is going fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is "+ maxSpeed);
    }

    //insde main call methods on the mycar object
    public static void main(String[] args) {
        dort myCar = new dort(); //dort sınıfına göre bir araba yap ve ona myCar adını ver.
        myCar.fullThrottle();
        myCar.speed(200); //call speed method  
    }   
}

