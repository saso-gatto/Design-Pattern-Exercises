package decorator;

public class Bambola extends Giocattolo {
	
	public Bambola() {
		this.nomeProdotto="Bambola";
	}
	
	@Override
	public void stampa() {
		System.out.println("Il giocattolo è una bambola");
	}

}
