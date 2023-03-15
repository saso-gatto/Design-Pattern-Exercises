package Halloween;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Strega extends Decorazione {

	public Strega() {
		this.tipo="Strega";
	}
	
	@Override
	public void disegna() {
		System.out.println("Disegna strega!!!");	
		JFrame f2 = new JFrame();
        f2.setTitle("Strega");
        f2.setSize(300, 300);
        Image img = this.caricaImmagine("/strega.png").getScaledInstance(f2.getHeight(),f2.getWidth(),Image.SCALE_SMOOTH);
        ImageIcon aggiungi = new ImageIcon(img);
        JLabel label = new JLabel (aggiungi);
		f2.add(label);
        f2.setLocationRelativeTo(null);
        f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
        f2.setVisible(true);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return (Strega) super.clone();
	}
	
	@Override
	public Decorazione getDecorazione() throws CloneNotSupportedException {
		return (Decorazione) this.clone();
		
	}

}
