package com.cagri.entity;

import com.cagri.utility.Durum;
import com.cagri.utility.KutuphaneDB;

import java.awt.print.Book;
import java.util.List;
import java.util.stream.Collectors;

public class Kutuphane {


    public void kitapOduncVer(Kitap kitap, IUye uye) {
        if (kitap.getDurum().equals(Durum.ODUNC_ALINABILIR)) {
            kitapDurumGuncelle(kitap);
            uye.oduncAlbyUye(kitap);
        }
    }


    public void kitapIadeAl(Kitap kitap, IUye uye) {
        if (kitap.getDurum().equals(Durum.ODUNCTE)) {
            kitapDurumGuncelle(kitap);
            uye.iadeEtbyUye(kitap);
        }
    }

    public static void kitapDurumGuncelle(Kitap kitap) {
        switch (kitap.getDurum()) {
            case ODUNC_ALINABILIR -> System.out.println("Kitap, ödünç alınabilir.");
            case ODUNCTE -> System.out.println("Kitap, ödünçte gözükmektedir.");
            case MEVCUT_DEGIL -> System.out.println("Kitap, kütüphane kayitlarımızda bulunmamaktadır.");
        }
    }
}
