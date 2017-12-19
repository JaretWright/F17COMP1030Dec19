package f17comp1030dec19;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class FilesAndDirectories {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a file or directory name: ");
        analyzePath(keyboard.nextLine());
    }
    
    /**
     * This method will tell us about the String passed
     * in as an argument by using it to create a File object
     */
    public static void analyzePath(String path)    
    {
        //create a File object
        File fileToInspect = new File(path);
        
        if (fileToInspect.exists())
        {
            System.out.println("Wahoo it was a valid path :-)");
            System.out.println(fileToInspect.isDirectory()?"is a directory":"is not a directory");
            System.out.println(fileToInspect.isFile()?"is a file":"is not a file");
            System.out.println(fileToInspect.isAbsolute()?"is an absolute path":"is not an absolute path");
            System.out.println("It was last modified on: " + fileToInspect.lastModified());
            System.out.println("Relative Path: "+fileToInspect.getPath());
            System.out.println("Absolute Path: "+fileToInspect.getAbsolutePath());
            
            if (fileToInspect.isDirectory())
            {
                String[] directoryContents = fileToInspect.list();
                System.out.printf("%nDirectory contents: %n");
                
                //super cool enhanced for loop
                for(String fileName : directoryContents)
                {
                    System.out.println(fileName);
                }
            }  
        }
        else
        {
            System.out.println("Boo it was not a valid path :-(");
        }
    }
}
