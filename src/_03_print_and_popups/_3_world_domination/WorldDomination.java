package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String x = JOptionPane.showInputDialog("Do you know how to write code? ");
		// 2. If they say "yes", tell them they will rule the world.
		String prompt = "";
		if (x.equals("yes")) {
			prompt =  "You will rule the world. ";
			
		}
		else {
			prompt = "You should sign up for classes at The League. ";
		}
		
		// 3. Otherwise, tell them to sign up for classes at The League.
		JOptionPane.showMessageDialog(null,prompt);
	}
}

