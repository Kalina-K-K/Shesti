package generic;

public class Circle extends GeometricObject {
	double radius=1;
	
	Circle(){
		
	}
	
	Circle(double newRadius){
		radius=newRadius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	double getPerimeter() {
		return 2*radius*Math.PI;
	}
	void setRadius(double newRadius) {
		radius=newRadius;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		
		return super.compareTo((Circle)arg0);
	}
	
	public String toString() {
		return "Circle with radius " + radius + "\nArea: " + getArea() + "\n";
	}
}
