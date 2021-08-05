package com.jaybhagat.snakeladder;

/*
 * class for a single player Snake and Ladder Game
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class SnakeLadder {
	public static final int WINNING_POSITION = 100;                         // constant

	public static void main(String[] args) {
		int startPosition = 0;                                           // initialize startPosition to zero
		System.out.print("Enter Your Name : ");
		Scanner scanner = new Scanner(System.in);
		String playerName = scanner.next();
		scanner.close();
		
		/*
		 * while loop to check if player reached winning position 
		 * using random function to dice roll to get a number from 1 to 6
		 * using random function to create three random numbers 0, 1 and 2
		 * assign them to No Play, Ladder and Snake respectively by using switch case
		 * if No Play, Player remains at his last position
		 * if Ladder, Player moves forward with dice roll number
		 * if Snake, Player moves backward with dice roll number
		 * Player will start again if start position is negative or zero
		 * the variable needToWin will make sure not finish game till player reaches at exact position 100 
		 * at last print the Players position and winning message
		 */
		
		while (WINNING_POSITION > startPosition) {
			int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			int needToWin = WINNING_POSITION - startPosition;
			System.out.println("Dice Roll Number : "+ dieRoll);
			
			int checkOption = (int) (Math.floor(Math.random() * 10) % 3);
			if (needToWin >= dieRoll) {
				switch (checkOption) {
					case 0:
						System.out.println("No Play");
						startPosition += 0;
						break;
					case 1:
						System.out.println("Ladder :"+ " + " +dieRoll);
						startPosition += dieRoll;
						break;
					default:
						System.out.println("Snake :"+ " - " +dieRoll);
						startPosition -= dieRoll;
						if (startPosition < 0) {
							System.out.println("Starting Again...");
							startPosition = 0;
						}
				}
			}
		}
		System.out.println("Player "+playerName+ " Reached The Winning Postion : " +startPosition);
		System.out.println(playerName + " Wins The Game");
	}
}