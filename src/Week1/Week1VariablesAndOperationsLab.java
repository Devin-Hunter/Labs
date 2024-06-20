package Week1;

public class Week1VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight	
		
		int seats = 10;
		System.out.println(seats);

		// 2. Create a variable to hold the cost of groceries at checkout
		
		double groceryCost = 1.00;
		System.out.println(groceryCost);
		
		// 3. Create a variable to hold a person's middle initial
		
		char middleInitial = 'M';
		System.out.println(middleInitial);

	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		
		boolean temp = false;
		System.out.println(temp);

		
		// 5. Create a variable to hold a customer's first name
		
		String firstName = "Devin";
		System.out.println(firstName);

		
		// 6. Create a variable to hold a street address
		
		int streetNumber = 1372;
		String streetName = "S Cathay Ct";
		
		System.out.println(streetNumber + " " + streetName);

		

		// 7. Print all variables to the console
	

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		
		seats = 5;
		
		int soldSeats = 2;
		
		int currentSeats = seats - soldSeats;
		
		System.out.println(currentSeats);
	

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		
		System.out.println(groceryCost + 2.15);


		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		
		middleInitial = 'R';
		System.out.println(middleInitial);
		

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		
		System.out.println(!temp);


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		
		firstName = "James";
		
		String fullName = firstName + " " + middleInitial + " " + "Hunter";
		System.out.println(fullName);
	

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		
		String intro = "Hello " + fullName + ". " + "Our records show you live at " + streetNumber + " " + streetName + ".";
		
		System.out.println(intro);

		
		
	}

}
