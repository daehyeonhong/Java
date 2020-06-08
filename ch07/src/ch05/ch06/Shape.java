package ch05.ch06;

public class Shape {
	public Shape next;

	public Shape() {
		next = null;
	}

	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("Rectangle");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}