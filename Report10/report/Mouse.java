package reports10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mouse extends JFrame{
	private JLabel la = new JLabel("사랑해");
	public Mouse() {
		setTitle("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		
		la.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				JLabel label = (JLabel)e.getSource();
				label.setText("Love java");
			}
			public void mouseExited(MouseEvent e) {
				JLabel label = (JLabel)e.getSource();
				label.setText("사랑해");
			}
		});
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Mouse();
	}
}
