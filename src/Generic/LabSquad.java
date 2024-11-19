package Generic;

import java.util.ArrayList;
import java.util.List;

public class LabSquad<T, T1> {
    String namaLabSquad;
    List<T> member;
    List<T1> dospem;

    public LabSquad(String namaLabSquad) {
        this.namaLabSquad = namaLabSquad;
        member = new ArrayList<>();
        dospem = new ArrayList<>();
    }
    public void addMember(T member1) {
        member.add(member1);
    }
    public void addDospem(T1 member1) {
        dospem.add(member1);
    }

    public String getNamaLabSquad() {
        return namaLabSquad;
    }

    public List<T> getMember() {
        return member;
    }

    public List<T1> getDospem() {
        return dospem;
    }

}
