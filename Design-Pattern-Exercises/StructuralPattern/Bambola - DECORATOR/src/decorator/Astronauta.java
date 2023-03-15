package decorator;

public class Astronauta extends BambolaDecorator {
	
	public Astronauta(Giocattolo g) {
		this.giocattolo=g;
	}
	
	
	@Override
	public void stampa() {
		System.out.println("Il giocattolo è una bambola-astronauta");
	}

}
