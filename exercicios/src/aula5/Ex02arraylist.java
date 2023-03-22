package aula5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02arraylist {
	public static void main (String[] args) {
		
		final List<Integer> numbers = new ArrayList<Integer>(List.of(10, 22, 8, 5, 14, 23, 31, 33, 11, 1));
		final Scanner input = new Scanner(System.in);
		
		int searchedNumber = 0;
		System.out.println("Please, insert the number you are looking for: ");
		searchedNumber = input.nextInt();
		
		
		if (numbers.indexOf(searchedNumber) == -1) {
			System.out.println("Can not find the number!");
			return;
		}
		
		System.out.println("The number " + searchedNumber + " is at the " + numbers.indexOf(searchedNumber) + "º position.");
	}
}
