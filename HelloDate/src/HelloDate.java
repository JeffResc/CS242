/**
 * 
 * Class that prints out Hello Date
 * 
 * This material gets printed to Javadoc
 * and has a special tag called "@author"
 * that describes the author
 * 
 * @author Jeff
 *
 */
import java.util.Date;

public class HelloDate {
	/**
	 * Main method that prints out Hello Date!
	 * 
	 * This material gets printed to Javadoc
	 * and has a special tag called "@param"
	 * that describes the command line arguments
	 * 
	 * @param args Command Line Arguments
	 */
	public static void main( String[] args ) {
		/**
		 * This main function does the task of printing
		 * content to the screen using a 
		 * System.out.println call
		 * 
		 * This content does not show up in Javadoc
		 */
		
		// The following line prints out content, this line does not show up in Javadoc
		System.out.println( "Today is: " + new Date() );
	}
}
