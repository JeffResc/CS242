package main;

public class Triangle extends Shape {
	
	private float base;
	private float height;
	private final static int NUMBER_OF_SIDES = 3;
	
	public Triangle( float base, float height ) {
		super( NUMBER_OF_SIDES );
		this.base = base;
		this.height = height;
	}
	
	
	
}
