package chain;

public class OperatoreTecnico implements Assistenza {
	private String competenza;
	private String problema;
	
	public OperatoreTecnico() {
		this.competenza="Tecnico";
		this.problema = "Rotto";
		
	}

	@Override
	public void check(String p) {
		if (problema.equalsIgnoreCase(p))
			System.out.println("Il tuo dispositivo è rotto, lo sostitueremo.");
		else {
			RepartoTecnico t = new RepartoTecnico();
			t.check(p);
		}
			
	}

	
}
