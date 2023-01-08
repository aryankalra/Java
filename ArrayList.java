import java.util.ArrayList;
import java.util.ListIterator;

public class Exercises {

	public static void main(String[] args) {

		ArrayList<Double> dlist = new ArrayList<Double>();

		// 		Adding 4 doubles to the above array list
		
		dlist.add(4.5);
		dlist.add(3.6);
		dlist.add(1.9);
		dlist.add(3.8);

		// 		Printing the size of the array list
		
		System.out.println(dlist.size());

		// 		Adding -0.5 at index 1 and index 3 in the above array list
		
		dlist.add(1,-0.5);
		dlist.add(3,-0.5);
		
		// 		Removing -0.5 from the array list using list.remove(Double)
		
		Double rem = -0.5;
		dlist.remove(rem);

		// 		Printing the contents of the array list
		
		System.out.println(dlist);

		// 		Setting the double in index 3 of the list to 0.99
		//		Noting list.set(int,Double)
		
		dlist.set(3,0.99);

		// 		Printing the double at index 3.

		
		System.out.println(dlist.get(3));

		// 		Printing the index of -0.5 in the array list.
		//		Noting indexOf
		
		System.out.println(dlist.indexOf(-0.5));

		//   	Printing each double in the array list on a separate line
		
		for(Double item : dlist) {
			System.out.println(item);
		}

		// 		Calculating the sum of all doubles in the array list
		//		Storing result in a variable called sum.
		//		Printing the result of sum to confirm it is correct
		
		double dsum = 0;
		
		for(Double item : dlist) {
			dsum += item;
		}
		
		System.out.println(dsum);

		// 		Creating a new array list called slist which contains String objects
		
		ArrayList<String> slist = new ArrayList<String>();

		//  	Adding 6 names to array list.	 	
		
		slist.add("Red");
		slist.add("Green");
		slist.add("Black");
		slist.add("Yellow");
		slist.add("Brown");
		slist.add("White");

		// 	Creating a String called firstLetters which contains the first
		//			letter of each name in the array list.
		// Ex:	if list = {"John","Andy","Kate","Lenny"}
		//			the firstLetters = "JAKL"
		//			Print firstLetters to check your result
		
		String firstLetters = "";
		for(String item : slist) {
			firstLetters += item.charAt(0);
		}
		
		System.out.println(firstLetters);

		// 	Uses a ListIterator to print all names in slist on one line with
		//			a comma in between them.
		//			Note: System.out.print() will print on one line.
		// Ex:	if slist = {"John","Andy","Kate","Lenny"}
		//			the it should print:
		//			John,Andy,Kate,Lenny
		
		ListIterator<String> iter = slist.listIterator();
		String toPrint = "{";
		
		while(iter.hasNext()) {
			toPrint+="\""+iter.next()+"\",";
		}
		
		toPrint = toPrint.substring(0,toPrint.length()-1)+"}";
		
		System.out.println(toPrint);

	}

	// The method should set all negative numbers in the list to 0.
	public static void noNegatives(ArrayList<Double> list) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i)<0) {
				list.set(i, 0.0);
			}
		}
	}

	// The method should print only the negative numbers in the list.
	// Uses the list iterator
	public static void printNegatives(ArrayList<Double> list) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i)<0) {
				System.out.println(list.get(i));
			}
		}
	}

	// The method should return the largest number in the list
	// Uses a for each loop
	public static double getMax ( ArrayList <Double > list ) {
		double max = list.get(0);
		for(Double item : list) {
			if(item > max) {
				item = max;
			}
		}
		
		return max;
	}

	// The method should return the sum of the squared values in lists
	// Uses a for each loop
	// Ex:	if list = {2,3,4}
	//			then return 4 + 9 + 16
	public static int sumSquares ( ArrayList <Integer > list ) {
		
		int sum = 0;
		
		for(Integer item : list) {
			sum += item*item;
		}
		
		return sum;
	}

	// The method should remove all Strings in the list which have a length
	// smaller than minLength.
	public static void removeTooSmall ( ArrayList <String> list, int minLength) {

		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).length()<minLength) {
				list.remove(i);
			}
			
		}
	}

	// The method should restrict the length of all strings in the list to
	// maxLength.
	// Ex:	if list = {"John","Andy","Kate","Lenny"} and maxLength = 2
	//			The method should change list to:
	//			list = {"Jo","An","Ka","Le"}
	public static void truncate ( ArrayList <String> list, int maxLength) {
		
		for(int i = 0; i < list.size(); i++) {
			
			list.set(i, list.get(i).substring(0,maxLength));
		
		}
			
	}

}
