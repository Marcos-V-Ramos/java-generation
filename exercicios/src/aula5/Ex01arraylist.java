package aula5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01arraylist {

	public static void main(String[] args) {
		
		final Scanner input = new Scanner(System.in);
		
		int counter = 0;
		List<String> colors = new ArrayList<String>();
		
		while(counter < 5) {
			System.out.print("Please, insert a color: ");
			colors.add(input.next().toUpperCase());
			counter++;
		}
		input.close();
		
		System.out.println("\nAll colors inserted: ");
		for (var color : colors) {
			System.out.print(color + "\t");
		}
		
		System.out.println("\nAll colors sorted: ");
		colors.sort(null);
		for (String color : colors) {
			System.out.print(color + "\t");
		}
	}
}
