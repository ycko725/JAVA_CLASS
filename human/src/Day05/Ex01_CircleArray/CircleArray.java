package Day05.Ex01_CircleArray;

import Day05.Ex01_CircleArray.Circle;

class Circle {
	int radius;

	public Circle(int radius) {
	
	this.radius=radius;
	}
public double getArea() {
	return 3.14*radius*radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		Circle[] c;
		c = new Circle[5];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i+1);
		}
		for(Circle circle : c) {
			System.out.println("넓이 : " + circle.getArea());
		}
	}
}