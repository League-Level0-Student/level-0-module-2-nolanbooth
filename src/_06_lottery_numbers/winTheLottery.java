package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class winTheLottery {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"the winning lottery number are out! The winning numbers are... (look at the 'syso print' place");
		for (int i = 0; i < 6.; i++) {

			Random randomLotteryNumbers = new Random();
			int randomNumber = randomLotteryNumbers.nextInt(100);
			System.out.println(randomNumber);
		}
		JOptionPane.showMessageDialog(null, "[Villager #4] I'd like to see who wins that");
		JOptionPane.showMessageDialog(null,
				"[Random Villager] OH MY GOD, I won! I won! [sing songy voice] I won, I won, I won");
		JOptionPane.showMessageDialog(null, "[Villager #4] Somebody get him out!");
		JOptionPane.showMessageDialog(null,
				"[Security villager with stick] Get Out! [Pokes winning Villager with stick]");
		JOptionPane.showMessageDialog(null, "[Winning Villager] Oh, okay I'm going...");
	}
}
