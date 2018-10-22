/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117096.latihan44.hukumohm;

/**
 *
 * @author 
 * Nama         : Miftah Muhammad Sidqi
 * NIM          : 10117096
 * Kelas        : PBO3
 * Deskripsi    : Program ini berisi program untuk menghitung tegangan menggunakan
 * hukum ohm
 */
public class PBO310117096Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Baterai objB = new Baterai();
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar"
                + "akan berbanding lurus dengan beda potensial pada ujung ujung"
                + "kawat penghantar tersebut asalkan suhu kawat dijaga konstan.");
        
        objB.getKuatArus();
        objB.getHambatan();
        System.out.println("Hasil Tegangan : "+objB.hitungTegangan()+" volt ");
    }
    
}
