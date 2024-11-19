package AmbisOracle;

public class Tas implements Comparable<Tas>{
    int uang;

    public Tas(int uang) {
        this.uang = uang;
    }

    public int getUang() {
        return uang;
    }

    /*
    ini digunakan jika kita membuat sebuah TreeSet dengan objek, karena dia belum terdeteksi
    type data sebenarnya apa, maka kita harus compare manual dengan implementasi
     */
    @Override
    public int compareTo(Tas o) {
        return Integer.compare(this.uang,o.uang);
    }
}
