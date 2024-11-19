package AmbisOracle;

import java.util.*;

public class SetTasMain {
    public static void main(String[] args) {
         /*
    oke jadi ketika kita ingin menginput sesuatu yang nilai nya itu unik maka kita akan
    akan menggunakan HashSet, namun HashSet ini tidak menampilkan data berdasrkan urutan
    nilai ataupun urutan dibuat(acak)
     */
        Set<Tas> tas = new HashSet<>();
        Tas tas1 = new Tas(1000);
        Tas tas2 = new Tas(2000);
        Tas tas3 = new Tas(5000);
        Tas tas4 = new Tas(10000);
        Tas tas5 = new Tas(20000);
        Tas tas6 = new Tas(50000);
        Tas tas7 = new Tas(100000);
        tas.add(tas1);
        tas.add(tas2);
        tas.add(tas3);
        tas.add(tas4);
        tas.add(tas5);
        tas.add(tas6);
        tas.add(tas7);
        for (Tas tasS : tas){
            System.out.println("Uang: " + tasS.getUang());
        }
        /*
        nah jika ingin membuat sebuah nilai unik yang tidak perlu diulang atau tidak
        ingin diulang dan sesuai urutan berdasarkan value maka kita akan menggunakan
        yang namanya TreeSet
         */

        System.out.println("INI DENGAN TREESET");
        System.out.println();
        Set<Tas> Treetas = new TreeSet<>();
        Tas tas12 = new Tas(10000);
        Tas tas21= new Tas(100000);
        Tas tas31 = new Tas(5000);
        Tas tas41 = new Tas(10000);
        Tas tas51 = new Tas(6000);
        Tas tas61 = new Tas(50000);
        Tas tas71 = new Tas(100000);

        Treetas.add(tas12);
        Treetas.add(tas21);
        Treetas.add(tas31);
        Treetas.add(tas41);
        Treetas.add(tas51);
        Treetas.add(tas61);
        Treetas.add(tas71);

        for (Tas tasS : Treetas){
            System.out.println("Uang: " + tasS.getUang());
        }
    }







}
