import java.util.InputMismatchException;
import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		try {
			String line = "peter_pecked_peppers_repeatedly";
			Scanner scan = new Scanner(line);
			scan.useDelimiter("pe");
			
			while(scan.hasNext()) {
				System.out.println("|" + scan.next() + "|");
			}
		} catch(InputMismatchException ime) {
			System.err.println("Invalid type of input.");
		}
	}
}
