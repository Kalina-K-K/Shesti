package collections;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.Timer;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JPanel;

class Zad4_7_BallPanel extends JPanel {
	private int delay = 10;
	private ArrayList<Zad4_7_Ball> list = new ArrayList<Zad4_7_Ball>();
// Create a timer with the initial delay
	protected Timer timer = new Timer(delay, new TimerListener());

	private class TimerListener implements ActionListener {
		@Override /** Handle the action event */
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}

	public Zad4_7_BallPanel() {
		timer.start();
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int x=e.getX();
				int y=e.getY();
				ArrayList<Zad4_7_Ball> toBeRemoved=new ArrayList<>();
				for(int j=0; j<list.size(); j++) {
					Zad4_7_Ball ball = (Zad4_7_Ball) list.get(j);
					double distance = Zad4_7_BallPanel.distance(x, y, ball.x, ball.y);
					if(ball.radius>=distance) {
						toBeRemoved.add(ball);
					}
					list.removeAll(toBeRemoved);
				}
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}

	public void add() {
		list.add(new Zad4_7_Ball());
	}

	public void subtract() {
		if (list.size() > 0)
			list.remove(list.size() - 1); // Remove the last ball
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < list.size(); i++) {
			Zad4_7_Ball ball = (Zad4_7_Ball) list.get(i); // Get a ball
			g.setColor(ball.color); // Set ball color
			// Check boundaries
			if (ball.x < 0 || ball.x > getWidth())
				ball.dx = -ball.dx;
			if (ball.y < 0 || ball.y > getHeight())
				ball.dy = -ball.dy;
			// Adjust ball position
			ball.x += ball.dx;
			ball.y += ball.dy;
			g.fillOval(ball.x - ball.radius, ball.y - ball.radius, ball.radius * 2, ball.radius * 2);
		}
		ArrayList<Zad4_7_Ball> toBeRemoved=new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			Zad4_7_Ball ball = (Zad4_7_Ball) list.get(i);
			for(int j=i+1; j<list.size(); j++) {
				Zad4_7_Ball nextBall = (Zad4_7_Ball) list.get(j);
				int radiusSum=ball.radius+nextBall.radius;
				double distance = Zad4_7_BallPanel.distance(ball.x, ball.y, nextBall.x, nextBall.y);
				if(radiusSum>=distance) {
					toBeRemoved.add(nextBall);
					ball.radius+=nextBall.radius;
				}
			}
		}
		list.removeAll(toBeRemoved);
	}
	
	public static double distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(Math.abs(x1-x2), 2)+Math.pow(Math.abs(y1-y2), 2));
	}

	public void suspend() {
		timer.stop();
	}

	public void resume() {
		timer.start();
	}

	public void setDelay(int delay) {
		this.delay = delay;
		timer.setDelay(delay);
	}
}