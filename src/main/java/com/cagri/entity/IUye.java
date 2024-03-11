package com.cagri.entity;

import com.cagri.utility.KutuphaneDB;

import java.util.ArrayList;
import java.util.List;

public interface IUye {
    String ad = "";
    String soyad = "";
    long uyeNumarasi = 0L;


    void oduncAlbyUye(Kitap kitap);

    void iadeEtbyUye(Kitap kitap);

}
