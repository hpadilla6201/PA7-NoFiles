package edu.wit.cs.comp1000;
/*
 * Storing integers into an array 
 * @author Hector Padilla
 * @date December 5 2019
 */



import java.util.Scanner;

//TODO: document this class
public class PA7a {

	/**
	 * Reads all values from the provided scanner into the supplied array (up to its
	 * size) and returns the number of integers read
	 * 
	 * @param input input source
	 * @param nums  destination for read integers
	 * @return number of integers read
	 */
	public static int readIntoArray(Scanner input, int[] nums) {
		int result = 0;

		for (int i = 0; input.hasNextInt() && i < nums.length; i++) {
			nums[i] = input.nextInt();
			result++;
		}

		return result;

	}

	/**
	 * Prints to the screen the average of the supplied array, up to the supplied
	 * size, and all integers in the array, again up to the supplied size, that are
	 * larger than the average
	 * 
	 * @param nums array of numbers
	 * @param size number of valid elements
	 */
	public static void printAboveAverage(int[] nums, int size) {
		double sum = 0.00;

		for (int i = 0; i < size; i++) {
			sum += nums[i];
		}

		double average = sum / size;

		if (size == 0) {
			System.out.printf("Average: 0.00%n");
			System.out.printf("Values above average: none%n");
		} else if ((average == size) || (average < 0)) {
			System.out.printf("Average: %.2f%n", average);
			System.out.printf("Values above average: none%n");
		} else if (average > 0) {
			System.out.printf("Average: %.2f%n", average);
			System.out.printf("Values above average:");
			int counter = 0;
			for (int i = 0; i < nums.length; i++) {
				int over = nums[i];
				if (nums[i] > average) {
					if (counter >= 1) {
						System.out.print(",");
					}
					System.out.printf(" nums[%d]=%d", i, over);
					counter = counter + 1;
				}
			}
			System.out.printf("%n");
		} else {
			average = 0;
			System.out.printf("Average: %.2f%n", average);
			System.out.printf("Values above average: none%n");

		}

	}

	/**
	 * Program execution point: input a sequence of integers (up to 100), output
	 * average of integers and those over the average
	 * 
	 * @param args command-line arguments (ignored)
	 */
	public static void main(String[] args) {

		int[] arrayFromInput = new int[100];
		System.out.print("Enter up to 100 integers: ");
		Scanner scnr = new Scanner(System.in);

		int readItems = readIntoArray(scnr, arrayFromInput);

		printAboveAverage(arrayFromInput, readItems);

	}

}
