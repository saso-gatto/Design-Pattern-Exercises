package factoryMethodAuto;

import javax.swing.JOptionPane;

public class Fiat extends Auto {
			
	public Fiat() {
		super();
	}

	public Fiat(String mod, String col) {
			this.modello=mod;
			this.colore=col;
			this.calcolaPrezzo();
	}

	@Override
	public void calcolaPrezzo() {
		if (this.modello.equals("Panda"))
			this.prezzo=13000;
		else if (this.modello.equals("500"))
			this.prezzo=14000;
		else if (this.modello.equals("500XL"))
			this.prezzo=25000;
		else
			JOptionPane.showMessageDialog(null,"Errore","Modello non trovato",JOptionPane.ERROR_MESSAGE);		
	}
	

}
