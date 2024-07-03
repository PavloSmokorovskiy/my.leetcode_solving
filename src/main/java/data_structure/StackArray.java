package data_structure;

/*
    Stack Array LIFO
    methods:
    push
    pop
    peek
    isEmpty
    isFull
    size
    print
 */

public class StackArray {

    private final int[] stack;
    private final int capacity;
    private int top;

    public StackArray(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public void push(int i) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full!");
        } else {
            stack[++top] = i;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        } else {
            return stack[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        } else {
            return stack[top];
        }
    }

    public int size() {
        return capacity;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void print() {
        for (var i = 0; i <= top; i++) {
            System.out.print(stack[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());

        stack.push(4);
        stack.print();
    }
}
