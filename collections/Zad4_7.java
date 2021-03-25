package collections;

import java.awt.*;
import javax.swing.*;

public class Zad4_7 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.add(new Zad4_7_BallControl());
		frame.setTitle("Bouncy");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}