/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116138_latihan58_tambahkurang;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Program Tambah Kurang
 */
public class PBOUlang_10116138_Latihan58_TambahKurang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JumlahBilangan jb = new JumlahBilangan(3, 4);
        jb.tampilHasilJumlah();
        
        SelisihBilangan sb = new SelisihBilangan(3, 4);
        sb.tampilSelisih();

    }

}
