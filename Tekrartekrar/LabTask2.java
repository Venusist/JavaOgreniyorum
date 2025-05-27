class Stack {
    private int stck[] = new int[10];
    private int tos;

    Stack() {
        tos = -1; //tos of stack
    }

    void push(int item) {
        if(tos==9)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }

    int pop() {
        if(tos < 0) {
            System.out.println("Stack underflow");
            return 0;
            }
        else
            return stck[tos--];
    }
}

public class LabTask2 {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();

        for(int i=0; i<10; i++)
            mystack1.push(i);

        System.out.println("Stack in mystack1: ");
        for(int i =0; i<10;i++)
            System.out.println(mystack1.pop());
    }
}
