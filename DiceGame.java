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

        //creating 5 dice with 6 sides to have all dice with same sides..

        System.out.println("\n========BONUS========");
        System.out.println("Creating 5 d6.");
        die die1 = new die();
        die die2 = new die();
        die die3 = new die();
        die die4 = new die();
        die die5 = new die(); 

        boolean match = false;
        int rolls = 1;

        while(match!= true){
            die1.rolls();
            die2.rolls();
            die3.rolls();
            die4.rolls();
            die5.rolls();
            rolls++;
            if(die1.getcurrentside() == die2.getcurrentside() && die2.getcurrentside() == die3.getcurrentside() && 
            die3.getcurrentside() == die4.getcurrentside() && die4.getcurrentside() == die5.getcurrentside())
            {
                match = true;
            }

        }
        System.out.println("\nHurray!!! It took "+rolls+" rolls to have 5 dice with same sides i.e. "+die1.getcurrentside());
      
        


 
   
       
    }
    
 }  

