

/*
	1. Explain that objects have a name, member variables and methods. Draw example CRC card on board.

	2. Get kids to pick their favorite animal and describe it in CRC form with at least 2 member variables and 2 methods on paper.

	3. Show example constructor on board. Duck(String color, int numberOfFriends). void quack(){}
	Kids code their animal object. Constructor to set member variables. Put sysouts in methods. 

	4. Show how objects are made with new and call quack();
	Have kids make runner class.
	Create and call animal from Runner class.
	--------------------------------------
	Make more than one animal with different names.

	5. Show subservient chicken: http://www.subservientchicken.com/pre_bk_skinned.swf
	Have kids create Chicken class. Make runner class so that user can enter commands for the chicken.

	quiz:
	2 things an object has: member variables, methods
	4 things that methods have: {}, (), name, return type.
	how do you make an object?

	------- OPTIONAL ------------------------
	http://thenewboston.org/watch.php?cat=31&number=14
	Get all kids to create an object. share code. kids call the methods from the othersÕ objects.
	-----------------------------------------------
*/
	// Copyright Wintriss Technical Schools 2013
	public class Monday {

		private String name;
		private int lives = 9;

		void meow() {
			System.out.println("meeeeeooooooooooooooowwwwwwwwwwww!!");
		}

		void setName(String name) {
			this.name = name;
		}

		public void printName() {
			if (name == null)
				System.out.println("i don't know my own name!");
			else
				System.out.println("my name is " + name);
		}

		void kill() {
			lives--;
			if (lives > 0)
				System.out.println("nice try, but I still have " + lives + " lives left");
			else if (lives < 0)
				System.out.println("that's overkill yo!");
			else
				System.out.println("DEAD CAT :(");
		}

		public static void main(String[] args) {
			/* Do the following things without changing the Cat class */

			// 1. make the Cat meow

			// 2. get the Cat to print it's name

			// 3. kill the Cat!

		}
	}




