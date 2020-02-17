public class Stack {
    int stck[] = new int[10];
    int tos;

    // Initialize top-of stack
    Stack() {
        tos = -1;
    }

    // Push an item on to the stack
    void push(int item) {
        if (tos==9) {
            System.out.println("Stack is full.");
        } else {
            stck[++tos] = item;
        }
    }

    // Pop an item from the stack
}
