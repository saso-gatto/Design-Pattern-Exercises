package chain;

public class OperatoreAmministrativo implements Assistenza {
	private String problema;
	private String soluzione;
	
	public OperatoreAmministrativo() {
		this.problema="smarrito";
		this.soluzione="Rimborso";
	}

	@Override
	public void check(String p) {
		if (problema.equalsIgnoreCase(p))
			System.out.println("Ti offriamo questa soluzione: "+this.soluzione);
		else {
			RepartoAmministrativo r = new RepartoAmministrativo();
			r.check(p);
		}
	}


}
