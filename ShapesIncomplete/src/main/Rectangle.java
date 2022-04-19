package main;

public class Rectangle extends Shape {
	
	private float length;
	private float width;
	private final static int NUMBER_OF_SIDES = 3;
	
	public Rectangle( float length, float width ) {
		super( NUMBER_OF_SIDES );
		this.length = length;
		this.width = width;
	}
	
	
	
}
