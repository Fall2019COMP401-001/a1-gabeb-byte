package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int storeItems = scan.nextInt();
		String[] itemNames = new String[storeItems];
		int[] numOfItem = new int[storeItems];
		int[] numOfCustomers = new int[storeItems];
		
		for (int i=0; i<storeItems; i++) {
			itemNames[i] = scan.next();
			double price = scan.nextDouble();
			
		}
		int customers = scan.nextInt();
		for (int i=0; i<customers; i++) {
			String custName = scan.next() + " " + scan.next();
			int itemsBought = scan.nextInt();
			int[] itemChange = new int[storeItems];
			
			
			for (int x=0; x<itemsBought; x++) {
				
				int itemAmount = scan.nextInt();
				String item = scan.next();
				
				
				for (int y=0; y<itemNames.length; y++) {
					
					
					if (itemNames[y].contentEquals(item)) {
						numOfItem[y] += itemAmount;
						itemChange[y]++;
					
						
					} 
					
				}
				
				
			}
			for (int z=0; z<itemChange.length; z++) {
				if (itemChange[z]>0) {
					numOfCustomers[z]++;
				}
			}
		}
		for (int i=0; i<numOfItem.length; i++ ) {
			if (numOfCustomers[i]==0) {
				System.out.println("No customers bought " + itemNames[i]);
			} else {
				System.out.println(numOfCustomers[i] + " customers bought " + numOfItem[i] + " " + itemNames[i]);
			}
		}
		
		scan.close();
	}
}
