package AmbisOracle;

public class Mahasiswa {
    private final String nama;
    private final String NIM;
    private final int umur;

    public Mahasiswa(String nama, String NIM, int umur) {
        this.nama = nama;
        this.NIM = NIM;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return NIM;
    }

    public int getUmur() {
        return umur;
    }
}
