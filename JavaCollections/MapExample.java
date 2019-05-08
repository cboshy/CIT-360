

package cit360;





import java.util.HashMap;

import java.util.Map;



/**

 *

 * @author boshy

 */

public class BlakeMapExample {

    

 public static void main(String args[]){  

  // Utility HashMap created  

  Map<Integer,String> utilityMap=new HashMap<Integer,String>();  

  

  // Items added to the Utility HashMap

  utilityMap.put(1,"Frag Grenade");  

  utilityMap.put(2,"Stun Grenade");  

  utilityMap.put(3,"Smoke Grenade");  

  

  // Weapon HashMap created 

  Map<Integer,String> weaponMap=new HashMap<Integer,String>();



  // Items added to the Weapon HashMap

  weaponMap.put(1,"M4A1");  

  weaponMap.put(2,"Khar 98");  

  weaponMap.put(3,"1911");

  

  

  // 2 demonstrations of grabbing an item from a map

  String grabUtility = utilityMap.get(1);

  String grabWeapon = weaponMap.get(2);

  

  // Looping through the Utility map and printing something

  for(Map.Entry bmp:utilityMap.entrySet()){  

   System.out.println(bmp.getKey()+" "+bmp.getValue());

   

  }  

  // This prints the utility selected above

  System.out.println("The selected utility is a " + grabUtility + ".");

  System.out.println();

  

  // Looping through the Weapon map and printing something

  for(Map.Entry bmp2:weaponMap.entrySet()){  

   System.out.println(bmp2.getKey()+" "+bmp2.getValue());  

  } 

  // This prints the weapon selected above

  System.out.println("The selected weapon is a " + grabWeapon + ".");

 }  

} 