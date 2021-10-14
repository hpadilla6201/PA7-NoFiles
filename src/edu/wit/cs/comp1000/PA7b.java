package edu.wit.cs.comp1000;
/*
 * Counting Letters in the Alphabet
 * @author Hector Padilla
 * @date December 5 2019
 */


import java.util.Scanner;

//TODO: document this class
public class PA7b {

	/**
	 * Program execution point: input text via console input, output counts for each
	 * letter found in the input (case-insensitive)
	 * 
	 * @param args command-line arguments (ignored)
	 */
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int[] alphabet = new int[26];

		System.out.print("Enter text: ");

		while (scnr.hasNext()) {
			String input = scnr.next().toLowerCase();
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (c >= 'a') {
					alphabet[c - 'a']++;
				}
			}
		}

		int x = 0;

		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] > 0) {
				System.out.println(((char) ('A' + i)) + ": " + alphabet[i]);
				x++;
			}
		}
		if (x == 0) {
			System.out.println();
		}

	}
}
