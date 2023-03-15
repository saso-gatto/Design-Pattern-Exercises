package flyweight;

import java.util.ArrayList;
import java.util.HashMap;

public class Albero { //FlyweightFactory
	public HashMap <String,Decorazione> dec;
	public ArrayList <Decorazione> decAlbero;

	
	public Albero() {
		dec = new HashMap<String,Decorazione>();
		decAlbero=new ArrayList<Decorazione>();
	}
	
	public void addDecorazione(String tipo) {
		if (dec.get(tipo) == null) {
			TipoDecorazione t = new TipoDecorazione(tipo);
			dec.put(tipo,t);
			decAlbero.add(t);
		}
		else {
			decAlbero.add(dec.get(tipo));
		}
	};
	
	
	public void stampaAlbero() {
		if (dec.size()==0) {
			System.out.println("Non ci sono decorazioni da aggiungere all'albero :(");
			return;
		}
		if (decAlbero.size()==0) {
			System.out.println("L'albero è spoglio :(");
			return;
		}
		else {
			System.out.println("L'albero è composto dalle seguenti decorazioni: ");
			for (int i = 0; i<decAlbero.size(); i++)
				decAlbero.get(i).stampa();
		}
	}	
}
