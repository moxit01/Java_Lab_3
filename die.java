//This program is created by Moxit Shah(A00253719) from Cambrian College for his Java Assignment. This is a die class for dicegame.java file.
//Date Created : 14-FEB-2022.


import java.util.Random;

public class die{


   public String dicename;
   public int face;
   public int currentside;
   public int times = 0;


   //Default constructor
   public die()
   {
      dicename = "d6";
      face = 6;
      currentside = (int)(Math.random() * face) + 1;
      System.out.println("\nthe current side up for "+dicename+" is "+currentside);
   }

   //constructor with 1 parameters
   public die(int face)
   {
      this.face = face;
      dicename = "d"+face ;
      currentside = (int)(Math.random() * face) + 1;
      System.out.println("\nThe current side up for d"+face+" is "+currentside);
      
   }

   //constructor with 2 parameters
   public die(int face, String dicename)
   {  
      this.face = face;
      this.dicename = dicename;
      currentside = (int)(Math.random() * face) + 1;
      System.out.println("\nThe current side up for d"+face+"("+dicename+") is "+currentside);

   }

   //rolling function
   public void roll()
   {
      
      currentside = (int)(Math.random() * face) + 1;
      System.out.println("\nRolling the "+dicename);
      System.out.println("The new value is "+currentside);
   }

   //getting max value for one of the dice
   public boolean max()
   {
      System.out.println("\nSetting the dice");
      while(currentside!=face)
      {
         currentside = (int)(Math.random() * face) + 1;
         times++;
      }
      System.out.println("The side up is now "+currentside+" for dice having maximum side of "+currentside+". Finally in "+times+" rolls.");
      return true;
   }

   //get current side
   public int getcurrentside() 
   {
      return currentside;
   }


  




}

