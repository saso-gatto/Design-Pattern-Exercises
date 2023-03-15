package pizzeria;

public class CuocoPizzaMargherita extends CuocoPizza {		// Concrete Builder

	@Override
	public void ingredienti() {
		pizza.setIngredienti("Pomodoro, mozzarella");
	}

}
