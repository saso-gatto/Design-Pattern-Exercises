package Halloween;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Decorazione implements Cloneable {
	
	protected String tipo; 
	
	public BufferedImage caricaImmagine(String filename) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(getClass().getResourceAsStream(filename));
		} catch (IOException e) {
			System.out.println("impossibile trovare l'immagine");
		}
		return img;
	}
	
	public String getType() { return tipo;}
	
	public abstract void disegna ();
	
	public abstract Decorazione getDecorazione() throws CloneNotSupportedException;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
