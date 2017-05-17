import java.io.*;
import java.util.*;

////////////////////////////////////////////////////////////////////////////
//                                                                        //
//  Sam Berdahl                                                           //
//  Assignment 8                                                          //
//  April 14, 2014                                                        //
//                                                                        //
////////////////////////////////////////////////////////////////////////////


/***************************************************************************
 *
 *  Name:           FileIO
 * 
 *  Description:    Class which reads in the IntValue.txt file, then displays it
 *                  to the user, who is then prompted to enter the values which are then
 *                  written into a binary file (numbers.dat) and then displayed again.
 *                   
 *  Output:         The IntValue.txt and numbers.dat text files.
 *                  
 * 
 **************************************************************************/

public class FileIO
{
  public static void main(String[] args)
  {
    boolean done;
    Scanner inFile = null;
    String newFileName;
    Scanner key = new Scanner(System.in);
    System.out.println("File name is: IntValue.txt \n");
    
    
    do
    {
      System.out.println("Enter a file name below.");
      newFileName = key.nextLine();
      done = false;
      
      try
      {
        inFile = new Scanner(new File(newFileName));
        done = true; 
      }
      
      catch(FileNotFoundException e)
      {
        System.out.println("Error: " + e.getMessage());
        System.out.println();
        done = false;
      }
      
    }while(!done);
    
    while (inFile.hasNextLine())
    {
      System.out.println("The file IntValue.txt reads as follows: ");
      String line = inFile.nextLine();
      StringTokenizer wordFinder = new StringTokenizer(line, ",\n");
      while(wordFinder.hasMoreTokens())
        System.out.println(wordFinder.nextToken());
      
      fileOutput(line);
    }
    
    inFile.close();
  }
  
/***************************************************************************
 *
 *  Name:           fileOutput(finalInts)
 * 
 *  Description:    A void method which opens the numbers.dat file and allows the user
 *                  to write in the integer values of the IntValue.txt file and then displays
 *                  them.
 *  
 *  Input:          Integer values entered by the user from the IntValue.txt file.
 *  
 *  Output:         A display of the new numbers.dat file with the readIn() method.
 *                  
 * 
 **************************************************************************/
  
  public static void fileOutput(String finalInts)
  {
    Scanner keyboard = new Scanner(System.in);
    int anInteger;
    String fileName = "numbers.dat";
    
    try
    {
      ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
      System.out.println();
      System.out.println("Please enter each consecutive integer from the IntValue.txt file:");
      
      do
      {
        anInteger = keyboard.nextInt();
        outputStream.writeInt(anInteger);
        
      }while(anInteger < 9);
      
      outputStream.close();
      readIn();
      System.out.println();
      
    }
    catch(FileNotFoundException e)
    {
      System.out.println("Problem opening the file " + fileName);
    }
    
    catch(IOException e)
    {
      System.out.println("Problem with output to file " + fileName);
    }
  }
  
  
 /***************************************************************************
 *
 *  Name:           readIn()
 * 
 *  Description:    A void method for opening up the revised numbers.dat file and displaying
 *                  it back to the user.
 * 
 *  Input:          The numbers.dat file.
 *  
 *  Output:         A line by line display of the numbers.dat file.
 *                  
 * 
 **************************************************************************/
  
  public static void readIn()
  {
    System.out.println();
    System.out.println("The file numbers.dat reads as follows:");
    try
    {
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("numbers.dat"));
      try
      {
        while(true)
        {
          System.out.println(in.readInt());
          
        }
      }
      catch(EOFException eof)
      {
        System.out.println("Have a nice day!");
      }
    }
    catch(FileNotFoundException e)
    {
      System.out.println(e.getMessage());
    }
    catch(IOException e)
    {
      System.out.println(e.getMessage());
    }
  }
}
  
  