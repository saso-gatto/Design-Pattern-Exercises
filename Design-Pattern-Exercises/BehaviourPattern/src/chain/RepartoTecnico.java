package chain;

public class RepartoTecnico implements Assistenza {
	private String problema;
	private String soluzione;
	
	public RepartoTecnico() {
		this.problema="Assistenza";
		this.soluzione="Prodotto nuovo, ricondizionato";
	}
	
	
	@Override
	public void check(String p) {
		if (problema.equalsIgnoreCase(p))
			System.out.println(soluzione);
		else {
			Direttore d = new Direttore();
			d.check(p);
		}
	}


}
