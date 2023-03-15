package bridge;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Client {
	
	
	
	public static void main(String[] args) {
		JFrame f1 = new JFrame();
		f1.setSize(new Dimension(400,400));
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,1));
		JButton win = new JButton("Windows button");
		p.add(win);
		win.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				impostaWinButton(new WinButton());
			}
		});
		JButton mac = new JButton ("Mac button");
		p.add(mac);
		mac.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				impostaWinButton(new MacButton());
			}
		});
		f1.add(p);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void impostaWinButton(GraphicIcon b) {
		JFrame f2 = new JFrame();
		f2.setSize(new Dimension (400,400));
		f2.setLayout(new GridLayout(1,2));
		Icon close =new Close();
		Resize re = new Resize();
		ImageIcon icona1 = new ImageIcon (b.getIcon("close.png"));
        JButton b1 = new JButton(icona1);
        f2.add(b1);
        b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				close.setAction();				
			}
		});
        ImageIcon icona2 = new ImageIcon(b.getIcon("resize.png"));
        JButton b2 = new JButton(icona2);
        b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					re.setAction();
					f2.setExtendedState(JFrame.MAXIMIZED_BOTH); 
			}
        });
        f2.add(b2);
        f2.setVisible(true);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
