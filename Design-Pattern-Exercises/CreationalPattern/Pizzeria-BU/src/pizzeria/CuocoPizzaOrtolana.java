package pizzeria;

public class CuocoPizzaOrtolana extends CuocoPizza { 		// Concrete Builder

	@Override
	public void ingredienti() {
		pizza.setIngredienti("Pomodoro, mozzarella, zucchine, peperoni,melanzane");
	}

}
