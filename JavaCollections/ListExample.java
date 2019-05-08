

package cit360;



import java.util.ArrayList;



/**

 *

 * @author boshy

 */

 

public class BlakeListExample {

   

   public static void main(String[] args) {

   // Declare the arraylist of itemsInBackpack

      ArrayList<String> itemsInBackpack = new ArrayList<>(); 

   // Declare values of itemsInBackpack   

      itemsInBackpack.add("Frag Grenade");  

      itemsInBackpack.add("5.56 Ammo");

      itemsInBackpack.add("First Aid");

      itemsInBackpack.add("Flash Hider");

      itemsInBackpack.add("Extended Magazine");

      itemsInBackpack.add("2x Scope");

      

      // Print list of items in backpack

      

      System.out.println("Current loadout");

      System.out.println();

      for (int i = 0; i < itemsInBackpack.size(); i++) {

         System.out.println(itemsInBackpack.get(i)); 

      }

      // Print out line break

      System.out.println(); 

      

      // Dropping the flash hider

      itemsInBackpack.remove(itemsInBackpack.size() - 3);

      System.out.println();

      System.out.println("Dropped Flash Hider");

      // Dropping the Extended Magazine

      itemsInBackpack.remove(itemsInBackpack.size() - 2);

      System.out.println();

      System.out.println("Dropped Extended Magazine");

      

      // Pick up the Extended Quickdraw Magazine

      itemsInBackpack.add("Extended Quickdraw Magazine");

      System.out.println();

      System.out.println("Picked up Extended Quickdraw Magazine");

      // Pick up the Suppressor

      itemsInBackpack.add("Suppressor");

      System.out.println();

      System.out.println("Picked up Suppressor");

      System.out.println();

      

      // Display current inventory after drop and pickup

      for (String value: itemsInBackpack) {

      	System.out.println(value);

        

      }

      System.out.println();

        System.out.println("Ready for a Winner Winner Chicken Dinner!");

   }

}

