package reports10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrintC extends JFrame{
	public PrintC() {
		setTitle("RandomC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);

		Container c = getContentPane();	
		c.setLayout(null);
		
		JLabel la = new JLabel("C");
		la.setSize(10, 10);
		la.setLocation(100, 100);
		c.add(la);
		
		la.setFocusable(true);
		la.requestFocus();
		
		la.addMouseListener(new MouseAdapter() {	
			public void mouseClicked(MouseEvent e) {	
				JLabel label = (JLabel)e.getSource();
				label.setLocation((int)(Math.random()*250), (int)(Math.random()*250));
			}
		});
	}
	public static void main(String[] args) {
		new PrintC();
	}
}
