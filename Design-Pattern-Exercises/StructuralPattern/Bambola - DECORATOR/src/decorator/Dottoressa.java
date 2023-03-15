package decorator;

public class Dottoressa extends BambolaDecorator {
	
	public Dottoressa (Giocattolo g) {
		this.giocattolo=g;
	}
	
	@Override
	public void stampa() {
		System.out.println("Il giocattolo è una bambola-dottoressa");
	}

}
