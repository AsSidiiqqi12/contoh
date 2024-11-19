package GassPuhh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesFile {

    List<TesAtribut> atributs = new ArrayList<>();
    public void untukTombol() {
        String nama = "C:\\Ambis\\java\\sblmts\\src\\GassPuhh\\student_data.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(nama))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(", ");
                TesAtribut tesAtribut = new TesAtribut(data[0], data[1], Double.parseDouble(data[2]));
                this.atributs.add(tesAtribut);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public String cari(){
        StringBuilder str = new StringBuilder();
        str.append("Daftar Mahasiswa dari IP: ").append("\n");
        this.atributs.sort(Comparator.comparing(TesAtribut::getIP).reversed());
        int i = 1;
        for (TesAtribut tesAtribut : this.atributs) {
            str.append(i).append(" ").append(tesAtribut.getNama()).append(" IP: ").append(tesAtribut.getIP()).append("\n");
            i++;
        }
        return str.toString();

    }
    public String urut(String nama){
        StringBuilder str = new StringBuilder();
        boolean found = false;
        int index = 0;
        for (int i = 0; i < this.atributs.size(); i++) {
            if (this.atributs.get(i).getNama().equalsIgnoreCase(nama)) {
                found = true;
                index = i;
            }
        }
        if(found){
            str.append(nama).append(" ditemukan pada index ").append(index);
        }else {
            str.append(nama).append(" tidak ditemukan ");
        }
        return str.toString();
    }

}
