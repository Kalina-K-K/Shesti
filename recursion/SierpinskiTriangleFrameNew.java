package recursion;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SierpinskiTriangleFrameNew extends JFrame {
	static int r = 0, gr = 0, b = 255;
	int order=0;

	private JButton lower = new JButton("-");
	private JButton higher = new JButton("+");
	private SierpinskiTrianglePanelNew trianglePanel = new SierpinskiTrianglePanelNew(); // To display the pattern

	public SierpinskiTriangleFrameNew() {
// Panel to hold label, text field, and a button
		JPanel panel = new JPanel();
		panel.add(new JLabel("Enter an order: "));
		panel.add(lower);
		panel.add(higher);
//		jtfOrder.setHorizontalAlignment(SwingConstants.RIGHT);
// Add a Sierpinski triangle panel to the frame
		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);
// Register a listener
		lower.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				trianglePanel.c=255;
				if(order!=0) {
					order--;
				trianglePanel.setOrder(order);
				}
			}
		});
		higher.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				trianglePanel.c=255;
				order++;
				trianglePanel.setOrder(order);
			}
		});

	}
	}
	
