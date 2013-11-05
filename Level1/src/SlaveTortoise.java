import org.teachingextensions.logo.Tortoise; 

public class SlaveTortoise {

	/*We are going to make a slave tortoise that will obey our commands to draw shapes.

	8. Ask the user which shape they want. Draw the appropriate shape depending on their answer.

	9. Ask the user which color they want. Color the the shape depending on their answer.*/

//		1. Make a new class, create a main method, and show the tortoise.

	public static void main(String [ ] args)
	{
		Tortoise.show(); 
		drawCircle();

// 	2. Have the Tortoise draw a square.
//  3. Extract this code into a drawSquare() method.
	}
	public static void drawSquare(){
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);	
	}
	
//	4. Have the Tortoise draw a triangle.
//	5. Extract this code into a drawTriangle() method.
	public static void drawTriangle(){
		Tortoise.turn(60);
		Tortoise.move(100);
		Tortoise.turn(120);
		Tortoise.move(100);
		Tortoise.turn(120);
		Tortoise.move(100);
	
	}
	
//	6. Have the Tortoise draw a circle.
//	7. Extract this code into a drawCircle() method.
	public static void drawCircle(){
		Tortoise.setSpeed(200); 
		
		for (int i = 1; i < 360; i++){
			Tortoise.turn(i);
			Tortoise.move(i);
		}
		
	}
	
	
}
