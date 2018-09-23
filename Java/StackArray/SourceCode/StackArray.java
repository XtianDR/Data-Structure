package stackarray;

public class StackArray {
    public static void main(String[] args) {
        PushNPop stack = new PushNPop();
        stack.setCapacity(3);
        stack.display();
        stack.push(1);
        stack.push(5);
        stack.push(3);
        stack.push(4);
        stack.display();
        stack.pop();
        stack.pop();
        stack.display();
        stack.pop();
        stack.pop();
        stack.display();
    }
}
