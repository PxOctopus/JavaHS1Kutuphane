package com.cagri.entity;

import com.cagri.utility.KutuphaneDB;

import java.util.List;

public class Uye implements IUye  {



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
}
