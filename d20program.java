package sideprojects;

import java.util.Scanner;

public class d20program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner (System.in)) {
			
			System.out.println("*********** d20 Program ***********");
			System.out.println("********** ROLL YOUR FATE *********");
			System.out.println(" ");
			System.out.print("Enter your name, Mortal: ");
			String name = sc.nextLine();
			System.out.println(" ");
			
			double diceRoll20 = Math.floor(Math.random()* 20) + 1;
			int intValue20 = (int)diceRoll20;
			
			switch (intValue20) {
			case 20:
				System.out.println(name + " has struck a Crtitcal Hit! Well done, Champion!");
				break;
			case 1:
				System.out.println("Lady Fortuna has turned her back on " + name + "... Critical Fail!");
				break;
			default:
				System.out.println(name + " has rolled " + intValue20 + ".");
			}
		}	
	}
}

