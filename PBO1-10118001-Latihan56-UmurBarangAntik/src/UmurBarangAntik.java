/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama      : Alfian Soasiu
 * Kelas     : PBO1
 * NIM       : 10118001
 * Deskripsi : Menampilkan output umur barang antik
 */
public class UmurBarangAntik {

    public static void main(String[] args) {
        
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        System.out.println("Nama barang Antik : "+radio.getName());
        radio.tampilUmur();
        
    }
    
}
