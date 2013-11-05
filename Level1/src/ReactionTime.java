// Copyright Wintriss Technical Schools 2013

import java.awt.Component;

import java.awt.event.KeyAdapter;

import java.awt.event.KeyEvent;

import java.net.URL;

import java.util.Date;

import java.util.HashMap;

import java.util.Random;



import javax.swing.Icon;

import javax.swing.ImageIcon;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JOptionPane;



public class ReactionTime extends KeyAdapter {



// 1. Make a JFrame variable and initialize it using "new JFrame()"

JFrame frame = new JFrame();
Date timeAtStart = new Date();
HashMap<Integer,String> images = new HashMap<Integer, String>();

private int imageIndex;
private int tries = 0;
private int points = 0; 


private  void makeAlbum() {

// 2. add 4 images which match keyboard keys like this: images.put(new Integer(KeyEvent.VK_UP), "image.jpg");

images.put(new Integer(KeyEvent.VK_UP), "mushroom.png");

images.put(new Integer(KeyEvent.VK_DOWN), "Peashooter.png");

images.put(new Integer(KeyEvent.VK_LEFT), "sunflower.jpg");

images.put(new Integer(KeyEvent.VK_RIGHT), "zombie.jpg");


// 3. call the method to show an image

showImage();


}



public void keyPressed(KeyEvent e) {

int keyCode = e.getKeyCode();


//11. increment tries by 1

tries++;

//12. if tries is greater than 9 (or however many you want)

//13.	 exit the program

if(tries > 9){

JOptionPane.showMessageDialog(null, "Game over! You got " + points + " points.");

Date timeAtEnd = new Date();

JOptionPane.showMessageDialog(null,"It took you " + (timeAtEnd.getTime()-timeAtStart.getTime())/1000 + " seconds" ) ;

System.exit(0);

}

//14. if the keyCode matches the imageIndex

//15.	 tell them they got a point

if(keyCode == imageIndex){

JOptionPane.showMessageDialog(null, "you got a point");

points++; 

}


//9. dispose of the frame

frame.dispose();


//10. call the method to show an image

showImage();

}





private void showImage() {

//4. initialize your frame to a new JFrame()

frame = new JFrame();



//5. set the frame to visible

frame.setVisible(true);

frame.add(getNextRandomImage()); //6. rename to the name of your frame


// 7. set the size of the frame  

frame.setSize(1000, 1000);
// 8. add a key listener to the frame

frame.addKeyListener(this);


}



private Component getNextRandomImage() {

this.imageIndex = new Random().nextInt(4) + 37;

return loadImage(images.get(imageIndex));

}



private JLabel loadImage(String fileName) {

URL imageURL = getClass().getResource(fileName);

Icon icon = new ImageIcon(imageURL);

return new JLabel(icon);

}



public static void main(String[] args) throws Exception {

new ReactionTime().makeAlbum();



}

}



/* 16. make a points variable to track the score. tell the user their score at the end.

* 

* 17. add a timer

* ~~~ where the code starts running ~~~

* Date timeAtStart = new Date();

* 

* ~~~ where the code ends ~~~

* Date timeAtEnd = new Date();

* System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);

* System.exit(0);

*/
