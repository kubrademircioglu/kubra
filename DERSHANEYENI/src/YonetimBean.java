import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

public class YonetimBean {
	 private Yonetim ogrenci=new Yonetim();
	 private Yonetim donem = new Yonetim();
	 private List<Yonetim> ogrenciListesi = new ArrayList<Yonetim>();
	// private List<Sinif> sinifListesi = new ArrayList<Sinif>();
	 private List<Donem> donemListesi = new ArrayList<Donem>();
	 private Sinif sinif=new Sinif();
	 private Yonetim kulanici=new Yonetim();
	 private List<SelectItem> ilcelistesi = new ArrayList<SelectItem>();
public void kaydet (){
	
	getOgrenciListesi().add(ogrenci);
	ogrenci=  new Yonetim();
}
public void sil(){
	ogrenciListesi.remove(ogrenci);
	ogrenci=  new Yonetim();
	
}
public void ogrenciDuzenle(){
	ogrenci= new  Yonetim();
}
public void ilceYukle (ValueChangeEvent event ){
	ilcelistesi.clear();
	String secilenSehir = (String) event.getNewValue();
	if (secilenSehir.equalsIgnoreCase("ADANA"))
			{
		ilcelistesi.add(new SelectItem("Merkez"));
		ilcelistesi.add(new SelectItem("KOZAN"));
	    ilcelistesi.add(new SelectItem("imamoglu"));
	    ilcelistesi.add( new SelectItem("SEYHAN"));
	    ilcelistesi.add(new SelectItem("ceyhan"));
			}
	else if ( secilenSehir.equalsIgnoreCase("ANKARA")){
		ilcelistesi.add(new SelectItem("Merkez"));
		ilcelistesi.add( new SelectItem("CANKAYA"));
		ilcelistesi.add(new SelectItem("KECiOREN "));
		ilcelistesi.add(new SelectItem("ETLiK"));
		
	}
	else if ( secilenSehir.equalsIgnoreCase("iSTANBUL")){
		ilcelistesi.add(new SelectItem("Merkez"));
	ilcelistesi.add(new SelectItem("kadikoy"));
	ilcelistesi.add(new SelectItem("ortakoy"));
	ilcelistesi.add(new SelectItem("besiktaþ"));
	ilcelistesi.add(new SelectItem("kartal"));
	}
	else if ( secilenSehir.equalsIgnoreCase("DUZCE")){
		
		ilcelistesi.add(new SelectItem("Yýðýlca"));
		ilcelistesi.add(new SelectItem("Akçakoca"));
		ilcelistesi.add(new SelectItem("Çilimli"));
		ilcelistesi.add(new SelectItem("Cumayeri"));
		}
	
}
//public void Sinifsil() {
	//sinifListesi.remove(getSinif());
	//sinif = new Sinif();
	
//}
//public void SinifKaydet(){
	//sinifListesi.add(getSinif());
	//sinif = new Sinif();
//}
public void Kullanicikaydet (){
	
	getOgrenciListesi().add(kulanici);
	kulanici=  new Yonetim();
}
public Yonetim getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Yonetim ogrenci) {
		this.ogrenci = ogrenci;
	}
	public List<Yonetim> getOgrenciListesi() {
		return ogrenciListesi;
	}
	public void setOgrenciListesi(List<Yonetim> ogrenciListesi) {
		this.ogrenciListesi = ogrenciListesi;
	}
	
	public Yonetim getKulanici() {
		return kulanici;
	}
	public void setKulanici(Yonetim kulanici) {
		this.kulanici = kulanici;
	}
	//public List<Sinif> getSinifListesi() {
		//return sinifListesi;
	//}
	//public void setSinifListesi(List<Sinif> sinifListesi) {
		//this.sinifListesi = sinifListesi;
	//}
	public List<Donem> getDonemListesi() {
		return donemListesi;
	}
	public void setDonemListesi(List<Donem> donemListesi) {
		this.donemListesi = donemListesi;
	}
	public Yonetim getDonem() {
		return donem;
	}
	public void setDonem(Yonetim donem) {
		this.donem = donem;
	}
	public Sinif getSinif() {
		return sinif;
	}
	public void setSinif(Sinif sinif) {
		this.sinif = sinif;
	}
	public List<SelectItem> getIlcelistesi() {
		return ilcelistesi;
	}
	public void setIlcelistesi(List<SelectItem> ilcelistesi) {
		this.ilcelistesi = ilcelistesi;
	}

}
