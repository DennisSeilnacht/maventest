package de.seilnacht;
import java.io.*;

public class buchstaben {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Gib was ein: ");
		String eingabe = br.readLine();


			for (char c : eingabe.toCharArray()) {
				if (Character.isLowerCase(c)) {
					System.out.print(Character.toUpperCase(c));
				} else {
					System.out.print(c);
				}
			}
		

	}

}
