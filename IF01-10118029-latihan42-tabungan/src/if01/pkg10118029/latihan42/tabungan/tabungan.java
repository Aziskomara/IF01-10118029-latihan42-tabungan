/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan42.tabungan;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Tabungan
 */
public class tabungan {
    private final int saldo;
    

    public tabungan(int saldo) {
        this.saldo = saldo;
    }
      
    public int ambilUang (int jumlah){
        return saldo - jumlah;
    }
    
}
