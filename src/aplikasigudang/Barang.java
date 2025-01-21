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
    private int idBarang;        // ID Barang
    private String namaBarang;   // Nama Barang
    private String kategori;     // Kategori Barang
    private int stok;            // Stok Barang
    private double harga;        // Harga Barang

    // Constructor tanpa parameter (default)
    public Barang() {
    }

    // Constructor dengan parameter
    public Barang(int idBarang, String namaBarang, String kategori, int stok, double harga) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.kategori = kategori;
        this.stok = stok;
        this.harga = harga;
    }

    // Getter dan Setter
    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
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
                "idBarang=" + idBarang +
                ", namaBarang='" + namaBarang + '\'' +
                ", kategori='" + kategori + '\'' +
                ", stok=" + stok +
                ", harga=" + harga +
                '}';
    }
}

