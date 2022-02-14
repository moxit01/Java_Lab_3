//This program is created by Moxit Shah(A00253719) from Cambrian College for his Java Assignment. This is a dicegame java file for dicegame.
//Date Created : 14-FEB-2022.

public class DiceGame {
     
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



       



 
   
       
    }
    
 }  





 

  //    die dice;          // A variable that will refer to the dice.
    //    int rollCount;    // Number of times the dice have been rolled.
 
    //    dice = new die();  // Create the PairOfDice object.
    //    rollCount = 0;
       
        /* Roll the dice until they come up snake eyes. */
       
    //    do {
    //        dice.roll();
    //        System.out.println("The dice come up " + dice.getDie1() 
    //                                         + " and " + dice.getDie2());
    //        rollCount++;
    //    } while (dice.getTotal() != 2);
       
    //    /* Report the number of rolls. */
       
    //    System.out.println("\nIt took " + rollCount + " rolls to get a 2.");