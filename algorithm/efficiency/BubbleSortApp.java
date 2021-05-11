package algorithm.efficiency;

import java.awt.*;
import javax.swing.*;

public class BubbleSortApp {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.add(new BubbleSortControl());
		frame.setTitle("Sorty");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}