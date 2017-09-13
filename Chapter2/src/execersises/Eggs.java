package execersises;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		final double individualEggs = 0.45;
		final double dozenEggs = 3.25;
		
		double eggsTotal;
		double dozens;
		double looseEggs;
		double totalPrice;
		double dozensPrice;
		double TotalRamainingPrice;
		
		Scanner input = new Scanner(System.in);
		
			System.out.println("Input amout of eggs to purchase >>");
			eggsTotal = input.nextDouble();
			dozens = (eggsTotal / 12);
			looseEggs =(eggsTotal % dozens);
			dozensPrice = dozenEggs * dozens;
			TotalRamainingPrice = looseEggs / individualEggs;
			totalPrice = TotalRamainingPrice + dozensPrice;
			System.out.println("you ordered " + eggsTotal + " eggs. That is " + dozens + " at 3.25 per dozen and " + looseEggs + " individuals at 45 cents each for a total of $"+ totalPrice );
			
	}

}
