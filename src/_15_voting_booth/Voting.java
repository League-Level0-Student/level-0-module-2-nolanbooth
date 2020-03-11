package _15_voting_booth;

import javax.swing.JOptionPane;

public class Voting {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog(null, "How old are you? Please put your age in years!");
		int num = Integer.parseInt(answer);
		if (num >= 18) {
			JOptionPane.showMessageDialog(null,
					"Congratulations! You are old enough to vote!");
		} else {
			JOptionPane.showMessageDialog(null, " You are to young to vote.");
		}
}}
