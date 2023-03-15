package interpreter;

public class Moltiplicazione implements Espressione {

	@Override
	public int interpreta(Contesto c) {
		System.out.println("Moltiplicazione: ");
		return c.getElement()*c.getElement();
	}

}
