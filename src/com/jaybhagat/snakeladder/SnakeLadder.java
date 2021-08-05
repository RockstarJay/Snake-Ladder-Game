package com.jaybhagat.snakeladder;

/*
 * class to initialize the game with start position zero
 * using random to dice roll to get a number from 1 to 6
 * using switch case to determine players move
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class SnakeLadder {

	public static void main(String[] args) {
		int startPosition = 0;                                           // initialize startPosition to zero
		System.out.print("Enter Your Name : ");
		Scanner scanner = new Scanner(System.in);
		String playerName = scanner.next();
		scanner.close();
		
		int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);    // it will generate 1 to 6 number randomly
		System.out.println("Dice Roll Number : "+ dieRoll);
		
		/*
		 * using random function to create three random numbers 0, 1 and 2
		 * assign them to No Play, Ladder and Snake respectively by using switch case
		 * if No Play, Player remains at his last position
		 * if Ladder, Player moves forward with dice roll number
		 * if Snake, Player moves backward with dice roll number
		 * at last print the Players position
		 */
		
		int checkOption = (int) (Math.floor(Math.random() * 10) % 3);
		switch (checkOption) {
			case 0:
				System.out.println("No Play");
				startPosition += 0;
				break;
			case 1:
				System.out.println("Ladder");
				startPosition += dieRoll;
				break;
			default:
				System.out.println("Snake");
				startPosition -= dieRoll;
				if (startPosition < 0)
					startPosition = 0;
		}
		System.out.println("Player "+playerName+ " On Postion : " +startPosition);
	}
}