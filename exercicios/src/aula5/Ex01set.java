package aula5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex01set {

	public static void main (String[] args) {
		
		final Set<Integer> numbers = new HashSet<Integer>();
		final Scanner input = new Scanner(System.in);
		int counter = 0;
		
		while (counter < 10) {
			System.out.println("Please insert a number (do not insert a repeated one!): ");
			numbers.add(input.nextInt());
			counter++;
		}
		
		input.close();
		
		System.out.println("Using the Iterator pattern to print the numbers: ");
		
		Iterator<Integer> iSetNumbers = numbers.iterator();
		
		while(iSetNumbers.hasNext()) {
			System.out.println(iSetNumbers.next());
		}
	}
}
