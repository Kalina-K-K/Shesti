package generic;

public class Rectangle extends GeometricObject {
	double a;
	double b;
	
	Rectangle(double a, double b){
		this.a=a;
		this.b=b;
	}
	
	public double getArea() {
		return a*b;
	}
	double getPerimeter() {
		return 2*(a+b);
	}
	
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return super.compareTo((Rectangle)arg0);
	}
	
	public String toString() {
		return "Rectangle with dimensions " + a + ", " + b + "\nArea: " + getArea() + "\n";
	}
}
