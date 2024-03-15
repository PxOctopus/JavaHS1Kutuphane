package com.cagri.entity;

import com.cagri.utility.Durum;

import java.util.Random;

public abstract class Kitap extends Kutuphane{
    private long ISBN;
    private String baslik;
    private String yazar;
    private String yayinYili;
    private Durum durum;

    public Kitap(String baslik, String yazar, String yayinYili, Durum durum) {
        this.durum = durum;
        this.ISBN = new Random().nextLong();
        this.baslik = baslik;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
    }

    public long getISBN() {
        return ISBN;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getYayinYili() {
        return yayinYili;
    }

    public void setYayinYili(String yayinYili) {
        this.yayinYili = yayinYili;
    }

    public Durum getDurum() {
        return durum;
    }

    public void setDurum(Durum durum) {
        this.durum = durum;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kitap{");
        sb.append("ISBN=").append(ISBN);
        sb.append(", baslik='").append(baslik).append('\'');
        sb.append(", yazar='").append(yazar).append('\'');
        sb.append(", yayinYili='").append(yayinYili).append('\'');
        sb.append(", durum=").append(durum);
        sb.append('}');
        return sb.toString();
    }
}
