package ch05.ch05;

public class Shape {
	void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	void draw() {
		System.out.println("Line");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Circle");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Rectangle");
	}
}