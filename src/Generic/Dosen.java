package Generic;

public class Dosen {
    String nama;
    String NIP;
    int umur;

    public Dosen(String nama, String NIP, int umur) {
        this.nama = nama;
        this.NIP = NIP;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
