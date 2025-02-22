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
public class Barang {
    private String kodeBarang;    // Kode Barang (unik)
    private String namaBarang;    // Nama Barang
    private String kategori;      // Kategori Barang
    private int stok;             // Stok Barang
    private double harga;         // Harga Barang

    // Constructor tanpa parameter (default)
    public Barang() {
    }

    // Constructor dengan parameter
    public Barang(String kodeBarang, String namaBarang, String kategori, int stok, double harga) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.kategori = kategori;
        this.stok = stok;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Metode untuk mencetak informasi barang
    @Override
    public String toString() {
        return "Barang{" +
                "kodeBarang='" + kodeBarang + '\'' +
                ", namaBarang='" + namaBarang + '\'' +
                ", kategori='" + kategori + '\'' +
                ", stok=" + stok +
                ", harga=" + harga +
                '}';
    }
}

