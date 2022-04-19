package main;

import java.net.*;
import java.io.*;

public class SimpleServer {
	
	private static final int PORT_NUM = 7000;
	
	public static void main(String[] args) {
		try {
			ServerSocket sskt = new ServerSocket(PORT_NUM);
			System.out.println("Waiting for a client to make a connnection...");
			Socket clientSocket = sskt.accept();
			
			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			String lineFromClient = inFromClient.readLine();
			String lineToClient = "Echoed: " + lineFromClient;
			
			PrintWriter outToClient = new PrintWriter(clientSocket.getOutputStream(), true);
			
			System.out.println("Sending to client: " + lineToClient);
			outToClient.println(lineToClient);
			// outToClient.flush(); <-- Do this if auto flush is set to false
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
