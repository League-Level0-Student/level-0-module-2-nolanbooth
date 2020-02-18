//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		Random randomThing = new Random();
		for (int i = 0; i < 10.; i++) {

			int randomNumber = randomThing.nextInt(4);
			// 2. Make a variable that will hold a random number and put a random number
			// into this variable using "new Random().nextInt(4)"
			// 3. Print out this variable
			// 4. Get the user to enter a question for the 8 ball

			JOptionPane.showInputDialog(null,
					"Put 10 questions into the 'magic' 8 Ball. If you put in the question quickly, you won't have to wait so long!");
			// 5. If the random number is 0
			if (randomNumber == 0) {
				JOptionPane.showMessageDialog(null, "Yes.");
			}
			if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "No.");
			}
			if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "Maybe you should ask Google?.");
			}
			if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "Ask again later (never).");
			}
		}
	}
}
