package Halloween;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Zucca extends Decorazione {
	
	public Zucca() {
		this.tipo="Zucca";
	}
	
	@Override
	public void disegna() {
		System.out.println("Disegna zucca!!!");	
		JFrame f2 = new JFrame();
        f2.setTitle("Zucca");
        f2.setSize(300, 300);
        Image zucca = this.caricaImmagine("/zucca.png").getScaledInstance(f2.getHeight(),f2.getWidth(),Image.SCALE_SMOOTH);
        ImageIcon aggiungi = new ImageIcon(zucca);
        JLabel label = new JLabel (aggiungi);
		f2.add(label);
        f2.setLocationRelativeTo(null);
        f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
        f2.setVisible(true);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return (Zucca) super.clone();
	}

	@Override
	public Decorazione getDecorazione() throws CloneNotSupportedException {
		return (Decorazione) this.clone();
		
	}

}
