package AmbisOracle;

import java.util.Stack;

public class StackLinkedListMain {
    public static void main(String[] args) {
        Stack<String> nama = new Stack<>();
        nama.push("Pohan");
        nama.push("Raju");
        nama.push("Aji");
        nama.push("Rendy");
        nama.push("Ray");

        System.out.println(nama.peek());
        System.out.println(nama.search("Pohan"));

        while (!nama.empty()) {
            nama.pop();
        }
        System.out.println(nama);

        //penggunaan stack?
        //1. undo/redo fitur di teks editor
        //2. Maju mundur unutk broswer kayak panah kanan kiri
        //3. algoritma pencarian mundur kayak maze
    }
}

