import java.io.*;

/**
 * In this class, I would like to print a count down,
 * but in the middle of the count down, I would ultimately
 * like to interrupt the count down and stop it. The way I 
 * would like to do it is by having the user input "STOP"
 * and then respond to it by stopping the loop.
 * 
 * Unfortunately, currently, the code does not let me do so.
 * The code runs a loop, and lets me get user input, but
 * the user input gets intercepted at the end of the loop,
 * so I cannot use it to stop the loop in the middle.
 * 
 * The only way to interrupt the loop in the middle is by
 * using *threading*, the topic of class on Tuesday, Oct 16.
 * We will implement threading and allow the countdown loop to be
 * be stopped using user input.
 * 
 * THE CURRENT VERSION OF THE CODE RUNS, it just does not 
 * do the right thing. You are encouraged to run it before
 * coming to class. While the loop is running, type
 * "Hello" (or anything you want) and hit Enter, to see
 * when your input gets echoed back to you.
 * 
 * @author Natasha Banerjee (replace with your name)
 *
 */
public class InterruptingLoops {
	/**
	 * The main method (implements the count down loop
	 * and the user input, currently without threading)
	 * 
	 * @param args Command line arguments (not used)
	 */
	
	public static void main (String[] args) {
		/*
		 * The following snippet of code implements a countdown loop
		 * (it's more of a 'count up' loop to 20 seconds: it prints
		 * the current counter value every 2 seconds).
		 * In class, we will see how to use threading with this loop
		 */
		boolean stopCountdown = false;
		
		try {
			for (int i=0; i < 10 && !stopCountdown; i++) {
				System.out.println( 2*i + " seconds...");
				Thread.sleep( 2000 ); // introduces pause for 2000 milliseconds or 2 seconds
									 // Thread.sleep throws InterruptedException
			}
			System.out.println( "Blast off" );
		} catch ( InterruptedException ie ) {
			System.err.println( "Issues with Thread.sleep: " + ie.getMessage() );
		}
		
		/*
		 * The following snippet implements the user input
		 */
		try { 
			BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
			
			String input = br.readLine();
			
			System.out.println(input);
			
			if (input.equals("STOP")) {
				stopCountdown = true;
			}
			System.out.println(stopCountdown);
		} catch ( IOException ioe ) {
			System.err.println( "Issue with IO" );
		}
	}
}