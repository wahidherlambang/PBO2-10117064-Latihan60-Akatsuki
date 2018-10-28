/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan60.akatsuki;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program tentang beberapa karakter 
 * akatsuki dari serial anime naruto.
 */
public class Akatsuki {
    protected String pakaian;
    protected String tujuan;

    public Akatsuki(String pakaian, String tujuan) {
        this.pakaian = pakaian;
        this.tujuan = tujuan;
    }

    public String getpakaian() {
        return pakaian;
    }

    public String gettujuan() {
        return tujuan;
    }
}
