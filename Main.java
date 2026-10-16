import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Membuat LinkedStack dengan tipe data Box
        LinkedStack<Box> stack = new LinkedStack<>();

        // Memasukkan 6 data Box secara berurutan
        stack.push(new Box(40.0, 10.5));
        stack.push(new Box(35.0, 9.0));
        stack.push(new Box(29.0, 7.5));
        stack.push(new Box(25.5, 6.0));
        stack.push(new Box(19.0, 5.4));
        stack.push(new Box(15.0, 2.0));

        // Menampilkan hasil
        System.out.println("=== DATA BOX DALAM LINKED STACK ===");
        System.out.println("Jumlah Box: " + stack.size());
        System.out.println("Data dari TOP ke BOTTOM:");

        stack.display();
    }
}