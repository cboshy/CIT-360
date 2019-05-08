package cit360;



import java.util.HashSet;

import java.util.TreeSet;

import java.util.Set;



/**

 *

 * @author boshy

 */

public class BlakeSetExample {



    public static final String RESET = "[0m";

    

   public static void main (String[] args) {

      // Set HashSet

       Set<String> loadout1 = new HashSet<>();

		 // Set TreeSet

       Set<String> loadout2 = new TreeSet<>();

       

     // Loadout 1 added to HashSet

       

       loadout1.add("M4A1");

       loadout1.add("5.56mm Ammo");

       loadout1.add("4x Scope");

       loadout1.add("Med Kit");

       loadout1.add("UMP 9");

       loadout1.add("9mm Ammo");

       loadout1.add("Vertical Grip");

     // Loadout 2 added to TreeSet  

       loadout2.add("AWM");

       loadout2.add("Tommy Gun");

       loadout2.add(".30mm Magnum Ammo");

       loadout2.add("45mm Ammo");

       loadout2.add("Med Kit");

       loadout2.add("8x Scope");

       loadout2.add("Frag Grenade");  

       

       

       // Print list Loadout 1 unordered due to HashSet

       System.out.println("Loadout 1" + RESET);

       System.out.println(loadout1);

       

       // If duplicate is added it will not show

       

       loadout1.add("4x Scope");

       

       // Adding item

       loadout1.add("8x Scope");

       

       System.out.println("\nLoadout 1 After Addition and Removal" + RESET);

       for (String element: loadout1) {

           System.out.println(element);

       }

       System.out.println();

       

       

       

       // Print list Loadout 2

       System.out.println("Loadout 2" + RESET);

       System.out.println(loadout2);

       

       // Add item

       loadout2.remove("Frag Grenade");

       

       System.out.println("\nLoadout 2 After Additions" + RESET);

       for (String element: loadout2) {

           System.out.println(element);

       }

       

               

   }

   



}