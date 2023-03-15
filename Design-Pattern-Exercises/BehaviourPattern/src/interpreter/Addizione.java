package interpreter;

public class Addizione implements Espressione {

	@Override
	public int interpreta(Contesto c) {
		System.out.println("Addizione: ");
		return c.getElement()+c.getElement();
	}

	
}
