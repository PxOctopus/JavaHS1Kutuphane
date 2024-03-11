package com.cagri.entity;

import com.cagri.utility.KutuphaneDB;

import java.util.List;
import java.util.Random;

public class Uye implements IUye {
    private String ad;
    private String soyad;
    private long uyeNumarasi;


    @Override
    public void oduncAlbyUye(Kitap kitap) {
        KutuphaneDB.oduncAlinanKitaplar.add(kitap);
        KutuphaneDB.mevcutKitaplar.remove(kitap);
    }

    @Override
    public void iadeEtbyUye(Kitap kitap) {
        KutuphaneDB.oduncAlinanKitaplar.remove(kitap);
        KutuphaneDB.mevcutKitaplar.add(kitap);
    }

    public Uye(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        this.uyeNumarasi = new Random().nextLong();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public long getUyeNumarasi() {
        return uyeNumarasi;
    }

    public void setUyeNumarasi(long uyeNumarasi) {
        this.uyeNumarasi = uyeNumarasi;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Uye{");
        sb.append("ad='").append(ad).append('\'');
        sb.append(", soyad='").append(soyad).append('\'');
        sb.append(", uyeNumarasi=").append(uyeNumarasi);
        sb.append('}');
        return sb.toString();
    }
}
