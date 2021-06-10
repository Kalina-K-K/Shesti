package upr;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TicTacToeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showWindow();
	}
	public static void showWindow() {
		JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.GridLayout(3, 3));

        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                final JButton button = new JButton();
                String string = i +  "" + j;
                button.setText("");
                button.setName(string);
                button.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            TicTacToe.buttonClicked(button);
                            TicTacToe.gameRules(button, frame);
                        }
                    });
                button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panel.add(button);
            }

        }

        frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);

    }

}
