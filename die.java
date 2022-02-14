//This program is created by Moxit Shah(A00253719) from Cambrian College for his Java Assignment. This is a die class for dicegame.java file.
//Date Created : 14-FEB-2022.


import java.util.Random;

public class die{


   public String dicename;
   public int face;
   public int currentside;
   public int times = 0;

   public die()
   {
      dicename = "d6";
      face = 6;
      currentside = (int)(Math.random() * face) + 1;
      System.out.println("\nthe current side up for "+dicename+" is "+currentside);
   }

   public die(int face)
   {
      this.face = face;
      this.dicename = "d"+face ;
      currentside = (int)(Math.random() * face) + 1;
      System.out.println("\nThe current side up for d"+face+" is "+currentside);
      
   }

   public die(int face, String dicename)
   {  
      this.face = face;
      this.dicename = dicename;
      currentside = (int)(Math.random() * face) + 1;
      System.out.println("\nThe current side up for d"+face+"("+dicename+") is "+currentside);

   }


   public void roll()
   {
      
      this.currentside = (int)(Math.random() * this.face) + 1;
      System.out.println("\nRolling the "+this.dicename);
      System.out.println("The new value is "+this.currentside);
   }


   public void max()
   {
      System.out.println("\nSetting the dice");
      while(currentside!=20)
      {
         currentside = (int)(Math.random() * face) + 1;
         times++;
      }
      System.out.println("The side up is now "+currentside+" for dice having maximum side of "+currentside+". Finally in "+times+" rolls.");
   }



}










// public class die {
     
//         public int d10 ;   // Number showing on the first die.
//         public int d6;   // Number showing on the second die.
        
//         public die() {
//                 // Constructor.  Rolls the dice, so that they initially
//                 // show some random values.
//             roll();  // Call the roll() method to roll the dice.
//         }
        
//         public void roll() {
//                 // Roll the dice by setting each of the dice to be
//                 // a random number between 1 and 6.
//             d10 = (int)(Math.random()*10) + 1;
//             d6 = (int)(Math.random()*6) + 1;
//         }
                 
//         public int getDie1() {
//               // Return the number showing on the first die.
//            return d10;
//         }
        
//         public int getDie2() {
//               // Return the number showing on the second die.
//            return d6;
//         }
        
//         public int getTotal() {
//               // Return the total showing on the two dice.
//            return d10 + d6;
//         }
        
//      }  // end class PairOfDice



//      /* 
//         Rolls a pair of dice until the dice come up snake eyes
//         (with a total value of 2).  Counts and reports the
//         number of rolls.
//      */
     
     
     