/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class PBOUlang10116458Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cbr ;
        
                
          System.out.print("Masukkan Kalimat : " );
        Scanner sc = new Scanner (System.in);
        cbr = sc.nextLine();
          
          System.out.println("\n"+"====Hasil Fomatting====");
          System.out.println("Huruf Besar :  " + cbr.toUpperCase());
          System.out.println("Huruf Kecil :  " + cbr.toLowerCase());
    }
    
}
