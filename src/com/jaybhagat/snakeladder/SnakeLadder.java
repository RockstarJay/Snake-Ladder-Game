package com.jaybhagat.snakeladder;

/*
 * class to initialize the game with start position zero
 * using random to dice roll to get a number from 1 to 6
 * @author com.jaybhagat
 */

public class SnakeLadder {

	public static void main(String[] args) {
		int startPosition = 0;                                           // initialize startPosition to zero
		int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);    // it will generate 1 to 6 number randomly
		System.out.println("Dice Roll Number : "+ dieRoll);
	}
}