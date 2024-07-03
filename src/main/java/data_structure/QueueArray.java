package data_structure;

/*
    Queue Array FIFO
    methods:
    offer
    poll
    peek
    isEmpty
    isFull
    size
    print
 */

public class QueueArray {

    private final int[] queue;
    private final int capacity;
    private int front, rear, count;

    public QueueArray(int size) {
        queue = new int[size];
        capacity = size;
        front = count = 0;
        rear = -1;
    }

    public void offer(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = item;
            count++;
        }
    }

    public int poll() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        } else {
            int item = queue[front];
            front = (front + 1) % capacity;
            count--;
            return item;
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        } else {
            return queue[front];
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }

    public void clear() {
        count = 0;
    }

    public int size() {
        return count;
    }

    public void print() {
        var i = front;
        for (var c = 0; c < count; c++) {
            System.out.print(queue[i] + ", ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println("Peek: " + queue.peek());
        queue.poll();
        System.out.println("Poll: " + queue.poll());

        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);

        queue.print();
        queue.clear();
    }
}
