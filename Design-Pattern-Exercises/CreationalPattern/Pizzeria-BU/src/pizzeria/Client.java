package pizzeria;

import javax.swing.JOptionPane;

public class Client {

	public static void main(String[] args) {
	
		Cameriere c = Cameriere.getInstance();
		String pizza= JOptionPane.showInputDialog("Seleziona una pizza da ordinare tra Margherita e Ortolana");
		c.setCuocoPizza(pizza);
		JOptionPane.showMessageDialog(null, "Ecco a te la pizza scelta: "+c.getPizza().getIngredienti());
	
	}

}
