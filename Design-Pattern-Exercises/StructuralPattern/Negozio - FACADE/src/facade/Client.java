package facade;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Client {
	public static void main(String[] args) {
		Negozio negozio = new Negozio();
		Telefono cel = negozio.getTelefono("Samsung");
		System.out.println(cel.getModello());
	}
}
