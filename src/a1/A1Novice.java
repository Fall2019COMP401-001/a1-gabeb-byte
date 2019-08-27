package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Number of customers
		int customers = scan.nextInt();
		
		
		for(int i=0; i<customers; i++) {
			double total = 0;
			String first = scan.next();
			String last = scan.next();
			int numOfItems = scan.nextInt();
			
			for (int x=0; x<numOfItems; x++) {
				int quantity = scan.nextInt();
				String itemName = scan.next();
				double itemPrice = scan.nextDouble();
				total = total + (quantity*itemPrice);
			}
			System.out.println("" + first.charAt(0) + ". " + last + ": " + String.format("%.2f", total));
		}
		scan.close();
	}
}
