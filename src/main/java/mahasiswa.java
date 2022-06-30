/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivermahasiswa;

/**
 *
 * @author Hadi
 */
public class mahasiswa {
    String Nim_1302190016, Nama_1302190016;
//    Merupakan dua variable berbentuk String
    prodi Prodi_1302190016;
//    Merupakan variable dari method prodi

    public String getNim() {
        return Nim_1302190016;
        //        Merupakan Getter dari Nim
    }

    public void setNim(String Nim_1302190016) {
        this.Nim_1302190016 = Nim_1302190016;
        //        Merupakan Setter dari Nim
    }

    public String getNama() {
        return Nama_1302190016;
        //        Merupakan Getter dari Nama
    }

    public void setNama(String Nama) {
        this.Nama_1302190016 = Nama_1302190016;
        //        Merupakan Setter dari Nama
    }

    public String getProdi() {
        String nami_1302190016 = Prodi_1302190016.name_1302190016;
        //        Merupakan variable untuk memanggil variable yang ada di method prodi
        String kode_1302190016 = Prodi_1302190016.code_1302190016;
        //        Merupakan variable untuk memanggil variable yang ada di method prodi
        String gab_1302190016 = "[" + nami_1302190016 + "]"+" ("+ kode_1302190016+")";
        //        Merupakan variable untuk menggabungkan isi dari var mana dan kode
        return gab_1302190016;
        //        Untuk memanggil/ me return dari variable gab_1302190016
    }

    public void setProdi(prodi Prodi_1302190016) {
        this.Prodi_1302190016 = Prodi_1302190016;
        //        Untuk merujuk pada variable prodi
    }
        
    public int getAngkatan(){
        char kodeAngkatan1_1302190016 = Nim_1302190016.charAt(4);
        //        Membuat variable char fan memasukan Nim lalu dipasrsing ke bentuk data char
        char kodeAngkatan2_1302190016 = Nim_1302190016.charAt(5);
        //        Membuat variable char fan memasukan Nim lalu dipasrsing ke bentuk data char
        
        String Angkatan1_1302190016 = Character.toString(kodeAngkatan1_1302190016);
        //        Membuat variable dalam bentuk string untuk mengembalikan tipe data char ke dalam String
        String Angkatan2_1302190016 = Character.toString(kodeAngkatan2_1302190016);
        //        Membuat variable dalam bentuk string untuk mengembalikan tipe data char ke dalam String
        String outputAKT = Angkatan1_1302190016 + Angkatan2_1302190016;
        //        Membuat variable output yang didalamnya menggabungkan isi dari dua variable sebelumnya
        
        int namaAKT_1302190016 = Integer.parseInt(outputAKT);
        //        Membuat variable bertipe data integer lalu memparsing tipe datanya yang berisi String menjadi integer
        return namaAKT_1302190016;
        //        Untuk memanggil/ me return dari variable namaAKT_1302190016
    }   
    public void play(){
        //        Untuk menyimpan atau menyiapkan apa yang akan di outputkan
        System.out.print(" "+ getProdi());
        //        Untuk mengoutput hasil dari getProdi
        System.out.print(" "+getNim());
        //        Untuk mengoutput hasil dari getNim
        System.out.print(" "+getNama()+" || ");
        //        Untuk mengoutput hasil dari getNama
        System.out.print("Angkatan : "+getAngkatan());
        //        Untuk mengoutput hasil dari getAngkatan
    }
}