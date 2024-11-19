package DSA;

import java.util.Scanner;

public class SequentialSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nama = {"Pohan","Dandy","Agil","Sholihin","Hafiz"};
        System.out.print("Masukkan nama : ");
        String cari = sc.nextLine();

        namaSearch(nama, cari);
    }

    private static void namaSearch(String[] nama, String cari) {
        StringBuilder str = new StringBuilder();
        boolean cariFound = false;
        for (int i = 0; i < nama.length; i++) {
            if (cari.equalsIgnoreCase(nama[i])) {
                if (cariFound) {
                    str.append("dan");
                }
                str.append(i);
                cariFound = true;
            }

        }
        if (cariFound) {
            System.out.println(cari + " ada pada index " + str);
        }else{
            System.out.println(cari + " tidak ditemukan");
        }
    }
}
