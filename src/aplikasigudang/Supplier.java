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
    private int idSupplier;
    private String namaSupplier;
    private String alamat;
    private String telepon;

    // Constructor
    public Supplier(int idSupplier, String namaSupplier, String alamat, String telepon) {
        this.idSupplier = idSupplier;
        this.namaSupplier = namaSupplier;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    // Getters and Setters
    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
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
}

