package mediator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Mediator extends JPanel {
	private Color color;
	
	public void impostaMetodo(JButton b) {
		if (b.getClass().getTypeName().equals("mediator.Close"))
			b.addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
		else if (b.getClass().getTypeName().equals("mediator.ChangeColor"))
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String colore = JOptionPane.showInputDialog("Scrivi il colore da te desiderato fra blu, rosso e arancione");
					if (colore.equals("Rosso"))
						color= Color.RED;
					else if (colore.equals("Blu"))
						color = Color.BLUE;
					else if (colore.equals("Arancione"))
						color=Color.ORANGE;
					repaint();
				}
			});
		else if (b.getClass().getTypeName().equals("mediator.Time"))
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					LocalDateTime time = LocalDateTime.now();
					JOptionPane.showMessageDialog(null,"Ora e data attuali:"+time);
				}
			});
	}
	
	
	public Mediator() {
		color= Color.WHITE;
		this.setLayout(new BoxLayout(this,BoxLayout.LINE_AXIS));
		JButton b1 = new Close();
		System.out.println("Test getType: "+b1.getClass().getTypeName());
		this.add(Box.createHorizontalGlue());

		this.add(b1);
		this.add(Box.createHorizontalGlue());
		impostaMetodo(b1);
		JButton b2= new ChangeColor();
		impostaMetodo(b2);
		JButton b3 = new Time();
		this.add(b2);
		this.add(Box.createHorizontalGlue());
		impostaMetodo(b3);
		this.add(b3);
		this.add(Box.createHorizontalGlue());


	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(this.color);
	}
	
}
