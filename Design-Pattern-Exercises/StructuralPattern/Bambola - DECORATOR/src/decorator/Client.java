package decorator;

public class Client {
	public static void main(String[] args) {
		Giocattolo bambola = new Bambola();
		bambola.stampa();
		Giocattolo dott = new Dottoressa (bambola);
		dott.stampa();
		Giocattolo astro = new Astronauta(bambola);
		astro.stampa();
	}
}
