package execersises;

public class QuartsToGallons {

	public static void main(String[] args) {
		 final int	quartsToGallons = 4;
		
		int gallons;
		int quarts = 22;
		int remainingQuarts;
		
		gallons = quarts / quartsToGallons;
		remainingQuarts = quarts % quartsToGallons;	
			
			
		System.out.print(gallons);
		System.out.print(remainingQuarts);
	}

}
