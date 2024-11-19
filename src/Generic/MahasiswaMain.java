package Generic;

public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("As siddiqi pohan","12350111224",19);
        Mahasiswa mahasiswa2 = new Mahasiswa("Haniva Zhara","12350112345",19);
        Mahasiswa mahasiswa3 = new Mahasiswa("Pangeran Nusa","12350111223",19);

        Dosen dospem1 = new Dosen("Pizaini","129101821",35);
        Dosen dospem2 = new Dosen("Rahmat","1291018290",40);
        Dosen dospem3 = new Dosen("Jasril","1291018900",43);

        Kampus<Mahasiswa> UIN = new Kampus<>("Universitas Islam Negeri Sultan Syarif Kasim Riau");
        UIN.addItem(mahasiswa1);
        UIN.addItem(mahasiswa2);
        UIN.addItem(mahasiswa3);

        System.out.println("Mahasiswa di kampus " + UIN.getName());
        for (Mahasiswa mha : UIN.getMahasiwa()){
            System.out.println(mha.getNama());

        }

        LabSquad<Mahasiswa, Dosen> Lab = new LabSquad<>("RDO x Alisi");
        Lab.addMember(mahasiswa1);
        Lab.addMember(mahasiswa2);
        Lab.addMember(mahasiswa3);
        Lab.addDospem(dospem1);
        Lab.addDospem(dospem2);
        Lab.addDospem(dospem3);

        System.out.println("Lab Squad " + Lab.getNamaLabSquad() + " Member beserta dospem: ");
        for (Dosen dosen : Lab.getDospem()){
            System.out.println("- Dosen: " + dosen.getNama() + "\n NIP: " + dosen.getNIP()
            + "\n Umur: " + dosen.getUmur());
        }
        for (Mahasiswa mha : Lab.getMember()){
            System.out.println("- Mahasiswa: " + mha.getNama() + "\n NIM: " + mha.getNIM()
                    + "\n Umur: " + mha.getUmur());
        }



    }
}
