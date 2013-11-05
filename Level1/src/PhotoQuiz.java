

	// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

	public class PhotoQuiz {

		public static void main(String[] args) throws Exception {
			Frame quizWindow = new Frame();
			quizWindow.setVisible(true);
			
			int score = 0;

			// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select ÒCopy Image URLÓ)
			// 2. create a variable of type "Component" that will hold your image
			
			String imageUrl = "/Users/jiedge/Desktop/grumpycat.jpg";
			Component c1 = createImage(imageUrl);
			
			// 3. use the "createImage()" method below to initialize your Component
			
			// 4. add the image to the quiz window
			quizWindow.add(c1); 
			// 5. call the pack() method on the quiz window
			quizWindow.pack();
			
			// 6. ask a question that relates to the image
			String a = JOptionPane.showInputDialog("What do you see?");
			
			
			// 7. print "CORRECT" if the user gave the right answer
			if (a.equalsIgnoreCase("grumpy cat")){
				JOptionPane.showMessageDialog(null, "CORRECT");
				score++;
			}
			else{

				JOptionPane.showMessageDialog(null, "INCORRECT");
				score--;
			}
			// 8. print "INCORRECT" if the answer is wrong

			// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
			quizWindow.remove(c1);
			// 10. find another image and create it
			String imageUrl2 = "/Users/jiedge/Desktop/lindsay1.jpg";
			Component c2 = createImage(imageUrl2);
			
			// 11. add the second image to the quiz window
			quizWindow.add(c2);
			// 12. pack the quiz window
			quizWindow.pack();
			// 13. ask another question
			String b = JOptionPane.showInputDialog("What do you see?");
			
			
			// 7. print "CORRECT" if the user gave the right answer
			if (b.equalsIgnoreCase("lindsay")){
				JOptionPane.showMessageDialog(null, "CORRECT");
				score++;
			}
			else{

				JOptionPane.showMessageDialog(null, "INCORRECT");
				score--;
			}
			JOptionPane.showMessageDialog(null, "Your score is "+ score);
			// 14+ check answer, say if correct or incorrect, etc.

		}

		/*
		private static Component createImage(String imageUrl) throws MalformedURLException {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			return imageLabel;
		}*/
		
		private static Component createImage(String imageUrl) throws MalformedURLException {
			//URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(imageUrl);
			JLabel imageLabel = new JLabel(icon);
			return imageLabel;
		}
		/* OPTIONAL */
		// *14. add scoring to your quiz
		
		// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
		
	}




	

