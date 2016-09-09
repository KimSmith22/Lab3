package gcLabs3;

import java.util.Scanner;

public class Lab3Powers {
	
	private static Scanner k;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		int number = 0;
		double square = Math.pow(number,2);
		
		String choice;
		choice = "y";
		
		//sysout and user prompts
		System.out.println("Learn your squares and cubes!");
		System.out.println();
		
		do{
			
		System.out.println("Enter an integer between 1 and 50:");
		k = new Scanner(System.in);
		number = k.nextInt();
		
			System.out.println(" NUMBER        " + " SQUARED       " + " CUBED " );
			System.out.println("========       " + "=========      " + "=======");
		
			for(int i = 1; i <=number; i++){
			System.out.println("  "+(i) +"             "+(i)+ "         "+(i));//changed for testing purposes with modified formulas in loop
			}
			System.out.println();
			System.out.println("Continue? y/n: ");
			k.nextLine();
			
			choice = k.nextLine();
		}while (choice.equals("y"));
		
	}

}
