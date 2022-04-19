import java.io.*;
import java.util.Scanner;

public class PracticeQ2 {
	public static void main(String[] args) {
		String input = "To_be_or_not_to_be";
		Scanner scan = new Scanner(input);
		scan.useDelimiter("_");

		String a = "";
		while(scan.hasNext()) {
			a = scan.next();
		}
		System.out.println(a);

		scan.close();
	}
}
