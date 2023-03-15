package chain;

public class RepartoAmministrativo implements Assistenza{
	private String problema;
	private String soluzione;
	
	public RepartoAmministrativo() {
		this.problema = "difettoso";
		this.soluzione="sostituzione";
	}
	
	@Override
	public void check(String p) {
		if (problema.equalsIgnoreCase(p))
			System.out.println("Soluzione: "+this.soluzione);
		else {
			Direttore d = new Direttore();
			d.check(p);
		}
			
	}



}
