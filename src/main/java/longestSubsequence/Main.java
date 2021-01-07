package longestSubsequence;

import java.util.*;

public class Main {

	private static List<Integer> listOfNumbers = new ArrayList<>();

	public static void main(String[] args) {
		
		// to add numbers to the list
		addNumbersToList();

		// printing the list of numbers to visually check
		printListOfNumbers();

		// to create an instance of FindLongestIncreasingSubsequence
		FindLongestIncreasingSubsequence findLongestIncreasingSubsequence = new FindLongestIncreasingSubsequence();

		// to retrieve the longest consecutive increasing subsequence
		Integer[] result = findLongestIncreasingSubsequence.getLongestIncreasingSubsequence(listOfNumbers);

		// to print out the longest increasing subsequence
		printWinningSequence(result);

	}

	public static void addNumbersToList() {
		// to add between 10 - 20 integers into the array
		for (int i = 0; i < new Random().nextInt(10) + 10; i++) {
			// to add a random integer between 0 and 100
			listOfNumbers.add(new Random().nextInt(100));
		}
	}

	public static void printListOfNumbers() {
		System.out.print("The list of numbers is: ");
		for (Integer number : listOfNumbers) {
			System.out.print(number + " ");
		}
		System.out.println("\n");
	}

	public static void printWinningSequence(Integer[] result) {
		System.out.print("Winning sequence is: ");
		for (Integer i : result) {
			System.out.print(i + " ");
		}
	}

}
