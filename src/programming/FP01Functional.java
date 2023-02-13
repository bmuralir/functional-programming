package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		printAllNumbersInListFunctional(List.of(12,9,13,22,5,3,67,32,25,15));

	}

	private static void print(int number) {
		System.out.println(number);
	}
	
	private static boolean isOdd(int number) {
		return number % 2 != 0;
	}
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		 
		/*
		 * for(int i : numbers) { System.out.println(i); }
		 */
	
		/*
		 * numbers.stream() .forEach(FP01Functional::print);
		 */
		
		numbers.stream()
			.filter(number -> number%2 !=0)
			.forEach(System.out::println);
		
		//.filter(FP01Functional::isOdd)
	}

}
