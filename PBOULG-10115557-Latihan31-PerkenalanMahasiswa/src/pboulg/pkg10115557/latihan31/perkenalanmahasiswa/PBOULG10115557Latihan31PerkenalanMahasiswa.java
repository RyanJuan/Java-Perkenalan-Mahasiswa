/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pboulg.pkg10115557.latihan31.perkenalanmahasiswa;

/**
 *
 * @author 
 * NAMA     : Rayan
 * KELAS    : PBO-Ulg
 * NIM      : 10115557
 * Deskripsi Program : Membuat program perkenalan mahasiswa berbasis object
 */
public class PBOULG10115557Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
            mhs1.nim = "10110269";
            mhs1.nama = "Rizki Adam Kurniawan";
            mhs1.perkenalanMahasiswa(mhs1.nim, mhs1.nama);
            
        Mahasiswa mhs2 = new Mahasiswa();
            mhs2.nim = "10110270";
            mhs2.nama = "Indra Tiola";
            mhs2.perkenalanMahasiswa(mhs2.nim, mhs2.nama);
            
        Mahasiswa mhs3 = new Mahasiswa();
            mhs3.nim = "10110272";
            mhs3.nama = "Robi Tanzil Ganefi";
            mhs3.perkenalanMahasiswa(mhs3.nim, mhs3.nama);
            
        Mahasiswa mhs4 = new Mahasiswa();
            mhs4.nim = "10110272";
            mhs4.nama = "Muhammad Nur Awaludin";
            mhs4.perkenalanMahasiswa(mhs1.nim, mhs1.nama);
     }
}
