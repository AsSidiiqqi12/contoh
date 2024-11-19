package AmbisOracle;

import java.util.ArrayList;

public class ListMahasiswaMain {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();
        Mahasiswa mahasiswa1 = new Mahasiswa("As siddiqi Pohan","12350111224",19);
        Mahasiswa mahasiswa2 = new Mahasiswa("Rendy Risqika Maulana","1235011235",19);
        mahasiswa.add(mahasiswa1);
        mahasiswa.add(mahasiswa2);
        String pesan = "Daftar Nama Mahasiswa UIN SUSKA RIAU: ";
        for (char c : pesan.toCharArray()){
            System.out.print(c);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for (Mahasiswa maha : mahasiswa){
            System.out.println("Nama: " + maha.getNama() + "\nNIM: " + maha.getNIM()
            + "\nUmur: " + maha.getUmur());
        }

    }
}
