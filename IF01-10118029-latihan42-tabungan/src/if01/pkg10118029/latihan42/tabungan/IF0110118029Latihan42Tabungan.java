/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Tabungan
 */
public class IF0110118029Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner (System.in);
         
        
        System.out.println("=======Program Penarikan Uang=======");
        System.out.print("Masukkan Saldo Awal : ");
        tabungan tabungan = new tabungan(scanner.nextInt());
        System.out.print("Jumlah uang yang diambil : ");        
        System.out.print("Saldo anda Sekarang : " + tabungan.ambilUang(scanner.nextInt())+ "\n");
    
    }
    
}
