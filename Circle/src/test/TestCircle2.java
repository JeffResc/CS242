package test;

import main.Circle;

public class TestCircle2 {

	public static void main (String[] args) {
		/*
		Circle circle1 = new Circle(2.3f, 4, 2);
		System.out.println("Circle1 radius: " + circle1.getRadius());
		
		//Circle circle2 = new Circle();
		//System.out.println(circle2.getRadius());
		
		Circle circle2 = circle1;
		System.out.println("Circle2 radius: " + circle2.getRadius());
		
		System.out.println("Changing Circle1's radius...");
		circle1.setRadius(4.f);
		System.out.println("Circle1 radius: " + circle1.getRadius());
		System.out.println("Circle2 radius: " + circle2.getRadius());
		*/
		
		Circle circle1 = new Circle(2.3f, 4, 2);
		Circle circle2 = new Circle(2.3f, 4, 2);
		
		System.out.println(circle1.equals(circle2));
		
		//circle1.setRadius(3.2f);
		//System.out.println(circle1.equals(circle2));
		
		Circle circle3 = new Circle(5.2f, 2, 1);
		Circle circle4 = circle3;
		
		System.out.println(circle3.equals(circle4));
	}
}
