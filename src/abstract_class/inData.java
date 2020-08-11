/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_class;

import Interface.data_var;
import java.util.Scanner;
/**
 *
 * @author Night's Watch
 */
public class inData implements data_var {
    static String nama;
    static String alamat;
    static String stb;
    static int umur;
    
    @Override
    public String varNama(String nama) {
        this.nama=nama;
        return this.nama;
    }
    @Override
    public String varAlamat(String alamat) {
        this.alamat=alamat;
        return this.alamat;
    }
    @Override
    public String varStb(String stb) {
        this.stb=stb;
        return this.stb;
    }
    @Override
    public int varUmur(int umur) {
        this.umur=umur;
        return this.umur;
    }
    @Override
    public void outData() {
        System.out.println("\nNama = "+nama);
        System.out.println("Alamat = "+alamat);
        System.out.println("Stambuk = "+stb);
        System.out.println("Umur = "+(2020-umur));
    }
    public static void main (String[]args) {
        inData i=new inData(){};
        
        System.out.println("SELAMAT DATANG DI PROGRAM BIODATA");
        System.out.println("=================================\n");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan Nama : ");
        nama=sc.nextLine();
        System.out.println("Masukkan Alamat : ");
        alamat=sc.nextLine();
        System.out.println("Masukkan Stambuk : ");
        stb=sc.nextLine();
        System.out.println("Masukkan Tahun Kelahiran : ");
        umur=sc.nextInt();
        
        i.varNama(nama);
        i.varAlamat(alamat);
        i.varStb(stb);
        i.varUmur(umur);
        i.outData();
    }
}
