import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;




public class SinifYonetim {
	
private String sinif;
 private List<SelectItem> siniflar=new ArrayList<SelectItem>();
public void init(){
	SelectItemGroup g1 = new SelectItemGroup("10.sinif");
	g1.setSelectItems(new SelectItem[] {new SelectItem("10A", "10A"), new SelectItem("10B", "10B"), new SelectItem("10C", "10C")});
	
	SelectItemGroup g2 = new SelectItemGroup("11. sinif");
	 g2.setSelectItems(new SelectItem[] {new SelectItem("11A", "11A"), new SelectItem("11B", "11B"), new SelectItem("11C", "11C")});
     
	 setSiniff(new java.util.ArrayList<SelectItem>());
	 
	
     getSiniff().add(g1);
     getSiniff().add(g2);
}
public SinifYonetim(){
	getSiniflar().add(new SelectItem("9"));
	getSiniflar().add(new SelectItem("10"));
	getSiniflar().add(new SelectItem("11"));
	getSiniflar().add(new SelectItem("12"));
}
public List<SelectItem> getSiniff() {
	return getSiniflar();
}
public void setSiniff(List<SelectItem> siniff) {
	this.setSiniflar(siniff);
}
public String getSinif() {
	return sinif;
}
public void setSinif(String sinif) {
	this.sinif = sinif;
}
public List<SelectItem> getSiniflar() {
	return siniflar;
}
public void setSiniflar(List<SelectItem> siniflar) {
	this.siniflar = siniflar;
}

}
