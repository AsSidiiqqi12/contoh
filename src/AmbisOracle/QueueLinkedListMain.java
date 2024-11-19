package AmbisOracle;

import java.util.*;

public class QueueLinkedListMain {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("As siddiqi Pohan");
        queue.offer("Najah Karimah Muklis");
        queue.offer("Rendy Risqika Maulana");
        queue.offer("Ahmad Sholihin");
        queue.offer("Dandy Teguh Pratama");

        //for (String s : queue) {
        // //    System.out.println(s);
        // }
        while (!queue.isEmpty()) {
            queue.poll();
        }
        System.out.println("Daftar Mahasiswa: " + queue);

        //untuk urutan atau bisa dibilang ini priority queue

        Queue<String> queue2 = new PriorityQueue<>();
        queue2.offer("Ahmad Sholihin");
        queue2.offer("Dandy Teguh Pratama");
        queue2.offer("Rendy Risqika Maulana");
        queue2.offer("Abdul Hakim");
        queue2.offer("Bima Sakti Franza");

        System.out.println(queue2.peek());
        queue2.poll();
        System.out.println(queue2.peek());



        //System.out.println("Daftar Mahasiswa: " + queue2);
    }
}
