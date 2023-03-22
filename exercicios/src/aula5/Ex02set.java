package aula5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex02set {
	public static void main (String[] args) {
		
		final Set<Integer> numbers = new HashSet<Integer>(Set.of(10, 22, 8, 5, 14, 23, 31, 33, 11, 1));
		final Scanner input = new Scanner(System.in);
		
		int searchedNumber = 0;
		System.out.println("Please, insert the number you are looking for: ");
		searchedNumber = input.nextInt();
		
		
		if (!numbers.contains(searchedNumber)) {
			System.out.println("Can not find the number!");
			return;
		}
		
		System.out.println("The number " + searchedNumber + "has been found." );
	}
}
