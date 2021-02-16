package recursion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;

import javax.swing.JPanel;

public class SierpinskiTrianglePanelNew extends JPanel {
		private int order = 0;
		static int c=1;
//		boolean p = true;
//		int pm=1;
		

		/** Set a new order */
		public void setOrder(int order) {
			this.order = order;
			repaint();
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			// Select three points in proportion to the panel size
			Point p1 = new Point(getWidth() / 2, 10);
			Point p2 = new Point(10, getHeight() - 10);
			Point p3 = new Point(getWidth() - 10, getHeight() - 10);
			displayTriangles(g, order, p1, p2, p3);
		}

		private void displayTriangles(Graphics g, int order, Point p1, Point p2, Point p3) {
			
//			c++;
//			if(c==255) {
//				c=10;
//			}
			
			c = c%255+1;
			
//			if ((c>128) && (c<255)) {
//				p = !p;
//			};
//			
//			if (p) { c++; }
//			else { c--; };
			

//			if((c>128) && (c<255)) {
//				c=c+pm;
//			}
//			else {
//p = !p;
//				//				pm=pm*(-1);
//				c=c+pm;
//			};
			
			
			
			
//			
//			if(pm==0) {
//				c--;
//			}
//			if(c==10) {
//				pm++;
//			}
//			if(pm>0) {
//				c++;
//			}
//			if(c==255) {
//				pm--;
//			}
//			
//			boolean isRising=false;
//			if(!isRising) {
//				c--;
//			}
//			if(c==1) {
//				isRising=true;
//			}
			

			Color colour = new Color(0,128,c);
			if (order == 0) {
				// Draw a triangle to connect three points
				g.drawLine(p1.x, p1.y, p2.x, p2.y);
				g.drawLine(p1.x, p1.y, p3.x, p3.y);
				g.drawLine(p2.x, p2.y, p3.x, p3.y);
				paint(g,p1,p2,p3,colour);
			} else {
				// Get the midpoint on each edge of the triangle
				Point p12 = midpoint(p1, p2);
				Point p23 = midpoint(p2, p3);
				Point p31 = midpoint(p3, p1);
				// Recursively display three triangles
				displayTriangles(g, order - 1, p1, p12, p31);
				displayTriangles(g, order - 1, p12, p2, p23);
				displayTriangles(g, order - 1, p31, p23, p3);
			}
		}

		private static Point midpoint(Point p1, Point p2) {
			return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
		}
		
		public static void paint(Graphics g, Point p1, Point p2, Point p3,Color color) {
			Polygon triangle = new Polygon();
			triangle.addPoint(p1.x, p1.y);
			triangle.addPoint(p2.x, p2.y);
			triangle.addPoint(p3.x, p3.y);

			g.setColor(color);
			g.fillPolygon(triangle);
		  }
}