package upr;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	public class TicTacToe {
	    public static int count = 0;
	    public static String[][] board = new String[3][3];

	    public static void buttonClicked(JButton button) {
	        if(button.getText().equals("")) {
	            count++;
	            if(count % 2 == 1) {
	                button.setText("X");
	            }
	            if(count % 2 == 0) {
	                button.setText("O");
	            }
	        }   
	    }


	    public static void gameRules(JButton button, JFrame frame) {
	        //"X" or "O"?
	        String string = button.getText();

	        //Gives coordinates of the button
	        int x = Character.getNumericValue(button.getName().charAt(0));
	        int y = Character.getNumericValue(button.getName().charAt(1));
	        board[x][y] = string;

	        //diagonal
	        if(board[0][0]!=null && board[1][1]!=null && board[2][2]!=null && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
	            JOptionPane.showMessageDialog(null,string + " won."); 
                frame.dispose();
	        }

	        //other diagonal
	        else if(board[0][2]!=null && board[1][1]!=null && board[2][0]!=null && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
	            JOptionPane.showMessageDialog(null,string + " won."); 
                frame.dispose();
	        }

	        //draw?
	        else if(count==9) {
	            JOptionPane.showMessageDialog(null,"draw."); 
                frame.dispose();
	        }

	        else {

	            //row
	            for(int i = 0; i < 3; i++) {
	                if(board[i][0]!=null && board[i][1]!=null && board[i][2]!=null && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
	                    JOptionPane.showMessageDialog(null,string + " won."); 
	                    frame.dispose();
	                }
	            }

	            //column
	            for(int j = 0; j < 3; j++) {
	                if(board[0][j]!=null && board[1][j]!=null && board[2][j]!=null && board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j])) {
	                    JOptionPane.showMessageDialog(null,string + " won."); 
	                    frame.dispose();
	                }
	            }
	        }   
	    }
}
