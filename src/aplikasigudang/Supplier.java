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
public class Supplier {
    private String kodeSupplier;  // Menggunakan kodeSupplier sebagai identifier utama
    private String namaSupplier;
    private String alamat;
    private String telepon;

    // Constructor tanpa parameter (default)
    public Supplier() {
    }

    // Constructor dengan parameter
    public Supplier(String kodeSupplier, String namaSupplier, String alamat, String telepon) {
        this.kodeSupplier = kodeSupplier;
        this.namaSupplier = namaSupplier;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    // Getters and Setters
    public String getKodeSupplier() {
        return kodeSupplier;
    }

    public void setKodeSupplier(String kodeSupplier) {
        this.kodeSupplier = kodeSupplier;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    // Metode untuk mencetak informasi supplier
    @Override
    public String toString() {
        return "Supplier{" +
                "kodeSupplier='" + kodeSupplier + '\'' +
                ", namaSupplier='" + namaSupplier + '\'' +
                ", alamat='" + alamat + '\'' +
                ", telepon='" + telepon + '\'' +
                '}';
    }
}