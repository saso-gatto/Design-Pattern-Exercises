package factoryMethodAuto;

import javax.swing.JOptionPane;

public abstract class Auto {
	protected String modello;
	protected String colore;
	protected int prezzo;
	

	public abstract void calcolaPrezzo();
	
	public void mostraAuto() {
		JOptionPane.showMessageDialog(null, "Riepilogo, modello: "+modello+"; colore: "+colore+"; prezzo: "+prezzo+".");
		
	}
}
