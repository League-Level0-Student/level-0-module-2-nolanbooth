package _14_rollercoaster;

import javax.swing.JOptionPane;

public class roller_coaster {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog(null, "How tall are you? Please put your height in inches!");
		int num = Integer.parseInt(answer);
		if (num >= 48) {
			JOptionPane.showMessageDialog(null,
					"Congratulations! You are tall enough to ride the Roller Coaster!!! Have a good ride and"
							+ "don't forget to buckle your seatbelt!");
		} else {
			JOptionPane.showMessageDialog(null,
					"Sorry! You are not tall enough to ridew the Roller Coaster! You can come back when "
							+ "you are at least 48 inches tall. See you later!");
		}
	}
}
