package collections;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Collections;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Zad3_7_2 {
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		JFrame frame = new JFrame();
		frame.setSize(310, 360);	
		frame.setTitle("Zad 3");
//		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JPanel panel=new JPanel();
		frame.add(panel);
		panel.setLayout(null);
		JLabel label = new JLabel("Enter a number");
		label.setBounds(10, 20, 100, 25);
		panel.add(label);
		
		JTextArea area = new JTextArea();
		
		JTextField text = new JTextField(20);
		text.setBounds(120, 20, 165, 25);
		text.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Integer number = Integer.parseInt(text.getText());
				if(!numbers.contains(number)) {
					numbers.add(number);
				}
				text.setText("");
				area.setText(numbers.toString());
			}
			
		});
		panel.add(text);
		
		area.setBounds(10, 50, 275, 200);
		panel.add(area);
		JButton sort = new JButton("Sort");
		sort.setBounds(10, 260, 90, 40);
		sort.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Collections.sort(numbers);
				area.setText(numbers.toString());
			}
			
		});
		panel.add(sort);
		JButton shuffle = new JButton("Shuffle");
		shuffle.setBounds(105, 260, 90, 40);
		shuffle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Collections.shuffle(numbers);
				area.setText(numbers.toString());
			}
			
		});
		panel.add(shuffle);
		JButton reverse = new JButton("Reverse");
		reverse.setBounds(200, 260, 90, 40);
		reverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Collections.sort(numbers, Collections.reverseOrder());
			area.setText(numbers.toString());
			}
		});
		panel.add(reverse);
		frame.repaint();
		
	}
}
