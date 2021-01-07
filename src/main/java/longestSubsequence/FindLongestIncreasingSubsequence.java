package longestSubsequence;

import java.util.*;

public class FindLongestIncreasingSubsequence {

	public Integer[] getLongestIncreasingSubsequence(List<Integer> numbers) {

		// sequences we find
		List<Integer[]> sequences = new ArrayList<>();
		
		// our method of recursion
		// helps to keep track of what we've seen previously
		Stack<Integer> entries = new Stack<>();

		// step through numbers
		for(int i = 0; i < numbers.size(); i++) {
			Integer entry = numbers.get(i);

			// add the first entry
			if (entries.empty()) {
				entries.push(entry);
				continue;
			}

			// previous number
			Integer previous = entries.peek();

			// if our number is higher than the previous - add it to our stack
			if ( previous < entry) {
				entries.push(entry);
			}

			// if the number is decreasing
			// or if we are at the end
			// capture the sequence
			 boolean atTheEnd = (i == numbers.size() - 1);
			if (previous >= entry || atTheEnd) {

				// capture the elements we found
				sequences.add(toArray(entries));

				// starting over
				entries.push(entry);
			}
		} // closing of for loop
		

		return longest(sequences);
	}
	
	public Integer[] longest(List<Integer[]> candidates) {
		TreeMap<Integer, Integer[]> byLength = new TreeMap<>(); 
		for(Integer[] candidate: candidates) {
			byLength.put(candidate.length, candidate);
		}
		return byLength.lastEntry().getValue();
	}

	private Integer[] toArray(Stack<Integer> entries) {
		Integer[] sequence = new Integer[entries.size()];
		int idx = entries.size()-1;
		Integer sequenceEntry = entries.pop();
		while (sequenceEntry != null) {
			sequence[idx] = sequenceEntry;
			try {
				sequenceEntry = entries.pop();
			} catch (EmptyStackException e) {
				break;
			}
			idx--;
		}
		return sequence;
	}

}
