package GassPuhh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.LinkedList;
import java.util.List;

public class MahasiswaMain {
    public static void main(String[] args) {
        String namaFile = "C:\\Ambis\\java\\sblmts\\src\\GassPuhh\\Data.txt";
        List<MahasiswaAtribut> mahasiswaAtributList = new LinkedList<>();
        try(BufferedReader bf = new BufferedReader(new FileReader(namaFile))) {
            String line;
            while ((line = bf.readLine()) != null ){
                String[] data = line.split(", ");
                MahasiswaAtribut mahasiswaAtribut = new MahasiswaAtribut(data[0],data[1],Integer.parseInt(data[2]),Double.parseDouble(data[3]),Integer.parseInt(data[4]));
                mahasiswaAtributList.add(mahasiswaAtribut);
            }

        }catch (IOException e){
            System.err.println(e.getMessage());
        }

        for (MahasiswaAtribut mahasiswaAtribut : mahasiswaAtributList){
            System.out.println(mahasiswaAtribut);
            System.out.println();
        }
        System.out.println(mahasiswaAtributList.get(4));//cari di index 4 ada siapa

        MahasiswaAtribut mahasiswaAtribut = new MahasiswaAtribut("Yuni", "664231", 20, 2.34, 6);


        int index = mahasiswaAtributList.indexOf(mahasiswaAtribut);
        System.out.println(index);
    }
}
