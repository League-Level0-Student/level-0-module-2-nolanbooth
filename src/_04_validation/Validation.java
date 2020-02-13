//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		for (int i = 0; i < 50.; i++) {
			
		
		Random randomMaker = new Random();

		int randomNumber = randomMaker.nextInt(5);

		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		// 2. Repeat all the code above 10 times
		if (randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "You are a good person.");
		}
		if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "You are nice.");
		}
		if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "You are good at certain things.");
		}
		if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "I don't know what to say, so you are nice, I guess.");
		}
		if (randomNumber == 4) {
			JOptionPane.showMessageDialog(null, "I am running out of things to say, so you are... Um... I don't know.");
		}}
		// 3. Find someone to test out your program. They will like it >:(
	}
}
