/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan17.progam.tunjangan;

import java.util.Scanner;

/**
 *
 * @author Andri
 * Nama : Andri dwi p
 * NIM  : 10119014
 * kelas: IF1
 */
public class IFO110119014Latihan17ProgamTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double  gaji;
    String status;
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("========Program Tunjangan========");
    System.out.print("Berapa gaji pokok anda perbulan? :");
    gaji = scanner.nextInt();
    System.out.println();
    System.out.print("Status anda? (Menikah/Belum) :");
    
    status = scanner.next();
    
    
    System.out.println("========Hasil Perhitungan========");
    double tunjangan = ("Menikah".equals(status))?0.35*gaji:0;
    System.out.println("Gaji Pokok : "+gaji);
    System.out.println("Tunjangan : "+tunjangan);
    System.out.println("Total Gaji : "+(tunjangan+gaji));
    System.out.println("Developed by : Andri Dwi P");
    }
}
