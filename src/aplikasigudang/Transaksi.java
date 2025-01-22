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
    private String kodeBarang;   // Menggunakan kodeBarang
    private String kodeSupplier; // Menggunakan kodeSupplier
    private String tanggal;
    private int jumlah;
    private String tipeTransaksi;

    // Constructor
    public Transaksi(int idTransaksi, String kodeBarang, String kodeSupplier, String tanggal, int jumlah, String tipeTransaksi) {
        this.idTransaksi = idTransaksi;
        this.kodeBarang = kodeBarang;
        this.kodeSupplier = kodeSupplier;
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

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getKodeSupplier() {
        return kodeSupplier;
    }

    public void setKodeSupplier(String kodeSupplier) {
        this.kodeSupplier = kodeSupplier;
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

    @Override
    public String toString() {
        return "Transaksi{" +
                "idTransaksi=" + idTransaksi +
                ", kodeBarang='" + kodeBarang + '\'' +
                ", kodeSupplier='" + kodeSupplier + '\'' +
                ", tanggal='" + tanggal + '\'' +
                ", jumlah=" + jumlah +
                ", tipeTransaksi='" + tipeTransaksi + '\'' +
                '}';
    }
}
