package longestSubsequence;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		FindLongestIncreasingSubsequence findLongestIncreasingSubsequence = new FindLongestIncreasingSubsequence();
		
		Integer[] result = findLongestIncreasingSubsequence.getLongestIncreasingSubsequence();
		System.out.print("Winning sequence is: ");
		for(Integer i : result) {
			System.out.print(i + " ");
		}
	}
	
	
}
