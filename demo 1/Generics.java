
package generics;

//import java.util.ArrayList;
//import java.util.List;

public class Generics {

	public static void main(String[] args) {
		
		Integer[] myIntArray = {1,2,3,4,5,6};
		String[] myStringArray = {"My ", "name ", "is ", "Wande"};
		//Printer print = new Printer();
		Printer.printArray(myIntArray);
		Printer.printArray(myStringArray);
		
		int[] yourIntArray = {1,3,5,7,9};
		printClass.printIntArray(yourIntArray);
		
		System.out.println("Largest number amongst 2, 3, 5 is: " + Printer.maximumNo(2,3,5));
		System.out.println("Largest number amongst 2.5, 3.5, 2.85 is: " + Printer.maximumNo(2.5,3.5,2.85));
		
		//Printer myPrinter = new Printer();
		
		/*
		List stringList1 = new ArrayList();
		
		stringList1.add("Java 5");
		stringList1.add("with generics");
		
		String s1 = (String) stringList1.get(0);
		String s2 = (String) stringList1.get(1);

		System.out.println(s1);
		System.out.println(s2);
		*/
	}
	
}
