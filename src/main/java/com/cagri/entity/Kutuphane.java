package com.cagri.entity;

import com.cagri.utility.Durum;
import com.cagri.utility.KutuphaneDB;

import java.awt.print.Book;
import java.util.List;
import java.util.stream.Collectors;

public class Kutuphane {


    public void kitapOduncVer(Kitap kitap, IUye uye) {
        if (kitap.getDurum().equals(Durum.ODUNCTE)) {
            kitapDurumGuncelle(Durum.ODUNCTE);
        }else if(kitap.getDurum().equals(Durum.MEVCUT_DEGIL)){
            kitapDurumGuncelle(Durum.MEVCUT_DEGIL);
        }else {
            uye.oduncAlbyUye(kitap);
            kitapDurumGuncelle(Durum.ODUNCTE);
        }
    }


    public void kitapIadeAl(Kitap kitap, IUye uye) {
        if (kitap.getDurum().equals(Durum.ODUNCTE)) {
            uye.iadeEtbyUye(kitap);
            kitapDurumGuncelle(Durum.ODUNC_ALINABILIR);
        }
    }

    public static void kitapDurumGuncelle(Durum durum) {
        switch (durum) {
            case ODUNC_ALINABILIR -> System.out.println("Kitap, ödünç alınabilir.");
            case ODUNCTE -> System.out.println("Kitap, ödünçte gözükmektedir.");
            case MEVCUT_DEGIL -> System.out.println("Kitap, kütüphane kayitlarımızda bulunmamaktadır.");
        }
    }
}
