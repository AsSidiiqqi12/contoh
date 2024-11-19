package Generic;

public class Mahasiswa {
    String nama;
    String NIM;
    int umur;

    public Mahasiswa(String nama, String NIM, int umur) {
        this.nama = nama;
        this.NIM = NIM;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String toString() {
        return "\n Nama: " + this.nama + "\n NIM: " + this.NIM + "\n Umur: " + this.umur;
    }
}
