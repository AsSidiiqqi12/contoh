package DSA;

public class SearchAtribut {
    String nama;
    String NIM;
    String umur;
    double GPA;

    public SearchAtribut(String nama, String NIM, String umur, double GPA) {
        this.nama = nama;
        this.NIM = NIM;
        this.umur = umur;
        this.GPA = GPA;
    }

    public SearchAtribut(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return NIM;
    }

    public String getUmur() {
        return umur;
    }

    public double getGPA() {
        return GPA;
    }
}
