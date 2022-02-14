//This program is created by Moxit Shah(A00253719) from Cambrian College for his Java Assignment. This is a dicegame java file for dicegame.
//Date Created : 14-FEB-2022.

public class DiceGame {
    
    //main function for the dicegame.    
    public static void main(String[] args) {

        die die, die20, die10;

        System.out.println("Creating a default d6...");
        System.out.println("Creating a d20");
        System.out.println("Creating percentile die (a special d10)...");

        die = new die();
        die20 = new die(20);
        die10 = new die(10,"special die");

        System.out.println("\nTesting the roll method");

        die.roll();
        die20.roll();
        die10.roll();

        die20.max();

        //creating 5 dice with 6 sides.

        System.out.println("\n========BONUS========");
        System.out.println("Creating 5 d6.");
        die die1 = new die();
        die die2 = new die();
        die die3 = new die();
        die die4 = new die();
        die die5 = new die(); 

        

      
        


 
   
       
    }
    
 }  

