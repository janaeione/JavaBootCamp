import java.util.Scanner;

public class adventureGame {

	public static void main(String args[]) {
		
		//Welcome 
		System.out.println("Welcome! What is your name?"); 
		
		// create a Scanner called "name" object from the Scanner class
		Scanner name = new Scanner (System.in);
		
		//prompt the user to enter name
		System.out.print("Enter Your Name");
		
		//get user to enter name
		String yourName = name.nextLine();
		
		//engage user
		System.out.println("Would you like to play a game? Select yes or no");
		
		//create Scanner for y
		String choice = name.nextLine();
		
		//prompt user to enter y or n
		if (choice.equalsIgnoreCase ("yes")){
		
			
			System.out.println("Excellent! You are walking across a field and you encounter a fire-breathing dragon! What would you do?");
		} else {System.out.println("Goodbye");}
	
		System.out.println("You approach the dragon. You see that he has _ heads.");
		
	
        

		String head = name.nextLine() ;
		switch (head) {
			case "1":
				head = "1";
				break;
			case "2": 
				head = "2";
				break;
			case "3":
				head = "3";
				break;
		}
			System.out.println("No one has ever faced a 3-headed dragon. Choose your weapon.");
			
			// Next Line
			
			String slingshot = name.nextLine();
			System.out.println("Sling Shot");
			
			String sword = name.nextLine();
			System.out.println("Sword");
			
			String bowAndArrow = name.nextLine();
			System.out.println("Bow and Arrow");
			
			if (slingshot.equalsIgnoreCase("Sling Shot")){
			System.out.println("You selected Sling Shot!");
			}
		
			else if (sword.equals ("Sword")) {
			System.out.println("You selected Sword");
			}
			
			else if (bowAndArrow.equals ("Bow and Arrow")) {
			System.out.println(" You selected Bow and Arrow");	 
			}
             
			System.out.println("Armed with your bow and arrow,you approach the dragon. You can feel its fiery breath as you get closer. It stares at you with its _ eyes.");
			
			
	
			//Next Line
			System.out.println("Oh thank goodness! Red-eyed dragons are friendly. You pet it and become friends. You name the dragon _.");
			
			
			String red = name.nextLine();
			String blue = name.nextLine();
			
			if (red.equalsIgnoreCase(red));
			System.out.println("Red");
			
			if (blue.equalsIgnoreCase(blue));
			System.out.println("Blue");
			
			// Next Line
			
			String Truth = name.nextLine();
			
		
			String userName = name.nextLine();
			
			System.out.println("_ and Truth live happily ever after.");
}
	}
	

