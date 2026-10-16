public class LinkedStack<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;
    private int size;

    public LinkedStack() {
        top = null;
        size = 0;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if (top == null) {
            throw new IllegalStateException("Stack kosong");
        }

        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public T peek() {
        if (top == null) {
            throw new IllegalStateException("Stack kosong");
        }

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void display() {
        Node<T> current = top;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}