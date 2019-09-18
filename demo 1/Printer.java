
package generics;

/**
 *
 * @author WANDE
 */
public class Printer {
	public static < E > void printArray(E[] inputArray){
		for(E element : inputArray){
			//System.out.printf("%s", element);
			System.out.print(element);
		}
		System.out.println();
	}
	
	public static <T extends Comparable<T>> T maximumNo(T no1, T no2, T no3){
		T max = no1;
		
		if(no2.compareTo(max) > 0){
			max = no2;
		}
		
		if(no3.compareTo(max) > 0){
			max = no3;
		}
		
		return max;
	}
}
