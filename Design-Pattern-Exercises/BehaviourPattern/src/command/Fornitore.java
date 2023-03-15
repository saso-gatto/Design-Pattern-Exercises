package command;

import java.util.ArrayList;

public class Fornitore {
	private ArrayList <Ordine> ordini;
	private ArrayList <Ordine> storico;
	
	public Fornitore() {
		ordini = new ArrayList<Ordine>();	
		storico = new ArrayList<Ordine>();
	}
	
	public void prendiStoricoNegozio (Ordine o) {
		storico.add(o);
	}
	
	public void stampaStorico () {
		System.out.println("stampa storico");
		for (int i = 0; i<storico.size(); i++)
			storico.get(i).esegui();
		storico.clear();
	}
	
	
	public void prendiOrdine (Ordine o) {
		ordini.add(o);
	}
	
	public void piazzaOrdine() {
		for (int i = 0; i<ordini.size(); i++)
			ordini.get(i).esegui();
		ordini.clear();
	}
}
