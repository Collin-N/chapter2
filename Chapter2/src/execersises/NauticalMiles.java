package execersises;

public class NauticalMiles {

	public static void main(String[] args) {
		final double nauticalMilesToKilometers = 1.852;
		final double nauticalMilesToMiles = 1.150779;
		
		double miles;
		double kilometers;
		double nauticalMiles = 15;
		
		miles = nauticalMiles * nauticalMilesToMiles;
		kilometers = nauticalMiles * nauticalMilesToKilometers;
		
		
		System.out.println(nauticalMiles + " nautical Miles in Kilometers is " + kilometers + " and in miles it is " + miles);
		
	}

}
