package com.cagri;

import com.cagri.entity.*;
import com.cagri.utility.Durum;
import com.cagri.utility.KutuphaneDB;

public class App {
    public static void main(String[] args) {

        Kitap kitap = new KitapBilim("adada","adsasda","1989",Durum.ODUNC_ALINABILIR);
        IUye uye = new Uye("cas","ggg");
        Kutuphane kutuphane = new Kutuphane();
        kutuphane.kitapOduncVer(kitap,uye);
        System.out.println(KutuphaneDB.mevcutKitaplar);
        System.out.println(KutuphaneDB.oduncAlinanKitaplar);
        System.out.println(KutuphaneDB.sistemdeKayitliKitaplar);
    }
}
