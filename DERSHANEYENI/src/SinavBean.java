import java.util.ArrayList;
import java.util.List;

public class SinavBean {
private Sinav sinav=new Sinav();

private List<Sinav> sinavlar=new ArrayList<Sinav>();

public void kaydet() {
	getSinavlar().add(sinav);
	sinav=new Sinav();
	
}

public void sil() {
	sinavlar.remove(sinav);
	sinav=new  Sinav();
	
}

public Sinav getSinav() {
	return sinav;
}

public void setSinav(Sinav sinav) {
	this.sinav = sinav;
}


public List<Sinav> getSinavlar() {
	return sinavlar;
}


public void setSinavlar(List<Sinav> sinavlar) {
	this.sinavlar = sinavlar;
}




}
