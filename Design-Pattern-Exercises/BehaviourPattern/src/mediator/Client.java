package mediator;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Client {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(new Dimension(800,800));
		Mediator m = new Mediator();
		f.add(m);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
