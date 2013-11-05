

// Copyright Wintriss Technical Schools 2013
/* 
 * 1. Watch this smurf cartoon: http://www.youtube.com/watch?v=vQbSGLaVJ5c
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class Smurf {

	private String name;
	private static String name2;
	

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		if(name.equalsIgnoreCase("Papa Smurf")){
			System.out.println("This smurf is wearing a Red Hat");
		}
		else{
			System.out.println("This smurf is wearing a White Hat");
		} 
		
		return "";
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		if(name.equalsIgnoreCase("Smurfette")){
			System.out.println("This is a Girl Smurf");
		}
		else{
			System.out.println("This is a Boy Smurf");
		} 

		return "";
	}
	public static void main(String[] args) {
		Smurf s = new Smurf("silly");
		Smurf s2 = new Smurf("smart");
		
		Smurf.name2="testing"; //accessing it in a static way
		s.name2 = "test"; //setting name for all smurfs, weird

		s2.name2 ="testing2"; //changing name2 for all instances.
		System.out.println(s.name2 + "   " + s2.name2);
		
	}
	

}


