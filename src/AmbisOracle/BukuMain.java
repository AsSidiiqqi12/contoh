package AmbisOracle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class BukuMain {
    public static void main(String[] args) {
        String fileNama = "C:\\Ambis\\java\\sblmts\\src\\AmbisOracle\\cobacoba.txt";
        Set<Buku> bukuSet = new TreeSet<>();
        try(BufferedReader br = new BufferedReader(new FileReader(fileNama))) {
            String line;
            while ((line = br.readLine()) != null){
                String[] pisah = line.split(", ");
                Buku buku = new Buku(pisah[0],pisah[1],pisah[2],pisah[3],pisah[4],pisah[5]);
                bukuSet.add(buku);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());

        }

        for (Buku buku : bukuSet){
            System.out.println(buku);
        }
    }
}
