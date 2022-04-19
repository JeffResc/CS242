package main;

import java.awt.Point;

public class Circle {
	
	// Constants
	private static final float DEFAULT_RADIUS = 1.0f;
	private static final int DEFAULT_CENTER_X = 0;
	private static final int DEFAULT_CENTER_Y = 0;
	
	// Data, instance variables, global variables
	private float radius;
	private Point center;

	public Circle(float radius, int centerX, int centerY) {
		super();
		this.radius = radius;
		center = new Point(centerX, centerY);
	}
	
	public Circle(float radius) {
		this(radius, DEFAULT_CENTER_X, DEFAULT_CENTER_Y);
	}
	
	public Circle() {
		this(DEFAULT_RADIUS);
	}

	/**
	 * @return the radius
	 */
	public float getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}

	/**
	 * @return the centerX
	 */
	public int getCenterX() {
		return center.x;
	}

	/**
	 * @param centerX the centerX to set
	 */
	public void setCenterX(int centerX) {
		center.x = centerX;
	}

	/**
	 * @return the centerY
	 */
	public int getCenterY() {
		return center.y;
	}

	/**
	 * @param centerY the centerY to set
	 */
	public void setCenterY(int centerY) {
		center.y = centerY;
	}

	/**
	 * Computes the area of the circle
	 * @return
	 */
	public float computeArea() {
		return (float)((Math.PI) * (Math.pow(radius, 2)));
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle(2.3f, 4, 2);
		
		System.out.println("Radius = " + circle.getRadius());
		System.out.println("Center X = " + circle.getCenterX());
		System.out.println("Center Y = " + circle.getCenterY());
		System.out.println("Area = " + circle.computeArea());
	}
	
	@Override
	public String toString() {
		return "This is a Circle with radius = " + getRadius() + " center = (" + getCenterX() + ", " + getCenterY()
				+ ") area = " + computeArea();
	}

	@Override
	public int hashCode() {
		return 0x20;
	}

	@Override
	public boolean equals(Object other) {
		if (other == null)
			if (!(other instanceof Circle))
				return false;

		Circle otherCircle = (Circle) other;
		return this.radius == otherCircle.getRadius() && this.center.x == otherCircle.getCenterX()
				&& this.center.y == otherCircle.getCenterY();
	}
	
}
