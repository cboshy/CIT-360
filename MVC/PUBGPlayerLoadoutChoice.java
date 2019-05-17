

/**

 *

 * @author boshy

 */



public class PUBGPlayerLoadoutChoice {

    

    // Event setup



    public static void main(String[] args){

        PUBGModel model = inputLoadout();



        PUBGView view = new PUBGView();



        PUBGController PUBGcontroller;

        PUBGcontroller = new PUBGController(model, view);        

        

        // Bringing item from model

        

        PUBGcontroller.PUBGLoadInformation();

        

        // First controller item

        

        PUBGcontroller.set_player_name("Boshy");

        PUBGcontroller.set_primary_choice("Silenced SKS");

        PUBGcontroller.set_secondary_choice("Silenced UMP9");

        PUBGcontroller.set_tertiary_choice("None for more inventory space");

        PUBGcontroller.set_utility_choice("Frag Grenade");

        PUBGcontroller.set_backpack_choice("Level 3");

        PUBGcontroller.set_armor_choice("Level 3");

        PUBGcontroller.set_helmet_choice("Level 3");



        PUBGcontroller.PUBGLoadInformation();

        

  /**

 *

 * @author Blake

 */

        

        // Second controller item

        

        PUBGcontroller.set_player_name("Frank R");

        PUBGcontroller.set_primary_choice("Silenced SCAR");

        PUBGcontroller.set_secondary_choice("Silenced Khar 98");

        PUBGcontroller.set_tertiary_choice("None for more inventory space");

        PUBGcontroller.set_utility_choice("Frag Grenade");

        PUBGcontroller.set_backpack_choice("Level 3");

        PUBGcontroller.set_armor_choice("Level 3");

        PUBGcontroller.set_helmet_choice("Level 3");



        PUBGcontroller.PUBGLoadInformation2();

        

        // Third controller item

        

        PUBGcontroller.set_player_name("Brett R");

        PUBGcontroller.set_primary_choice("Silenced AKM");

        PUBGcontroller.set_secondary_choice("Silenced Khar 98");

        PUBGcontroller.set_tertiary_choice("None for more inventory space");

        PUBGcontroller.set_utility_choice("Smoke Grenade");

        PUBGcontroller.set_backpack_choice("Level 3");

        PUBGcontroller.set_armor_choice("Level 3");

        PUBGcontroller.set_helmet_choice("Level 3");



        PUBGcontroller.PUBGLoadInformation3();



    }



} 