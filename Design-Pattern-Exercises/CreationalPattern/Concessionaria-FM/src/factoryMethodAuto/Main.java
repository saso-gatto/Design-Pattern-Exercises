package factoryMethodAuto;

import javax.swing.JOptionPane;

public class Main {
	
	
	public static void main(String[] args) {
		Concessionaria c=null; 
		String azienda = JOptionPane.showInputDialog("Scegli un'azienda tra Fiat, Lancia e Peugeot");
		if (azienda.equals("Fiat"))
			c = new ConcessionariaFiat();
		else if (azienda.equals("Peugeot"))
			c = new ConcessionariaPeugeot();
		else if (azienda.equals("Lancia"))
			c = new ConcessionariaLancia();
		else { 
			JOptionPane.showMessageDialog(null,"Errore","Error Pattern",JOptionPane.ERROR_MESSAGE);		
			return ;
		}
		c.scegliAuto(azienda);
	}

}
