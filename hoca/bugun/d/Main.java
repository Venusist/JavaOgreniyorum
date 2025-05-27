class Vehicle {
    public String maker;
}

class Car extends Vehicle {
    public String modelName;
}

class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.maker = "Honda";
        myCar.modelName = "Accord";

        System.out.println(myCar.maker + " " + myCar.modelName);
    }
}
