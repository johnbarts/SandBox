package sideprojects;

import java.util.Scanner;

public class diceProgram {

	public static void main(String[] args) {
		
			System.out.println("********** Dice Program **********");
			System.out.println("********* ROLL YOUR FATE *********");
			System.out.println(" ");
			System.out.println("DICE SELECTION:\n1) d20 \n2) d4 \n3) d6 \n4) d12 \n5) d8 \n6) d10 \n7) d100");
			System.out.print("\nSelect your dice here: ");
			@SuppressWarnings("resource")
			int selection = new Scanner (System.in).nextInt();
			System.out.println(" ");
			
			if (selection > 7 || selection <= 0) {
				System.out.println("\nPlease enter a vaild selection.");
				} else {
					menuSelect(selection);
				}
	
	
	}
	
	public static void menuSelect(int num) {
		
		System.out.print("Enter your name, adventurer: ");
		@SuppressWarnings("resource")
		String name = new Scanner (System.in).nextLine();
		
		int selection = num;
		
		if (selection == 1 && name.length() > 0) {
			System.out.println("\n" + d20Program(name)); 
		} else if (selection == 2 && name.length() > 0) {
			System.out.println("\n" + d4Program(name));
		} else if (selection == 3 && name.length() > 0) {
			System.out.println("\n" + d6Program(name));
		} else if (selection == 4 && name.length() > 0) {
			System.out.println("\n" + d12Program(name));
		} else if (selection == 5 && name.length() > 0) {
			System.out.println("\n" + d8Program(name));
		} else if (selection == 6 && name.length() > 0) {
			System.out.println("\n" + d10Program(name));
		} else if (selection == 7 && name.length() > 0) {
			System.out.println("\n" + d100Program(name));	
		} else {
			System.out.println("\nYou must enter a name.");
		}
	}
	
	public static String d20Program(String str) {
	
		double diceRoll20 = Math.floor(Math.random()* 20) + 1;
		int intValue20 = (int)diceRoll20;
		String result = "";
		
		switch (intValue20) {
		case 20:
			result = str + " has struck a Crtitcal Hit! Well done, Champion!";
			break;
		case 1:
			result = "Lady Fortuna has turned her back on " + str + "... Critical Fail!";
			break;
		default:
			result = str + " has rolled " + intValue20 + ".";
		} 
		return result;
	}

	public static String d4Program(String str) {
		
		double diceRoll4 = Math.floor(Math.random()* 4) + 1;
		int intValue4 = (int)diceRoll4;
		String result = str + " has rolled " + intValue4 + ".";
		return result;
	}
	
	public static String d6Program(String str) {
		
		double diceRoll6 = Math.floor(Math.random()* 6) + 1;
		int intValue6 = (int)diceRoll6;
		String result = str + " has rolled " + intValue6 + ".";
		return result;
	}

	public static String d12Program(String str) {
		
		double diceRoll12 = Math.floor(Math.random()* 12) + 1;
		int intValue12 = (int)diceRoll12;
		String result = str + " has rolled " + intValue12 + ".";
		return result;
	}
	
	public static String d8Program(String str) {
		
		double diceRoll8 = Math.floor(Math.random()* 8) + 1;
		int intValue8 = (int)diceRoll8;
		String result = str + " has rolled " + intValue8 + ".";
		return result;
	}
	
	public static String d10Program(String str) {
		
		double diceRoll10 = Math.floor(Math.random()* 10) + 1;
		int intValue10 = (int)diceRoll10;
		String result = str + " has rolled " + intValue10 + ".";
		return result;
	}
	
	public static String d100Program(String str) {
		
		double diceRoll100 = Math.floor(Math.random()* 100) + 1;
		int intValue100 = (int)diceRoll100;
		String result = str + " has rolled " + intValue100 + ".";
		return result;
	}


}


