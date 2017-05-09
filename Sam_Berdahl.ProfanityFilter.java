////////////////////////////////////////////////////////////////////////////
//                                                                        //
// Sam Berdahl                                                            //
// Assignment 2                                                           //
// February 3, 2014                                                       //
//                                                                        //
////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                                                  //
// DESCRIPTION: This program reads a string entered into the keyboard and tests for the words dog, cat, and llama.  //
//                                                                                                                  //
// INPUT: The input for this program will be the string the user enters.                                            //
//                                                                                                                  //
// OUTPUT: The program will take the string entered and test for the words cat, dog, and llama.                     //
//                                                                                                                  //
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class ProfanityFilter
{
  public static void main(String[] args)
  {
    String s2, statement;
    System.out.println("Hello, enter a statement below and I will test whether it contains profanity (in this case we are categorizing profanity as the words \"cat\", \"dog\" , and \"llama\")  bgy6ygso please dont be afraid to vent your inner potty mouth.");
    Scanner keyboard = new Scanner(System.in);
    statement = keyboard.nextLine();
    s2 = statement.toUpperCase();
    
    if(s2.indexOf("CAT") >= 0)
      System.out.println("Your statement contains foul language, go get a bar of soap.");
    
    else if(s2.indexOf("DOG") >= 0)
    System.out.println("You need to watch your mouth.");
              
    else if(s2.indexOf("LLAMA") >= 0)
      System.out.println("I'm telling your mother on you.");
      
    else
      System.out.println("Thank you for not cursing.");
    System.out.println("Goodbye!");
      
                      
  }
}