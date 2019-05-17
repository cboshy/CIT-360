

/**

 *

 * @author boshy

 */



public class PUBGController {

    

    // Controller setup

    

    // Declaration of the Model and the View

    

    private PUBGModel model;

    private PUBGView view;



    public PUBGController(PUBGModel model, PUBGView view){

        this.model = model;

        this.view = view;

    }

    

    // Setting the player_name

    

    public void set_player_name(String player_name){

        model.set_player_name(player_name);

    }

    

    // Getting the player_name

    

    public String get_player_name(){

        return model.get_player_name();

    }

    

    // Setting the primary_choice

    

    public void set_primary_choice(String primary_choice){

        model.set_primary_choice(primary_choice);

    }

    

    // Geting the primary_choice

   

    public String get_primary_choice(){

        return model.get_primary_choice();

    }

    

    // Setting the secondary_choice

    

    public void set_secondary_choice(String secondary_choice){

        model.set_secondary_choice(secondary_choice);

    }

    

    // Getting the secondary_choice



    public String get_secondary_choice(){

        return model.get_secondary_choice();

    }

    

  /**

 *

 * @author Blake

 */

    

    // Setting the tertiary_choice



    public void set_tertiary_choice(String tertiary_choice){

        model.set_tertiary_choice(tertiary_choice);

    }

    

    // Getting the tertiary_choice



    public String get_tertiary_choice(){

        return model.get_tertiary_choice();

    }

    

    // Setting the utility_choice

    

    public void set_utility_choice(String utility_choice){

        model.set_utility_choice(utility_choice);

    }

    

    // Getting the utility_choice



    public String get_utility_choice(){

        return model.get_utility_choice();

    }

    

    // Getting the backpack_choice

    

    public void set_backpack_choice(String backpack_choice){

        model.set_backpack_choice(backpack_choice);

    }

    

    // Getting the backpack_choice



    public String get_backpack_choice(){

        return model.get_backpack_choice();

    }

    

    // Getting the armor_choice

    

    public void set_armor_choice(String armor_choice){

        model.set_armor_choice(armor_choice);

    }

    

    // Getting the armor_choice



    public String get_armor_choice(){

        return model.get_armor_choice();

    }

    

  /**

 *

 * @author Blake

 */

    

    // Getting the helmet_choice

    

    public void set_helmet_choice(String helmet_choice){

        model.set_helmet_choice(helmet_choice);

    }

    

    // Getting the helmet_choice



    public String get_helmet_choice(){

        return model.get_helmet_choice();

    }

    

    // Printing or loading the information for each player

    

    public void PUBGLoadInformation(){

        view.inputLoadout(model.get_player_name(),model.get_primary_choice(),model.get_secondary_choice(),model.get_tertiary_choice(),model.get_utility_choice(),model.get_backpack_choice(),model.get_armor_choice(),model.get_helmet_choice());

    }

    

    public void PUBGLoadInformation2() {

        view.inputLoadout(model.get_player_name(),model.get_primary_choice(),model.get_secondary_choice(),model.get_tertiary_choice(),model.get_utility_choice(),model.get_backpack_choice(),model.get_armor_choice(),model.get_helmet_choice());

    }

    

    public void PUBGLoadInformation3() {

        view.inputLoadout(model.get_player_name(),model.get_primary_choice(),model.get_secondary_choice(),model.get_tertiary_choice(),model.get_utility_choice(),model.get_backpack_choice(),model.get_armor_choice(),model.get_helmet_choice());

    }

}