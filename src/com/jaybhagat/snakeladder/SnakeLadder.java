package com.jaybhagat.snakeladder;

/*
 * class for a two player Snake and Ladder Game
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class SnakeLadder {
	public static final int WINNING_POSITION = 100;                         // constant

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter The Name of First Player : ");          // get the name for first player
	        String firstPlayerName = scanner.next();
	        System.out.print("Enter The Name of Second Player : ");         // get the name for second player
	        String secondPlayerName = scanner.next();
	        scanner.close();
	        int player1Position = 0;
	        int player2Position = 0;

	        while (player1Position <= WINNING_POSITION && player2Position <= WINNING_POSITION) {
	            if (player1Position == WINNING_POSITION) {
	                System.out.println(firstPlayerName + " Won The Game");
	                break;
	            } else if (player2Position == WINNING_POSITION) {
	                System.out.println(secondPlayerName + " Won The Game");
	                break;
	            } else {
	                player1Position = getFirstPlayer(player1Position, firstPlayerName);
	                player2Position = getSecondPlayer(player2Position, secondPlayerName);
	            }
	        }
	    }
		
		/*
		 * two functions for two players
		 * while loop to check if player reached winning position 
		 * using random function to dice roll to get a number from 1 to 6
		 * using random function to create three random numbers 0, 1 and 2
		 * assign them to No Play, Ladder and Snake respectively by using switch case
		 * Player will start again if start position is negative or zero
		 * the variable needToWin will make sure not finish game till player reaches at exact position 100 Jay
		 * the player current position will be printed at every move 
		 * at last print the Players position and winning message
		 */
		
	 private static int getFirstPlayer(int firstPlayerPosition, String firstPlayerName) {
	        int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
	        int needToWin = WINNING_POSITION - firstPlayerPosition;
	        int checkOption  = (int) (Math.floor(Math.random() * 10) % 3);
	        if (needToWin >= dieRoll) {
	            switch (checkOption ) {
	                case 0:
	                    break;
	                case 1:
	                    firstPlayerPosition += dieRoll;
	                    if (firstPlayerPosition == WINNING_POSITION)
	                        break;
	                    else
	                        getFirstPlayer(firstPlayerPosition, firstPlayerName);
	                    break;
	                default:
	                    firstPlayerPosition -= dieRoll;
	                    if (firstPlayerPosition < 0)
	                        firstPlayerPosition = 0;
	            }
	            System.out.println(firstPlayerName + "'s Position is: " + firstPlayerPosition);
	        }
	        return firstPlayerPosition;
	    }
	 
	 private static int getSecondPlayer(int secondPlayerPosition, String secondPlayerName) {
	        int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
	        int needToWin = WINNING_POSITION - secondPlayerPosition;
	        int checkOption  = (int) (Math.floor(Math.random() * 10) % 3);
	        if (needToWin >= dieRoll) {
	            switch (checkOption ) {
	                case 0:
	                    break;
	                case 1:
	                    secondPlayerPosition += dieRoll;
	                    if (secondPlayerPosition == WINNING_POSITION)
	                        break;
	                    else
	                        getSecondPlayer(secondPlayerPosition, secondPlayerName);
	                    break;
	                default:
	                    secondPlayerPosition -= dieRoll;
	                    if (secondPlayerPosition < 0)
	                        secondPlayerPosition = 0;
	            }
	        }
	        System.out.println(secondPlayerName + "'s Position is: " + secondPlayerPosition);
	        return secondPlayerPosition;
	    }
}