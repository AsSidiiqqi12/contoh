package AmbisOracle;

public class Buku implements Comparable<Buku>{
    private String isbn;
    private String pengarang;
    private String judul;
    private String tanggalTerbit;
    private String penerbit;
    private String hargaBUku;

    public Buku(String isbn, String pengarang, String judul, String tanggalTerbit, String penerbit, String hargaBUku) {
        this.isbn = isbn;
        this.pengarang = pengarang;
        this.judul = judul;
        this.tanggalTerbit = tanggalTerbit;
        this.penerbit = penerbit;
        this.hargaBUku = hargaBUku;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTanggalTerbit() {
        return tanggalTerbit;
    }

    public void setTanggalTerbit(String tanggalTerbit) {
        this.tanggalTerbit = tanggalTerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getHargaBUku() {
        return hargaBUku;
    }

    public void setHargaBUku(String hargaBUku) {
        this.hargaBUku = hargaBUku;
    }

    @Override
    public String toString() {
        return "ISBN: " + this.isbn + "  , Pengarang: " + this.pengarang +
                "  , Judul Buku: " + this.judul+ "  , Tanggal terbit: " + this.tanggalTerbit + "  , Penerbit: " + this.penerbit +
                "  , Harga Buku: " + this.hargaBUku;
    }

    @Override
    public int compareTo(Buku o) {
        return String.CASE_INSENSITIVE_ORDER.compare(this.pengarang, o.pengarang);
    }
}
