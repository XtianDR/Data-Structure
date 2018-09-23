package stackarray;

public class PushNPop {

    private int top;
    int size;
    int[] stack;

    PushNPop() {
    }

    void setCapacity(int Size) {
        this.size = Size;
        stack = new int[size];
        top = -1;
        System.out.println("Set capacity to " + size + ".");
    } //Set stack capacity

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Invalid! The STACK is FULL!");
        } else {

            top = top + 1;
            stack[top] = value;
            System.out.println("You PUSH!");
        }
    } //To push the stack

    void pop() {
        if (!isEmpty()) {
            stack[top] = 0;
            top = top - 1;
            System.out.println("You POP!");
        } else {
            System.out.println("Invalid! The STACK is EMPTY!");
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

    void display() {
        System.out.println("The elements are");
        for (int i = 0; i < size; i++) {
            System.out.print(stack[i] + " ");
        }
        if (top == -1) {
            System.out.println("\nTOP @ index 0");
        } else {
            System.out.println("\nTOP @ index " + top);
        }
    }
}
