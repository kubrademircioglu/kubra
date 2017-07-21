

import java.util.ArrayList;
import java.util.List;

public class KullaniciBean {
private Kullanici kullanici=new Kullanici();
private List<Kullanici> KullaniciListesi=new ArrayList<Kullanici>();

public void kaydet() {
	KullaniciListesi.add(this.kullanici);
	this.kullanici=new Kullanici();
}

private String girilenKullaniciAdi;
private String girilenSifre;
private String mesaj;

public String girisYap() {
	for(Kullanici kullanici: KullaniciListesi){
		if(kullanici.getKullaniciAdi().equals(girilenKullaniciAdi)&& kullanici.getSifre().equals(girilenSifre)){
			
			mesaj="giris basarili";
			return "basarili";
		}    
		
	}
	return "hatali";
}


public Kullanici getKullanici() {
	return kullanici;
}

public void setKullanici(Kullanici kullanici) {
	this.kullanici = kullanici;
}

public List<Kullanici> getKullaniciListesi() {
	return KullaniciListesi;
}

public void setKullaniciListesi(List<Kullanici> kullaniciListesi) {
	KullaniciListesi = kullaniciListesi;
}

public String getGirilenKullaniciAdi() {
	return girilenKullaniciAdi;
}

public void setGirilenKullaniciAdi(String girilenKullaniciAdi) {
	this.girilenKullaniciAdi = girilenKullaniciAdi;
}

public String getGirilenSifre() {
	return girilenSifre;
}

public void setGirilenSifre(String girilenSifre) {
	this.girilenSifre = girilenSifre;
}

public String getMesaj() {
	return mesaj;
}

public void setMesaj(String mesaj) {
	this.mesaj = mesaj;
}
}
