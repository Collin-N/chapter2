package execersises;

import java.util.Scanner;

public class NauticalMilesInteractive {

	public static void main(String[] args) {
		final double nauticalMilesToKilometers = 1.852;
		final double nauticalMilesToMiles = 1.150779;
		
		double miles;
		double kilometers;
		double nauticalMiles;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter amount of nautical miles >>>");
		nauticalMiles =input.nextDouble();
		miles = nauticalMiles * nauticalMilesToMiles;
		kilometers = nauticalMiles * nauticalMilesToKilometers;
		
		System.out.println(nauticalMiles + " nautical Miles in Kilometers is " + kilometers + " and in miles it is " + miles);
	}

}
