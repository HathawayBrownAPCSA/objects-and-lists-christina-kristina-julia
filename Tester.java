
/**
 * Write a description of class Tester here.
 *
 * @author Julia, Kristina, Christina
 * @version 2021-09-24
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Tester
{
    
    public static void main (String[] args){

        Scanner kbd = new Scanner (System.in);
        Invoice myList = new Invoice();
        
        for (int i = 0; i < 3; i++)
        {
            System.out.print("Teacher name: ");
            String name = kbd.nextLine();
        
            System.out.print("What do rank them as (1-10, 10 being the best): ");
            int ranking = kbd.nextInt();
            String thing =  kbd.nextLine(); // clears the input line
        
            System.out.print("Please ellaborate: ");
            String comment = kbd.nextLine();
            
            Teachers teacher1 =  new Teachers(name, ranking, comment);
            
            /**Updats the price of the object 
             * @param teacher1 The updated teacher profile
             */

            System.out.println("Submitted Review");
            myList.addReview(new Teachers (name, ranking, comment));
            
        }
        myList.printInvoice();
        
        System.out.print("What teacher do you want to search for?");
        String name = kbd.nextLine();
        Teachers t = myList.findTeacher(name);
        
        if(t !=null)
        {
            System.out.println("Here's the review for " + name);
            System.out.println(t);
        }
        kbd.close();
        
    }
}
