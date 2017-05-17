////////////////////////////////////////////////////////////////////////////
//                                                                        //
// Sam Berdahl                                                            //
//  Assignment 1                                                          //
// January 28, 2014                                                       //
//                                                                        //
////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// DESCRIPTION: This program will take some select information from the user and ad lib a sentence for you.        //
// INPUT: The user will input select information such as a name of their choice, their favorite animal, color, and //
// food.                                                                                                           //
// OUTPUT: This program takes that input and constructs a sentence with the information given.                     //
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class AdLibProgram
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Hello,this program will use some basic information given by you and Ad Lib a sentence for you, please direct your attention to the lines below.");
    System.out.println("Enter the first name of anyone of your choosing (friend/relative).");
    String name, color, animal, food, totalSentence;
    name = keyboard.nextLine();
    if(name.equals("char"));
      System.out.println("Now, enter your favorite color.");
    color = keyboard.nextLine();
    if(color.equals("char"));
    System.out.println("Now, enter your favorite animal.");
    animal = keyboard.nextLine();
    if(animal.equals("char"));
    System.out.println("Now, enter your favorite food.");
    food = keyboard.nextLine();
    if(food.equals("char"));
    System.out.println("Here is your sentence:");
    totalSentence = ("I had a dream that " + name + " ate a " + color + " " + animal + " and said it tasted like " + food + "!");
      System.out.println(totalSentence);
      System.out.println("Have a nice day!");
    
                         }
}