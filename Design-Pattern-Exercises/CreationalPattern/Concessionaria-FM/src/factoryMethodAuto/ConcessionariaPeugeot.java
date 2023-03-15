package factoryMethodAuto;

import javax.swing.JOptionPane;

public class ConcessionariaPeugeot extends Concessionaria {
	
	@Override
	public void scegliAuto(String a) {
		String modello = JOptionPane.showInputDialog("Scegli un modello fra: 208, 2008 e 3008");
		while (!modello.equals("208") && !modello.equals("2008") && !modello.equals("3008"))
			JOptionPane.showInputDialog("Scegli un modello fra: 208, 2008 e 3008");
		String colore = JOptionPane.showInputDialog("Scegli il colore della macchina");
		cliente = new Peugeot (modello,colore);
		cliente.mostraAuto();		
	}

}