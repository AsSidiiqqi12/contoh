package GassPuhh;

import java.util.Objects;

public class MahasiswaAtribut {
    String nama;
    String NIM;
    int umur;
    double GPA;
    int semester;

    public MahasiswaAtribut() {

    }

    public MahasiswaAtribut(String nama, String NIM, int umur, double GPA, int semester) {
        this.nama = nama;
        this.NIM = NIM;
        this.umur = umur;
        this.GPA = GPA;
        this.semester = semester;
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

    public double getGPA() {
        return GPA;
    }
    public int getSemester() {
        return semester;
    }

    @Override
    public String toString() {
        return "Nama: " + this.nama + "\nNIM: " + this.NIM + "\nUmur: " + this.umur + "\nGPA: " + this.GPA + "\nSemester: " + this.semester;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MahasiswaAtribut that = (MahasiswaAtribut) obj;
        return umur == that.umur && Double.compare(GPA, that.GPA) == 0
                && Objects.equals(NIM, that.NIM)
                && Objects.equals(nama, that.nama)
                && Objects.equals(semester, that.semester);

    }

    @Override
    public int hashCode() {
        return Objects.hash(nama,NIM,GPA,semester);
    }
}
