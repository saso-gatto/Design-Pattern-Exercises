package factoryMethodAuto;

import javax.swing.JOptionPane;

public class ConcessionariaFiat extends Concessionaria {

	@Override
	public void scegliAuto(String a) {
		String modello = JOptionPane.showInputDialog("Scegli un modello fra: Panda, 500 e 500XL");
		while (!modello.equals("Panda") && !modello.equals("500") && !modello.equals("500XL"))
			JOptionPane.showInputDialog("Scegli un modello fra: Panda, 500 e 500XL");
		String colore = JOptionPane.showInputDialog("Scegli il colore della macchina");
		cliente = new Fiat(modello,colore);
		cliente.mostraAuto();
		
	}

}
