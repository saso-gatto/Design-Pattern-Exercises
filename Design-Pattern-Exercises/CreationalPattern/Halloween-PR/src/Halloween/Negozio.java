package Halloween;

import java.util.HashMap;

public class Negozio {
	
	private static HashMap <String, Decorazione> decorazioni = new HashMap <String,Decorazione>();
	//All'interno di decorazioni salviamo i prototipi che possiamo ottenere in maniera dinamica
	
	
	public Negozio() {
		decorazioni.put("Zucca",new Zucca());
		decorazioni.put("Strega",new Strega());
		decorazioni.put("Fantasma",new Fantasma());
	}

	//Ottieni decorazioni ritorna il clone della decorazione, non l'oggetto stesso.
	public Decorazione ottieniDecorazione (String dec) throws CloneNotSupportedException {
		return (Decorazione) decorazioni.get(dec).clone();
	}
}
