package com.cagri.utility;

import com.cagri.entity.IUye;
import com.cagri.entity.Kitap;
import com.cagri.entity.Uye;

import java.util.ArrayList;
import java.util.List;

public class KutuphaneDB {
   public static List<Kitap> sistemdeKayitliKitaplar = new ArrayList<>();
   public static List<Kitap> oduncAlinanKitaplar = new ArrayList<>();
   public static List<Kitap> mevcutKitaplar = new ArrayList<>();
   public static List<Uye> uyeListesi = new ArrayList<>();

}
