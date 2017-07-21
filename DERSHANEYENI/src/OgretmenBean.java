import java.util.ArrayList;

import java.util.List;

import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

public class OgretmenBean {

private Ogretmen ogretmen=new  Ogretmen();
private List<SelectItem> brans=new ArrayList<SelectItem>();
private List<SelectItem> ilcelistesi = new ArrayList<SelectItem>();
	public OgretmenBean() {
		getBrans().add(new SelectItem("Matematik"));
		getBrans().add(new SelectItem("Fizik"));
		getBrans().add(new SelectItem("Kimya"));
		getBrans().add(new SelectItem("Biyoloji"));
		getBrans().add(new SelectItem("Tarih"));
		getBrans().add(new SelectItem("Türkçe"));
	}
private List<Ogretmen> ogretmenler=new ArrayList<Ogretmen>();

public void kaydet() {
	getOgretmenler().add(ogretmen);
	ogretmen=new Ogretmen();
}
public void sil() {
	ogretmenler.remove(ogretmen);
	ogretmen=new Ogretmen();
}
public void ilceYukle1 (ValueChangeEvent event ){
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



public Ogretmen getOgretmen() {
	return ogretmen;
}

public void setOgretmen(Ogretmen ogretmen) {
	this.ogretmen = ogretmen;
}

public List<Ogretmen> getOgretmenler() {
	return ogretmenler;
}

public void setOgretmenler(List<Ogretmen> ogretmenler) {
	this.ogretmenler = ogretmenler;
}
public List<SelectItem> getBrans() {
	return brans;
}
public void setBrans(List<SelectItem> brans) {
	this.brans = brans;
}
public List<SelectItem> getIlcelistesi() {
	return ilcelistesi;
}
public void setIlcelistesi(List<SelectItem> ilcelistesi) {
	this.ilcelistesi = ilcelistesi;
}





}
