package strukturdata;

// Stack generik yang diimplementasikan dengan Linked List (manual)
public class LinkedStack<T> {

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node top;
    private int size;

    // Menambah data ke puncak stack
    public void push(T data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Mengambil dan menghapus data dari puncak stack
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return null;
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // Melihat data di puncak stack tanpa menghapusnya
    public T peek() {
        return isEmpty() ? null : top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    // Mengunjungi isi stack dari puncak ke dasar tanpa mengubah stack
    public void forEachFromTop(java.util.function.Consumer<T> action) {
        Node current = top;
        while (current != null) {
            action.accept(current.data);
            current = current.next;
        }
    }
}