package DSA;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] angka = {1,4,5,7,3,2,5};
        int cari = sc.nextInt();

        Linearsearch(angka,cari);

        /*if (a != -1){
            System.out.println(cari + " ada pada index " + a);
        }else {
            System.err.println("Tidak ada pada array");
        }*/
    }

    private static void Linearsearch(int[] angka, int cari) {
        StringBuilder hasil = new StringBuilder();
        boolean found = false;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                if (found) {
                    hasil.append(" dan ");
                }
                hasil.append(i);
                found = true;
            }
        }

        if (found) {
            System.out.println(cari + " berada pada index " + hasil);
        } else {
            System.err.println("Tidak ada pada array");
        }
    }

    /*private static int Linearsearch(int[] angka, int cari) {
        for (int i = 0; i < angka.length; i++) {
            if(angka[i] == cari) {
                return i;
            }
        }
        return -1;

    }*/
}
