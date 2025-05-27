class Test {
    int a;
    Test(int i) {
        a=i;
    }
    void show() {
        System.out.println(a);
    }
}

public class soru {
    public static void main(String[] args) {
        Test t1 = new Test(4);
        Test t2 = new Test(7);

        t1.show();
        t2.show();
    }
}