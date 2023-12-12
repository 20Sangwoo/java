package reports10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoveJava extends JFrame{
	public LoveJava() {
		setTitle("Change by left key");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love java");
		c.add(la);
		
		la.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT){
					JLabel label = (JLabel)e.getSource();
					StringBuffer text  = new StringBuffer(label.getText());
					label.setText(text.reverse().toString());
				}
			}
		});
		la.setFocusable(true);
		la.requestFocus();
	}

	public static void main(String[] args) {
		new LoveJava();
	}
}
