package gcLabs3;

import java.util.Scanner;

public class Lab3Powers {
	
	private static Scanner k;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		int number;
		
		
		String choice;
		choice = "yes";
		
		//sysout and user prompts
		System.out.println("Learn your squares and cubes!");
		System.out.println();
		
		System.out.println("Enter an integer between 1 and 50:");
		k = new Scanner(System.in);
		number = k.nextInt();
		
		do{
			System.out.println(" NUMBER        " + " SQUARED       " + " CUBED " );
			System.out.println("========       " + "=========      " + "=======");
			for(int i = 0; i <= 50; i++);
			System.out.println("  "+(number) +"                 "+(number * number)+ "            "+(number * number * number));

		}while (choice.equals("y"));
		
	}

}
