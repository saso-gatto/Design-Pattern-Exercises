package pizzeria;

import javax.swing.JOptionPane;

public class Cameriere { 	// Director 
	
	private CuocoPizza cp;
	private static Cameriere instance=null;
	
	private Cameriere() {}
	
	public static Cameriere getInstance() {
		if (instance==null)
			instance=new Cameriere();
		return instance;
	}
	
	public void setCuocoPizza(String tipoPizza) {
		if(tipoPizza.equals("Margherita"))
			cp = new CuocoPizzaMargherita();
		else if(tipoPizza.equals("Ortolana"))
			cp = new CuocoPizzaOrtolana();
		else {
			JOptionPane.showMessageDialog(null,"Non abbiamo gli ingredienti per quella pizza, ci dispiace, le offriamo una pizza margherita");
			cp = new CuocoPizzaMargherita();
			}
		this.creaPizza();
	}

	
	public void creaPizza() {
		cp.creaPizza();
		cp.ingredienti();
	}
	
	public Pizza getPizza() {
		return cp.getPizza();
	}
}
