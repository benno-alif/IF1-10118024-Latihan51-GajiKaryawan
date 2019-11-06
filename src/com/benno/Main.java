package com.benno;
import java.util.Scanner;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Menghitung Gaji Karyawan
     */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager obj = new Manager();

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        obj.setNik(scanner.nextLine());
        System.out.print("Masukkan Nama : ");
        obj.setNama(scanner.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        obj.setGolongan(scanner.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        scanner.nextLine();
        obj.setJabatan(scanner.nextLine());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        obj.setKehadiran(scanner.nextInt());
        System.out.println();

        System.out.println("===Hasil Perhitungan====");
        System.out.println("NIK\t\t\t : " + obj.getNik());
        System.out.println("NAMA\t\t : " + obj.getNama());
        System.out.println("GOLONGAN\t : " + obj.getGolongan());
        System.out.println("JABATAN\t\t : " + obj.getJabatan());
        System.out.println();

        System.out.println("TUNJANGAN GOLONGAN\t : " + obj.tunjanganGolongan(obj.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t : " + obj.tunjanganJabatan(obj.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t : " + obj.tunjanganKehadiran(obj.getKehadiran()));
        System.out.println();

        System.out.println("GAJI TOTAL : " + obj.gajiTotal());
    }
}
