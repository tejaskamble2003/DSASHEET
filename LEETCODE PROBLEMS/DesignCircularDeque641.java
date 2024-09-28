
/* 
Question Summary
The task is to design and implement a circular double-ended queue (deque) in Java, encapsulated in a class named MyCircularDeque. The class should support various operations such as inserting and deleting elements from both ends, checking the status of the deque, and retrieving elements from the front and rear.

Answer
Here is a concise implementation of the MyCircularDeque class in Java:

This implementation utilizes an array to store the elements and maintains pointers for the front and rear of the deque. The operations are designed to handle circular indexing, ensuring efficient insertions and deletions from both ends while adhering to the constraints provided. */
class DesignCircularDeque641 {
    private int[] deque;
    private int front, rear, size, capacity;

    public DesignCircularDeque641(int k) {
        capacity = k;
        deque = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;
        front = (front - 1 + capacity) % capacity;
        deque[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;
        deque[rear] = value;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;
        rear = (rear - 1 + capacity) % capacity;
        size--;
        return true;
    }

    public int getFront() {
        return isEmpty() ? -1 : deque[front];
    }

    public int getRear() {
        return isEmpty() ? -1 : deque[(rear - 1 + capacity) % capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}


