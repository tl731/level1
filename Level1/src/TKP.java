//import Tea
import java.util.Random;
import javax.swing.JOptionPane;
import org.teachingextensions.logo.Tortoise;

public class TKP {
	public static void main(String [ ] args)
	{
		Tortoise.show(); 
		
		// 1. Make a variable that will hold a random number
		// 2. Put a random number into this variable using "new Random().nextInt(4)"
        int randomnumber = new Random().nextInt(4);
        
		// 3. Print out this variable
        System.out.println("Random Number" + randomnumber);
        System.out.println("test"); 
        
		// 4. Get the user to enter a question for the 8 ball
        String a = JOptionPane.showInputDialog("Ask the magic 8 ball your heart's desire"); 
        if (a == "red"){
        	JOptionPane.showMessageDialog(null, "hi");
        }
		// 5. If the random number is 0

		// -- tell the user "Yes"

		// 6. If the random number is 1

		// -- tell the user "No"

		// 7. If the random number is 2

		// -- tell the user "Maybe?"

		// 8. If the random number is 3

		// -- write your own answer

	}

	public class Magic8Ball {


	}



}
