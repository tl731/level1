

import java.util.Random;
import javax.swing.JOptionPane;


// Copyright Wintriss Technical Schools 2013
public class HighLow{

	public static void main(String[] args) {
		// 2. Randomly select a number between 1 - 100. Print it out to test.
		Random rand = new Random();
		int  n = rand.nextInt(100);
		
		// 10. do the following 10 times
		
			// 1. ask for a guess using a pop-up window , and save it 
			String a = JOptionPane.showInputDialog("Guess a number between 1 - 100");
		
			// 3. convert the usersÕ answer to an int
			int answer = Integer.parseInt(a);
			
			// 4. if the guess is correct
			if (answer == n){
				JOptionPane.showMessageDialog(null, "You win");
			}
			// 5. win
			// 6. if the guess is high
			else if(answer > n){
				JOptionPane.showMessageDialog(null, "Too high" + n);				
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Too low" + n);
			}
				// 7. tell them it's too high
			
			// 8. if the guess is low
				// 9. tell them it's too low

		// 11. lose
	}

}
