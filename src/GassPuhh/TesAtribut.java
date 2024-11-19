package GassPuhh;

public class TesAtribut {
    private final String nama;
    private final String umur;
    private final double IP;

    public TesAtribut(String nama, String umur, double IP) {
        this.nama = nama;
        this.umur = umur;
        this.IP = IP;
    }

    public String getNama() {
        return nama;
    }

    public String getUmur() {
        return umur;
    }

    public double getIP() {
        return IP;
    }
}
