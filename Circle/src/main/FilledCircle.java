package main;

public class FilledCircle extends Circle {

	private float red;
	private float blue;
	private float green;
	
	private static final float DEFAULT_RED = 0.0f;
	private static final float DEFAULT_GREEN = 0.0f;
	private static final float DEFAULT_BLUE = 0.0f;

	/**
	 * Constructor
	 * @param radius
	 * @param centerX
	 * @param centerY
	 * @param red
	 * @param blue
	 * @param green
	 */
	public FilledCircle(float radius, int centerX, int centerY, float red, float blue, float green) {
		super(radius, centerX, centerY);
		this.red = red;
		this.blue = blue;
		this.green = green;
	}
	
	/**
	 * Constructor
	 * @param radius
	 * @param red
	 * @param green
	 * @param blue
	 */
	public FilledCircle(float radius, float red, float green, float blue) {
		
	}
	
	/**
	 * Constructor
	 * @param radius
	 */
	public FilledCircle(float radius) {
		
	}

	/**
	 * Default constructor
	 */
	public FilledCircle() {
		this.red = DEFAULT_RED;
		this.green = DEFAULT_GREEN;
		this.blue = DEFAULT_BLUE;
	}

	/**
	 * @return the red
	 */
	public float getRed() {
		return red;
	}
	
	/**
	 * @param red the red to set
	 */
	public void setRed(float red) {
		this.red = red;
	}
	
	/**
	 * @return the blue
	 */
	public float getBlue() {
		return blue;
	}
	
	/**
	 * @param blue the blue to set
	 */
	public void setBlue(float blue) {
		this.blue = blue;
	}
	
	/**
	 * @return the green
	 */
	public float getGreen() {
		return green;
	}
	
	/**
	 * @param green the green to set
	 */
	public void setGreen(float green) {
		this.green = green;
	}
}
