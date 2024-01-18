package entities;

public class Rectangle {
	
	public double width, height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return width + height + width + height;
	}
	
	public double diagonal() {
		return Math.sqrt((width * width) + (height * height));
	}

}
