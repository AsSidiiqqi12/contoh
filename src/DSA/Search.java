package DSA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaFile = "C:\\Ambis\\java\\sblmts\\src\\DSA\\students_with_names.txt";
        List<SearchAtribut> searchList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(namaFile))){
            String line;
            while((line=br.readLine())!=null){
                String[] splitted = line.split(", ");
                SearchAtribut scr = new SearchAtribut(splitted[0],splitted[1],splitted[2],Double.parseDouble(splitted[3]));
                searchList.add(scr);
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
        System.out.print("Masukkan nama yang dicari: ");
        String cariNama = sc.nextLine();


        int lastIndex = -1;

        // Temukan indeks terakhir dari elemen yang cocok
        for (int i = searchList.size() - 1; i >= 0; i--) {
            if (searchList.get(i).getNama().equalsIgnoreCase(cariNama)) {
                lastIndex = i;
                break;
            }
        }

        StringBuilder str = new StringBuilder();
        boolean found = false;

        for (int i = 0; i < searchList.size(); i++) {
            if (searchList.get(i).getNama().equalsIgnoreCase(cariNama)) {
                if (found){
                    if (i == lastIndex){
                        str.append(" dan ");
                    }else {
                        str.append(", ");
                    }

                }
                found = true;
                str.append(i);

            }

        }
        if(found){
            System.out.println("Mahasiswa dengan nama " + cariNama + " ada pada index ke-" + str);
        }else {
            System.out.println("Mahasiswa dengan nama " + cariNama + " tidak ditemukan");
        }

    }
}
