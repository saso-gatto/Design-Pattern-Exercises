package interpreter;

public class Divisione implements Espressione{

	@Override
	public int interpreta(Contesto c) {
		try {
		System.out.println("Divisione: ");
		return c.getElement()/c.getElement();
	} catch (ArithmeticException e) {
		System.out.println("impossibile dividere un numero per 0!!");
	}
	return 0;
	}

}
