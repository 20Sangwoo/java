package reports10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SizeDown extends JFrame{
	public SizeDown() {
		setTitle("MouseWheel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);	
		setVisible(true);	
		Container c = getContentPane();	
		c.setLayout(new FlowLayout());

		JLabel la = new JLabel("Love Java");
		la.setFont(new Font("Arial", Font.PLAIN, 15));
		c.add(la);

		la.setFocusable(true);
		la.requestFocus();

		la.addMouseWheelListener(new MouseWheelListener() {	
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				if(n < 0) {
					JLabel label = (JLabel)e.getSource();
					Font f = label.getFont();
					int size = f.getSize();
					label.setFont(new Font("Arial", Font.PLAIN, size+5));
				}
				else {
					JLabel label = (JLabel)e.getSource();
					Font f = label.getFont();
					int size = f.getSize();
					if (size <= 5) return;
					label.setFont(new Font("Arial", Font.PLAIN, size-5));
				}
			}
		});
	}
	public static void main(String[] args) {
		new SizeDown();
	}
}