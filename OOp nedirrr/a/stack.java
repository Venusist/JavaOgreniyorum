class Stack {
    int stck[] = new int[10]; //Yığını tutacak dizi
    int tos; //Yığının üstündeki öge

Stack() {
    tos = -1; //Başlangıçta yığın boş
}

//Yığına öğe eklme
void push(int item) {
    if (tos == 9)
        System.out.println("Stack is full."); //stack doli
    else
        stck[++tos] = item; //öğreyi yığına ekleme

}

//yığından öğe çıkartma 
int pop() {
    if (tos<0) {
        System.out.println("Stack underflow"); //yığın boş
        return 0;
    }
    else {
        return stck[tos--]; //yığından öğe çıkar ve geri döndür
    }
 }
}

/* 
stck[]: Yığının veri yapısını tutar (burada bir dizi olarak tanımlanmıştır).
tos: Yığının üst öğesini temsil eden bir indeks.
push(): Bir öğe ekler.
pop(): Bir öğe çıkarır.

*/