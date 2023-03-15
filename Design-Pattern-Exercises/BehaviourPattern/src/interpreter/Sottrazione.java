package interpreter;

public class Sottrazione implements Espressione {

	@Override
	public int interpreta(Contesto c) {
		System.out.println("Sottrazione: ");
		return c.getElement()-c.getElement();
	}

}
