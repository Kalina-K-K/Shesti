package generic;

public abstract class GeometricObject implements Comparable {
		protected String color = "white";
		private boolean filled;
		private java.util.Date dateCreated;

		public abstract double getArea();
		
		/** Construct a default geometric object */
		public GeometricObject() {
			dateCreated = new java.util.Date();
		}

		/**
		 * Construct a geometric object with the specified color and filled value
		 */
		public GeometricObject(String color, boolean filled) {
			dateCreated = new java.util.Date();
			this.color = color;
			this.filled = filled;
		}

		/** Return color */
		public String getColor() {
			return color;
		}

		/** Set a new color */
		public void setColor(String color) {
			this.color = color;
		}

		/**
		 * Return filled. Since filled is boolean, its getter method is named isFilled
		 */
		public boolean isFilled() {
			return filled;
		}

		/** Set a new filled */
		public void setFilled(boolean filled) {
			this.filled = filled;
		}

		/** Get dateCreated */
		public java.util.Date getDateCreated() {
			return dateCreated;
		}

		/** Return a string representation of this object */
		public String toString() {
			return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
		}
		
		public int compareTo(GeometricObject go) {
			if(this.getArea()>go.getArea()) {
				return 1;
			}else if(this.getArea()==go.getArea()) {
				return 0;
			}else {
				return -1;
			}
		}

		@Override
		public int compareTo(Object go) {
			if(this.getArea()>((GeometricObject) go).getArea()) {
				return 1;
			}else if(this.getArea()==((GeometricObject) go).getArea()) {
				return 0;
			}else {
				return -1;
			}
		}
		
//		public abstract double getArea();
//		public abstract double getPerimeter();
		
}
