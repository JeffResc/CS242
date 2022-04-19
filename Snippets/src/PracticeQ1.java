import java.io.*;
import java.util.Scanner;

public class PracticeQ1 {
	public static void main(String[] args) {
		String input = "To be, or not to be, that is the question.";
		Scanner scan = new Scanner(input);
		scan.useDelimiter("be");

		while(scan.hasNext()) {
        		System.out.println("||" + scan.next() + "||");
		}

		scan.close();
	}
}
