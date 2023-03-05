package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		int score = 0;
		// Create a variable to hold the user's score. Set it equal to zero. 
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		String x = JOptionPane.showInputDialog("1 + 1 = ");
		if (x.equals("2")) {
			score++;
		}
		else {
			score--;
		}
		x = JOptionPane.showInputDialog("123 - 123 = ");
		if (x.equals("0")) {
			score++;
		}
		else {
			score--;
		}
		x = JOptionPane.showInputDialog("6 * 9 = ");
		if (x.equals("54")) {
			score++;
		}
		else {
			score--;
		}
		JOptionPane.showMessageDialog(null,"Your score was " + score + ".");
		// After all the questions have been asked, tell the user their final score 
		
	}
}
