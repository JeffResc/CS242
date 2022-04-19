
public class PracticeQ3 {
	public int parseIntFromString(String input) {
		try {
			return Integer.parseInt(input);
		} catch(NumberFormatException nfe) {
			System.err.println(nfe.getMessage());
		}
	}
	
	public static void main(String[] args) {
		
	}
}
