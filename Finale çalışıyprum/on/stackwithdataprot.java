class Stack {
    private int stck[] = new int[10]; //stck[]: Verilerin (int) tutulduğu dizi. Kapasitesi 10.
    private int tos; // top of stack em , üstteki elemanın indeksini tutar boşken = -1

    Stack() { //constructor
        tos = -1; //yeni stack oluşturulunca tos -1 yapılır bu da boş olduğuun gösterir
    }

    //push an item onto the stack
    void push(int item) {
        if(tos==9)
            System.out.println("Stack is full"); //tos == 9 → Stack zaten 10 elemanla dolmuşsa, daha fazla eleman eklenemez.
        else    
            stck[++tos] = item; //Yoksa önce tos bir arttırılır, sonra eleman oraya konur
    }

    //pop an item from stack
    int pop() {
        if(tos < 0) { //Eğer tos < 0 ise: Stack zaten boş, eleman yok → Stack underflow.
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return stck[tos--]; //Aksi takdirde en üstteki elemanı döndürüp stack’ten çıkarır.
    }
}

class stackwithdataprot {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();

        //push some numbers onto the stac // Stack'e 0'dan 9'a kadar eleman ekleniyor
        for(int i=0; i<10;i++)
            mystack1.push(i);

            //pop those numbers off the stack
            // Stack'ten elemanlar çekiliyor (LIFO mantığıyla)
            System.out.println("Stack in mystack1: ");
            for(int i= 0; i<10;i++)
                System.out.println(mystack1.pop());
    }
}