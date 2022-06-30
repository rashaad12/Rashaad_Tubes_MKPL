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
public class DriverMahasiswa {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        System.out.println("Nama : Luqman Hadi Sudiana ");
        System.out.println("NIM : 1302190016 ");
        System.out.println("Kelas : SE4301 ");
        System.out.println("TP2_MOD3_PBO");
        System.out.println();
        System.out.println();
        System.out.println();
        prodi pr1_1302190016 = new prodi ();
        //        Variable baru untuk menyimpan data dari setCode dan setName dari method prodi
        pr1_1302190016.setCode("SE");
        //        Memanggil prosedur setCode yang ada di prodi dan dimasukan dalam variable pr1_1302190016
        pr1_1302190016.setName("Rekayasa Perangkat Lunak");
        //        Memanggil prosedur setName yang ada di prodi dan dimasukan dalam variable pr1_1302190016

        
        prodi pr2_1302190016 = new prodi ();
        //        Variable baru untuk menyimpan data dari setCode dan setName dari method prodi
        pr2_1302190016.setCode("IT");
        //        Memanggil prosedur setCode yang ada di prodi dan dimasukan dalam variable pr1_1302190016
        pr2_1302190016.setName("Teknologi Informasi");
        //        Memanggil prosedur setName yang ada di prodi dan dimasukan dalam variable pr1_1302190016
        
        mahasiswa mhs_1302190016 = new mahasiswa();
        //        Membuat variable untuk menampung isi dari mahasiswa
        mhs_1302190016.setNim("1302191234");
        //        Memanggil prosedur setNim yang ada di mahasiswa
        mhs_1302190016.setNama("Eren Yeager");
        //        Memanggil prosedur setNama yang ada di mahasiswa
        mhs_1302190016.setProdi(pr1_1302190016);
        //        Memanggil prosedur setNim yang isinya berisi dari pr1_1302190016
       
        
        mahasiswa mhs2_1302190016 = new mahasiswa();
        mhs2_1302190016.setNim("1303205555");
        //        Memanggil prosedur setNim yang ada di mahasiswa
        mhs2_1302190016.setNama("Armin Arlert");
        //        Memanggil prosedur setNama yang ada di mahasiswa
        mhs2_1302190016.setProdi(pr2_1302190016);
        //        Memanggil prosedur setNim yang isinya berisi dari pr2_1302190016
        
        mahasiswa mhs3_1302190016 = new mahasiswa();
        mhs3_1302190016.setNim("1302990001");
        //        Memanggil prosedur setNim yang ada di mahasiswa
        mhs3_1302190016.setNama("Mikasa Ackerman");
        //        Memanggil prosedur setNama yang ada di mahasiswa
        mhs3_1302190016.setProdi(pr1_1302190016);
        //        Memanggil prosedur setNim yang isinya berisi dari pr1_1302190016
        
        System.out.print("mhs1 : ");
        mhs_1302190016.play();
        System.out.println(" ");
        System.out.print("mhs2 : ");
        mhs2_1302190016.play();
        System.out.println(" ");
        System.out.print("mhs3 : ");
        mhs3_1302190016.play();
        System.out.println(" ");
        //        Merupakan untuk megoutput semua prosedur
    }
}
