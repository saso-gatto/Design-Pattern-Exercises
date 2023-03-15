package bridge;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class WinButton extends GraphicIcon {



	public Image getIcon(String nameFile) {
		BufferedImage img = null;
		Image scaled = null;
		try {
			img = ImageIO.read(getClass().getResourceAsStream("/Windows/"+nameFile));
			scaled = img.getScaledInstance(50,50, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			System.out.println("impossibile trovare l'immagine");
		}
		return scaled;
	}

}
