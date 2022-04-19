package test;

import main.Circle;

public class TestCircle {

	public static void main (String[] args) {
		
		System.out.println("Testing constructor 1 with circle1...");
		
		System.out.println();
		
		Circle circle1 = new Circle(2.3f, 4, 2);
		System.out.println(circle1);
		
		System.out.println();
		
		System.out.println("Changing the radius...");
		circle1.setRadius(5.6f);
		System.out.println(circle1);
		
		System.out.println();
		
		System.out.println("Changing the center X...");
		circle1.setCenterX(3);
		System.out.println(circle1);
		
		System.out.println();
		
		System.out.println("Changing the center Y...");
		circle1.setCenterY(6);
		System.out.println(circle1);
		
		System.out.println();
		
		System.out.println("Testing constructor 2 with circle2...");
		
		System.out.println();
		
		Circle circle2 = new Circle(2.3f);
		System.out.println(circle2);
		
		System.out.println();
		
		System.out.println("Changing the radius...");
		circle2.setRadius(5.6f);
		System.out.println(circle2);
		
		System.out.println();
		
		System.out.println("Changing the center X...");
		circle2.setCenterX(3);
		System.out.println(circle2);
		
		System.out.println();
		
		System.out.println("Changing the center Y...");
		circle2.setCenterY(6);
		System.out.println(circle2);
		
		System.out.println();
		
		System.out.println("Testing constructor 3 with circle3...");
		
		System.out.println();
		
		Circle circle3 = new Circle();
		System.out.println(circle3);
		
		System.out.println();
		
		System.out.println("Changing the radius...");
		circle3.setRadius(5.6f);
		System.out.println(circle3);
		
		System.out.println();
		
		System.out.println("Changing the center X...");
		circle3.setCenterX(3);
		System.out.println(circle3);
		
		System.out.println();
		
		System.out.println("Changing the center Y...");
		circle3.setCenterY(6);
		System.out.println(circle3);
	}
}
