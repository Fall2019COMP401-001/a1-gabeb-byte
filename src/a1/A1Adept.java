package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
	
		int storeItems = scan.nextInt();
		String[] itemNames = new String[storeItems];
		double[] prices = new double[storeItems];
		
		for (int i=0; i<storeItems; i++) {
			itemNames[i] = scan.next();
			prices[i] = scan.nextDouble();
			
		}
		int customers = scan.nextInt();
		String[] custNames = new String[customers];
		double[] custTotal = new double[customers];
		
		for (int i=0; i<customers; i++) {
			custNames[i] = scan.next() + " " + scan.next();
			int itemsBought = scan.nextInt();
			
			for (int x=0; x<itemsBought; x++) {
				
				int itemAmount = scan.nextInt();
				String item = scan.next();
				
				
				for (int y=0; y<itemNames.length; y++) {
					
					
					if (itemNames[y].contentEquals(item)) {
						custTotal[i] += itemAmount * prices[y];
						

						break;
					} 
					
				}
				
			}
		}
		String richCust = "";
		for (int i=0; i<custNames.length; i++) {
			if (getMaxTotal(custTotal) == custTotal[i]) {
				richCust = custNames[i];
			}
		}
		String notSoRichCust = "";
		for (int i=0; i<custNames.length; i++) {
			if (getMinTotal(custTotal) == custTotal[i]) {
				notSoRichCust = custNames[i];
			}
		}
		
		System.out.println("Biggest: " + richCust + " (" + String.format("%.2f", getMaxTotal(custTotal)) + ")");
		System.out.println("Smallest: " + notSoRichCust + " (" + String.format("%.2f", getMinTotal(custTotal)) + ")");
		System.out.println("Average: " + String.format("%.2f", getAvgTotal(custTotal)));
		scan.close();

	}
	public static double getMaxTotal(double[] arr) {
		double curMax = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > curMax) {
				curMax = arr[i];
			}
		}
		return curMax;
	}
	public static double getMinTotal(double[] arr) {
		double curMin = arr[0];
		for (int i=0; i<arr.length; i++) {
			if (arr[i] < curMin) {
				curMin = arr[i];
			}
		}
		return curMin;
	}
	public static double getAvgTotal(double[] arr) {
		double Avg = 0;
		for (int i=0; i<arr.length; i++) {
			Avg += arr[i];
		}
		Avg = Avg/arr.length;
		return Avg;
	}
	public static String elementToString(int i, String[] arr) {
		
		return arr[i] + ""; 
			
		
	}
	
}
