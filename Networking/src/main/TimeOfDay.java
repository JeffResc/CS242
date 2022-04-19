package main;

import java.io.*;
import java.net.*;

public class TimeOfDay {
	
	private static final int PORT_NUM = 13;
	private static final String SERVER_NAME = "time.nist.gov";
	
	public static void main(String[] args) {
		try {
			Socket skt = new Socket(SERVER_NAME, PORT_NUM);
			System.out.println("Established connection to " + SERVER_NAME);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
			
			String useless = br.readLine();
			
			String timeOfDay = br.readLine();
			
			System.out.println("Time of day from server: " + timeOfDay);
			
			br.close();
			skt.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
