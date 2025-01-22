/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasigudang;

/**
 *
 * @author syffmhr
 */
public class Transaksi {
    private int idTransaksi;
    private int idBarang;
    private int idSupplier;
    private String tanggal;
    private int jumlah;
    private String tipeTransaksi;

    // Constructor
    public Transaksi(int idTransaksi, int idBarang, int idSupplier, String tanggal, int jumlah, String tipeTransaksi) {
        this.idTransaksi = idTransaksi;
        this.idBarang = idBarang;
        this.idSupplier = idSupplier;
        this.tanggal = tanggal;
        this.jumlah = jumlah;
        this.tipeTransaksi = tipeTransaksi;
    }

    // Getters and Setters
    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }

    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getTipeTransaksi() {
        return tipeTransaksi;
    }

    public void setTipeTransaksi(String tipeTransaksi) {
        this.tipeTransaksi = tipeTransaksi;
    }
}
