package main;

import java.net.*;
import java.io.*;
import java.io.*;

public class SimpleClient {
	private static final int PORT_NUM = 7000;
	private static final String SERVER_NAME = "localhost";
	
	public static void main(String[] args) {
		try {
			Socket skt = new Socket(SERVER_NAME, PORT_NUM);
			System.out.println("Established connection to " + SERVER_NAME);
			
			System.out.println("Write a line to send to the server:");
			
			BufferedReader inFromStd = new BufferedReader(new InputStreamReader(System.in));
			String lineFromStd = inFromStd.readLine();
			inFromStd.close();
			
			PrintWriter outToServer = new PrintWriter(skt.getOutputStream(), true);
			outToServer.println(lineFromStd);
			// outToClient.flush(); <-- Do this if auto flush is set to false
			
			BufferedReader inFromServer = new BufferedReader(new InputStreamReader(skt.getInputStream()));
			String lineFromServer = inFromServer.readLine();
			System.out.println("Server sent: " + lineFromServer);
			inFromServer.close();
			
			skt.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
