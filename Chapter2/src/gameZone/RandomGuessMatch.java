package gameZone;

import java.util.Scanner;

public class RandomGuessMatch {

	public static void main(String[] args) {
		int random;
		int answer;
		int difference;
		boolean correct;
		
		Scanner guess = new Scanner(System.in);
		
		System.out.println("input guess between 1 and 5 >>>");
		answer = guess.nextInt();
		random = 1 + (int)(Math.random() * 5);
		if(answer == random) {
			
			correct = true;
			
			System.out.println("your answer is " + correct + " the number was " + random);
		}
		else {
			correct = false;
		    difference = random % answer; 
			System.out.println("your answer is " + correct + " the real answer was " + random + " The diffence between your answer and the correct guess is " + difference);
		}
		
	}

}
