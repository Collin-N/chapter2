package execersises;

import java.util.Scanner;

public class InchesToFeetInteractive {
	public static void main(String[] args)
	{    final int inchesToFeet = 12;
	
	
		int Inches;
		int feet;
		int remainingInches;
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Enter in Inches >>>");
			Inches = input.nextInt();
			feet = Inches / inchesToFeet;
			remainingInches = Inches % inchesToFeet;
			
			System.out.println(Inches + " inches is " + feet + " Feet and " + remainingInches + " inches" );
			
			
	}		
}
