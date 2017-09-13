package youDoIt;

import java.util.Scanner;

public class page84 {
	public static void main(String[] args) {
		int anInt;
		byte aByte;
		short aShort;
		long aLong;
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your name>>");
		name = input.nextLine();
		System.out.print("Please enter a intiger");
		anInt = input.nextInt();
		System.out.print("Please enter a Byte");
		aByte = input.nextByte();
		System.out.print("Please enter a Short");
		aShort = input.nextShort();
		System.out.print("Please enter a Long");
		aLong = input.nextLong();
	}
}
