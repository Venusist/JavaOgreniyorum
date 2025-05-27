public class uc {
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    //public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    //Main method
    public static void main(String[] args) {
        myStaticMethod(); //call static method
        // but myPublicMethod(); This would compile an error bc its public and needs to create an object

        uc myObj = new uc();
        myObj.myPublicMethod();    
    }
}
