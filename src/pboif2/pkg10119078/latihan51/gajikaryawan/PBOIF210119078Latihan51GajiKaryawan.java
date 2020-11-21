/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan51.gajikaryawan;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager karyawan = new Manager();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=====Program Perhitungan Gaji Karyawan=====");
        System.out.print("Masukan NIK: ");
        karyawan.setNik(scanner.nextLine());
        System.out.print("Masukan Nama: ");
        karyawan.setNama(scanner.nextLine());
        System.out.print("Masukan Golongan(1/2/3): ");
        karyawan.setGolongan(scanner.nextInt());
        System.out.print("Masukan Jabatan(Manager/Kabag): ");
        karyawan.setJabatan(scanner.next());
        System.out.print("Masukan Jumlah Kehadiran: ");
        karyawan.setKehadiran(scanner.nextInt());
        
        System.out.println("\n======Hasil Perhitungan======");
        System.out.println("NIK: " + karyawan.getNik());
        System.out.println("Nama: " + karyawan.getNama());
        System.out.println("Golongan: " + karyawan.getGolongan());
        System.out.println("Jabatan: " + karyawan.getJabatan());
        
        System.out.println("\nTunjangan Golongan : " + karyawan.tunjanganGolongan(karyawan.getGolongan()));
        System.out.println("Tunjangan Jabatan : " + karyawan.tunjanganJabatan(karyawan.getJabatan()));
        System.out.println("Tunjangan Kehadiran : " + karyawan.tunjanganKehadiran(karyawan.getKehadiran()));
        
        System.out.println("\nGaji total : " + karyawan.gajiTotal());
    }
    
}
