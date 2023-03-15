package decorator;

public abstract class Giocattolo {
	protected String nomeProdotto;
	
	public String getNomeProdotto() {
		return this.nomeProdotto;
	}
	
	public abstract void stampa();
}
