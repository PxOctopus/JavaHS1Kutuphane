package com.cagri;

import com.cagri.entity.*;
import com.cagri.utility.Durum;
import com.cagri.utility.KutuphaneDB;

import java.util.Collections;

public class App {
    public static void main(String[] args) {

        Kitap kitap1 = new KitapBilim("Uclu Sarmal", "Richard Lewontin", "2007", Durum.ODUNC_ALINABILIR);
        Kitap kitap2 = new KitapBilim("Cosmos", "Carl Sagan", "1980", Durum.ODUNC_ALINABILIR);
        Kitap kitap3 = new KitapBilim("Biraz Kuantumdan Zarar Gelmez", "Marcus Chown", "2009", Durum.ODUNC_ALINABILIR);

        Kitap kitap4 = new KitapRoman("Ince Memed I", "Yasar Kemal", "1955", Durum.ODUNC_ALINABILIR);
        Kitap kitap5 = new KitapRoman("Fahrenheit 451", "Ray Bradbury", "1953", Durum.ODUNC_ALINABILIR);
        Kitap kitap6 = new KitapRoman("Sineklerin Tanrısı", "William Golding", "1954", Durum.ODUNC_ALINABILIR);

        Kitap kitap7 = new KitapTarih("Tüfek, Mikrop ve Celik", "Jared Diamond", "1997", Durum.ODUNC_ALINABILIR);
        Kitap kitap8 = new KitapTarih("Yeni Dunya Duzeni Nereye", "Korkut Boratav", "2000", Durum.ODUNC_ALINABILIR);
        Kitap kitap9 = new KitapTarih("Roma Tarihi", "Adrian Goldsworthy", "2023", Durum.ODUNC_ALINABILIR);
        Collections.addAll(KutuphaneDB.mevcutKitaplar, kitap1, kitap2, kitap3, kitap4, kitap5, kitap6, kitap7, kitap8, kitap9);

        IUye uye1 = new Uye("Cagri", "Gumuskaptan");
        IUye uye2 = new Uye("Turkan Sevgin", "Gumuskaptan");
        IUye uye3 = new Uye("Zeynep Oyku", "Buyukbay");
        IUye uye4 = new Uye("Erman", "Caglar");
        IUye uye5 = new Uye("Hasan", "Inceler");
        IUye uye6 = new Uye("Ozan", "Akyol");
        IUye uye7 = new Uye("Yılmaz", "Bahtiyar");
        IUye uye8 = new Uye("Deniz", "Ates");
        Collections.addAll(KutuphaneDB.uyeListesi, uye1, uye2, uye3, uye4, uye5, uye6, uye7, uye8);

        Kutuphane kutuphane = new Kutuphane();
//        uye1.oduncAlbyUye(kitap1);
        kutuphane.kitapOduncVer(kitap1, uye2);
        System.out.println(KutuphaneDB.mevcutKitaplar);
        System.out.println(KutuphaneDB.oduncAlinanKitaplar);

//        uye1.iadeEtbyUye(kitap1);
//        kutuphane.kitapIadeAl(kitap1,uye2);
        System.out.println(KutuphaneDB.mevcutKitaplar);
        System.out.println(KutuphaneDB.oduncAlinanKitaplar);
        kutuphane.kitapOduncVer(kitap1,uye1);
        System.out.println(KutuphaneDB.mevcutKitaplar);
        System.out.println(KutuphaneDB.oduncAlinanKitaplar);
    }
}
