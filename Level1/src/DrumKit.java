//package org.teachingextensions.logo;


// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

    JLabel drumImage; //member variable
    private static int statictest = 0; 
    JPanel j = new JPanel(); 

    public static void main(String[] args) throws Exception {
   	 
     new DrumKit().getGoing(); //1 breaking out of static context
     DrumKit.statictest = 1; //2 static 
    
   	 DrumKit d = new DrumKit(); // 3 not static
   	 d.getGoing(); //4  
   	 // 1 = 3 + 4
    }
   
    private void getGoing() throws MalformedURLException {
   	 // 1. Make a JFrame variable and initialize it using "new JFrame()"
   	 JFrame jframevar = new JFrame(); //local variable
    	
   	 // 2. Make the frame visible
   	 jframevar.setVisible(true);
   	 
   	 // 3. Set the size of the frame
   	 jframevar.setSize(100, 100);
   	 
   	 // 4. Set the title of the frame
   	 jframevar.setTitle("happy monday");
   	 

   	 // 5. Make a JPanel and initialize it.
   	 JPanel jpanelvar = new JPanel();
   	 jpanelvar.setVisible(true);
   	 
   	 // 6. Add the panel to the frame. (The panel is invisible.)
   	 jframevar.add(jpanelvar);

   	// 7. Download an image of a drum from the Internet. Drop it into your Eclipse project under "default package". 
    
    // 8. Put the name of your image in a String variable.
    String grumpycat = "grumpycat1.jpg";
    
   	 // 9. Use the "createImage()" method to initialize the drumImage variable.
    
    //drumImage.add(createImage("grumpycat1.jpg")); 
  	drumImage = createImage(grumpycat);
    System.out.println("here");
  	 
    System.out.println("drumImage here" + drumImage);
    
   	 // 10. Add the image to the panel
    jpanelvar.add(drumImage);
    
   	 // 11. Set the layout of the panel to "new GridLayout()"
   	 // 12. call the pack() method on the frame
   	jpanelvar.setLayout(new GridLayout()); 
   	jframevar.pack();
    
   	 // 13. add a mouse listener to your drumImage.
   	drumImage.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
   	 // 14. When the mouse is clicked, print "mouse clicked"

   	 JLabel drumClicked = (JLabel) e.getSource();
   	 // 15. Download a drum sound from freesound.org and drop it into your "default package"
   	 
   	 // 16. If they clicked on the drumImage...
   	 if(drumClicked == drumImage){
   		 System.out.println("drum here");
   	 }
   		 // 17. ...use the playSound method to play a drum sound.

   	 // 18. Add more images to make a drumkit. Remember to add a mouse listener to each one.
    }

    private JLabel createImage(String fileName) throws MalformedURLException {
    	
   	 URL imageURL = getClass().getResource(fileName);
     //URL imageURL = new File(fileName).toURI().toURL();
   	 System.out.println("" + imageURL.getPath());
//   	 System.out.println("String name" + fileName + "   " +  imageURL.getPath());
   	 
     Icon icon = new ImageIcon(imageURL);
   	 JLabel imageLabel = new JLabel(icon);
   	 return imageLabel;
    }

    private void playSound(String fileName) {
   	 AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
   	 sound.play();
    }

}



