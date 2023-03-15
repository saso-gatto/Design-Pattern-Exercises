package decorator;

public abstract class BambolaDecorator extends Giocattolo {
	protected Giocattolo giocattolo;
	
	@Override
	public abstract void stampa();
	
}
