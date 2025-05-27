class Stack {
    private int stck[] = new int[10]; // 10 elemanlık bir dizi
    private int tos; //(top of stack)

    // Constructor
    Stack() {
        tos = -1;
    }

    // Yığına eleman ekle
    void push(int item) {
        if (tos == 9) {
            System.out.println("Yigin dolu.");
        } else {
            stck[++tos] = item;
        }
    }

    // Yığından eleman çıkar
    int pop() {
        if (tos < 0) {
            System.out.println("Yigin bos (Underflow).");
            return 0;
        } else {
            return stck[tos--];
        }}}

public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();

        // Yığına 0-9 arası sayıları ekle
        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }

        // Yığından elemanları çıkar ve yazdır
        System.out.println("mystack1 içeriği:");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }
    }
}