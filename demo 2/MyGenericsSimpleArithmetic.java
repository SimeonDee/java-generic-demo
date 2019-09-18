
package GenericsScenerio;
import java.util.Scanner;
public class MyGenericsSimpleArithmetic {
    public static <E extends Comparable<E>> E smallest(E a, E b) {
        E smallest = a;
        
        if(b.compareTo(smallest) < 0){
            smallest = b;
        }
                
        return smallest;
    }
    
    public static <E extends Comparable<E>> void sortDescending(E[] inputs){
        E temp, sortedArray[];
        for(int i=0; i < inputs.length; i++){
            for(int j = 0; j < inputs.length - 1; j++){
                if(inputs[j++].compareTo(inputs[j]) > 0 ){
                    temp = inputs[j];
                    inputs[j] = inputs[j++];
                    inputs[j++] = temp;
                }
            }
        }
        
        sortedArray = inputs;
//        for(int k = 0; k <= sortedArray.length; k++){
//            System.out.print(sortedArray[k] + ", ");
//        }
        for(E x: inputs){
            System.out.print(x + ", ");
        }
    }
    
    public static void main(String[] args){
        try{
            Scanner in = new Scanner(System.in);
        
            //Implementing the smallest(E, E) generic method
            System.out.println("Enter three integer values");
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
        
            System.out.println("The smallest of the integer values is " + 
                smallest(smallest(x,y),z));
        
            System.out.println("\nEnter three floating values");
            double f1 = in.nextDouble();
            double f2 = in.nextDouble();
            double f3 = in.nextDouble();
        
            System.out.println("\nThe smallest of the double values is " + 
                smallest(smallest(f1,f2),f3));
        
//        //Implementing the sortDescending(E[]) method
//        int n; 
//        Integer[] arrayInt;
//        Double[] arrayDouble;
//        System.out.print("Supply the number of data to be sorted: ");
//        n = in.nextInt();
//        
//        arrayInt = new Integer[n];
//        arrayDouble = new Double[n];
//        
//        //Integer numbers to be sorted
//        System.out.println("Enter the " + n + " integer numbers: ");
//        for (int k = 1; k <= n; k++){
//            arrayInt[k] = in.nextInt();
//        }
//        
//        //Double (floating point) numbers to be sorted
//        System.out.println("Enter the " + n + " floating point numbers: ");
//        for (int k = 1; k <= n; k++){
//            arrayDouble[k] = in.nextDouble();
//        }
//        
//        //Sorted Arrays
//        System.out.println("Integer numbers Sorted in Descending Order are");
//        sortDescending(arrayInt);
//        System.out.println("Double numbers Sorted in Descending Order are");
//        sortDescending(arrayDouble);
//        
        
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }   
    }  
   
}
