package com.cagri.entity;

import com.cagri.utility.Durum;
import com.cagri.utility.KutuphaneDB;

import java.awt.print.Book;
import java.util.List;
import java.util.stream.Collectors;

public class Kutuphane {


    public void kitapOduncVer(Kitap kitap, Uye uye) {
        if (kitap.getDurum().equals(Durum.ODUNC_ALINABILIR)) {
            uye.oduncAlbyUye(kitap);
            kitap.setDurum(Durum.ODUNCTE);
        }
        if (kitap.getDurum().equals(Durum.ODUNCTE)){
            kitapDurumGuncelle(Durum.ODUNCTE);
        }
    }


    public void kitapIadeAl(Kitap kitap, Uye uye) {
            uye.iadeEtbyUye(kitap);
            kitap.setDurum(Durum.ODUNC_ALINABILIR);
            kitapDurumGuncelle(Durum.ODUNC_ALINABILIR);

    }

    public static void kitapDurumGuncelle(Durum durum) {
        switch (durum) {
            case ODUNC_ALINABILIR -> {
                System.out.println("Kitap, kutuphanede bulunmaktadır.");
                break;
            }
            case ODUNCTE -> {
                System.out.println("Kitap, ödünç verilmiştir.");
                break;
            }
            case MEVCUT_DEGIL -> {
                System.out.println("Kitap, kütüphane kayitlarımızda bulunmamaktadır.");
                break;
            }
        }
    }
}
