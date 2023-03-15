package mediator;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Close extends JButton {
	private ImageIcon icon;
	
	public Image caricaImmagine(String filename) {
		Image img = null;
		try {
			img = ImageIO.read(getClass().getResourceAsStream("/mediator/Icon/"+filename));
			img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			System.out.println("impossibile trovare l'immagine");
		}
		return img;
	}
	
	
	public Close() {
		//this.setPreferredSize(new Dimension(50,50));
		icon = new ImageIcon(caricaImmagine("close.png"));
		this.setIcon(icon);
	//	this.setBounds(100,700,50,50);
	}

	

}
