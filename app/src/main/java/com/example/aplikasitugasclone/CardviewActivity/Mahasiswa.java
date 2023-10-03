package com.example.aplikasitugasclone.CardviewActivity;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private String prodi;
    private String alamat;
    private String nomorWhatsApp;
    private String namaInstagram;

    public Mahasiswa(String nama, String nim, String jurusan, String prodi, String alamat, String nomorWhatsApp, String namaInstagram) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.prodi = prodi;
        this.alamat = alamat;
        this.nomorWhatsApp = nomorWhatsApp;
        this.namaInstagram = namaInstagram;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getProdi() {
        return prodi;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorWhatsApp() {
        return nomorWhatsApp;
    }

    public String getNamaInstagram() {
        return namaInstagram;
    }
}
