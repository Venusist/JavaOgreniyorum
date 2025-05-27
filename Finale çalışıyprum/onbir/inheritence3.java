/* Although a subclass includes all of the members of its superclass, it cannot access private members of the superclass. */

//create a superclass
class A {
    int i; //public by default 
    private int j; //private to A 

    void setij(intx, int y) {
        i= x ;
        j = y ;
    }
}

// A's j is not accessible here
class B extends A {
    int total;

    void sum() {
        total i+j; //ERROR j is not accessible here
    }
}