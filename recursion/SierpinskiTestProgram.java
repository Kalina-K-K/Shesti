package recursion;

import javax.swing.JFrame;

public class SierpinskiTestProgram {
	public static void main(String[] args) {
		SierpinskiTriangleFrameNew frame = new SierpinskiTriangleFrameNew();
		frame.setSize(400, 400);
		frame.setTitle("TestFigurePanel");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}