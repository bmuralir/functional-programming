package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		printAllNumbersInListStructured(List.of(12,9,13,22,5,3,67,32,25,15));

	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		 
		for(int i : numbers) {
			System.out.println(i);
		}
	}

}
