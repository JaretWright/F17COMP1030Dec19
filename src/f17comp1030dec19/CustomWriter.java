package f17comp1030dec19;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jwright
 */
public class CustomWriter {
    public static void main(String[] args)    
    {
        printToFile();
    }
    
    /**
     * This method will keep asking the user for input until they type the word
     * "quit".  It will write the users' input into a file called semestersOver.txt
     */
    public static void printToFile() 
    {
        try
        {
            Formatter outputStream = new Formatter("semestersOver.txt");
            boolean keepAsking = true;
            Scanner keyboard = new Scanner(System.in);
            String userInput;
            
            do{
                System.out.print("Please enter some text (type quit to stop):" );
                userInput = keyboard.nextLine();
                
                if (userInput.equalsIgnoreCase("quit"))
                    keepAsking=false;
                else
                    outputStream.format(userInput +"%n"); //this prints to the file
            } while(keepAsking);
            
            //close the stream to the file
            outputStream.close();
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(CustomWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
