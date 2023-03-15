package chain;

public class Direttore implements Assistenza {
	private String soluzione;
	
	public Direttore () {
		this.soluzione="Rimborso";
	}
	
	@Override
	public void check(String p) {
		System.out.println(soluzione);
	}


}
