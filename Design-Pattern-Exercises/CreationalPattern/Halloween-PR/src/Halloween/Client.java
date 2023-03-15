package Halloween;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Negozio n = new Negozio();
		JFrame frame = new JFrame();
		frame.setSize(600, 250);

		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		
		JLabel label = new JLabel("Quale decorazione vuoi aggiungere?");
		label.setFont(new Font("Verdana", Font.PLAIN, 20)); // font
		label.setHorizontalAlignment(SwingConstants.CENTER); // cetrare label
		p1.add(label,BorderLayout.NORTH);
		
		JPanel bottoni = new JPanel();
		bottoni.setLayout(new GridLayout(1,3));
		JButton b1 = new JButton("ZUCCA");
		b1.setPreferredSize(new Dimension(200,200));
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					n.ottieniDecorazione("Zucca").disegna();
				} catch (CloneNotSupportedException e1) {
					e1.printStackTrace();
				};
			}
		});
		
		JButton b2 = new JButton("FANTASMA");
		b2.setPreferredSize(new Dimension(200,200));
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					n.ottieniDecorazione("Fantasma").disegna();
				} catch (CloneNotSupportedException e1) {
					e1.printStackTrace();
				};
			}
		});
		JButton b3 = new JButton("STREGA");
		b3.setPreferredSize(new Dimension(200,200));
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					n.ottieniDecorazione("Strega").disegna();
				} catch (CloneNotSupportedException e1) {
					e1.printStackTrace();
				};
			}
		});
		bottoni.add(b1);
		bottoni.add(b2);
		bottoni.add(b3);
		
		p1.add(bottoni,BorderLayout.CENTER);
			
		

		frame.add(p1,BorderLayout.PAGE_START);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
