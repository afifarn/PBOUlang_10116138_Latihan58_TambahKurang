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
public class JumlahBilangan extends Bilangan{

    public JumlahBilangan(int x, int y) {
        super(x, y);
    }
    public void tampilHasilJumlah(){
        System.out.println("Hasil Perjumlahan = " + (getX()+getY()));
    }

}
