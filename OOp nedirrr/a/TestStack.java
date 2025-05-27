// Stack sınıfı
class Stack {
    int stck[] = new int[10];  // Yığın için dizi
    int tos;                    // Yığının üstündeki öğe

    // Yapıcı (constructor)
    Stack() {
        tos = -1;  // Başlangıçta yığın boş
    }

    // Yığına öğe ekleme
    void push(int item) {
        if (tos == 9)
            System.out.println("Stack is full.");  // Yığın dolu
        else
            stck[++tos] = item;  // Öğeyi yığına ekle
    }

    // Yığından öğe çıkarma
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");  // Yığın boş
            return 0;
        } else {
            return stck[tos--];  // Yığından öğe çıkar ve geri döndür
        }
    }
}

// TestStack sınıfı
public class TestStack {
    public static void main(String args[]) {
        Stack mystack1 = new Stack();  // İlk yığın
        Stack mystack2 = new Stack();  // İkinci yığın

        // İlk yığına bazı sayılar ekleyelim
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        // Yığından öğeler çıkaralım
        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());
    }
}

/* Açıklamalar:
mystack1 ve mystack2 adlı iki farklı yığın (stack) nesnesi oluşturduk.
İlk yığına 0-9 arası sayılar ekledik, ikinci yığına ise 10-19 arası sayılar ekledik.
Daha sonra her iki yığından öğeleri pop ettik ve ekrana yazdırdık.
Yığınlar birbirinden bağımsız çalıştı, her biri kendi verisini tutuyor. */