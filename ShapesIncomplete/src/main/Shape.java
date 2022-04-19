package main;

public class Shape {
	private int numberOfSides;
	
	public Shape( int numberOfSides ) {
		this.numberOfSides = numberOfSides;
	}
	
	public void displayNumberOfSides() {
		System.out.println( "This shape has " + numberOfSides + " sides." );
	}
	
	
}
