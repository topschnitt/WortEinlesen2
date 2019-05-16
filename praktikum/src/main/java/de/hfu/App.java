package de.hfu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App 
{
	public static void main(String[] args) throws IOException {

		if (args.length==1) {
			System.out.println(args[0].toUpperCase());
		}
		else {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String input = in.readLine();
			System.out.println(input.toUpperCase());
		}

		return;
		
	}
}
