package factoryMethodAuto;


import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ConcessionariaLancia  extends Concessionaria {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override //Metodo Fabbrica
	public void scegliAuto(String a) {
		String modello = JOptionPane.showInputDialog("Scegli un modello fra: Ypsolon, Musa");
		while (!modello.equals("Ypsolon") && !modello.equals("Musa"))
			JOptionPane.showInputDialog("Scegli un modello fra: Ypsolon, Musa");
		String colore = JOptionPane.showInputDialog("Scegli il colore della macchina");
		cliente = new Lancia (modello,colore);
		cliente.mostraAuto();	
	}
	
	
	
	
	
}
