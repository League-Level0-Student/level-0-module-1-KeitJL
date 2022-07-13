package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer1 = JOptionPane.showInputDialog(null, "Who makes it, has no need of it. Who buys it, has no use for it. Who uses it can neither see nor feel it. What is it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer1.equalsIgnoreCase("coffin")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score = score +1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong, the correct answer is 'coffin'");
}
		// 6. Add some more riddles
String answer2 = JOptionPane.showInputDialog(null, "What can travel around the world while staying in a corner?");
if (answer2.equalsIgnoreCase("stamp")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score = score +1;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong, the correct answer is 'stamp'");
}
String answer3 = JOptionPane.showInputDialog(null, "What has many keys but can't open a single lock? ");
if (answer3.equalsIgnoreCase("piano")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score = score +1;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong, the correct answer is 'piano'");
	
}
// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your Score is " + score+ " out of 3!");
	}
}

