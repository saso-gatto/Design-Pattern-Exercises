package observer;

public class Genitore implements Observer{
	private String ultimoStato;
	
	public Genitore (Subject s) {
		this.ultimoStato=s.getState();
	}
	
	@Override
	public void update(String s) {
		System.out.println("Aggiorno lo stato attuale con lo stato: "+s);
		this.ultimoStato=s;
	}

}
