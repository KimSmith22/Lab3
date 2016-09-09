package gcLabs3;

import java.util.Scanner;

public class Lab3Powers {
	
	private static Scanner k;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		int number;
		int squared;
		int cubed;
		
		String choice;
		choice = "yes";
		
		//sysout and user prompts
		System.out.println("Learn your squares and cubes!");
		System.out.println();
		
		System.out.println("Enter an integer:");
		k = new Scanner(System.in);
		number = k.nextInt();
		
		do{
			System.out.println("     ");
			
		}while (choice.equals("y"));
		
	}

}
