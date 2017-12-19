package f17comp1030dec19;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class F17COMP1030Dec19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numberArray = new int[5];  //challenge #1
        
        
        //challenge 2
        for (int i=0; i<numberArray.length; i++)
        {
            boolean validNumber=false;
            do{
                try{
                    Scanner keyboard = new Scanner(System.in);
                    System.out.print("Enter a number >= 0 : ");
                    int userNum = keyboard.nextInt();

                    if (userNum >= 0) {
                        numberArray[i]=userNum;
                        validNumber=true;
                    }
                    else {System.err.printf("%d was not >=0%n", userNum);}
                }
                catch (InputMismatchException exception)
                {
                    System.err.println("Stop sipping the eggnog and enter a #");
                }    
            } while (!validNumber);
        } //end of the for loop
        
        displayArray(numberArray);
        
    } // end of the main method
    
    public static void displayArray(int[] array)
    {
        System.out.print("[");
        for (int i=0; i<array.length; i++)
        {
            if (i<array.length-1)
                System.out.printf("%d, ", array[i]);
            else
                System.out.printf("%d]%n", array[i]);
        }
    }
}
