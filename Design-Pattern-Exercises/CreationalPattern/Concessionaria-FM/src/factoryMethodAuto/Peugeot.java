package factoryMethodAuto;

import javax.swing.JOptionPane;

public class Peugeot extends Auto {
	
	public Peugeot() {
		super();
	}

	public Peugeot(String mod, String col) {
			this.modello=mod;
			this.colore=col;
			this.calcolaPrezzo();
	}

		
	@Override
	public void calcolaPrezzo() {
		if (this.modello.equals("208"))
			this.prezzo=15000;
		else if (this.modello.equals("2008"))
			this.prezzo=26000;
		else if (this.modello.equals("3008"))
			this.prezzo=31000;
		else
			JOptionPane.showMessageDialog(null,"Errore","Modello non trovato",JOptionPane.ERROR_MESSAGE);		
	}
	

}
