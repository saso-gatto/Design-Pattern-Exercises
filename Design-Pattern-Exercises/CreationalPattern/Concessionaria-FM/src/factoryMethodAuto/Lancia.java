package factoryMethodAuto;

import javax.swing.JOptionPane;

public class Lancia extends Auto {
	
	public Lancia() {
		super();
	}

	public Lancia(String mod, String col) {
			this.modello=mod;
			this.colore=col;
			this.calcolaPrezzo();
	}

		
	@Override
	public void calcolaPrezzo() {
		if (this.modello.equals("Ypsolon"))
			this.prezzo=13500;
		else if (this.modello.equals("Musa"))
			this.prezzo=16000;
		else
			JOptionPane.showMessageDialog(null,"Errore","Modello non trovato",JOptionPane.ERROR_MESSAGE);		
	}
	

}
