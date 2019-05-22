

package cit360;



import java.io.FileWriter;

import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;

import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.IOException;



/**

 *

 * @author boshy

 */



public class PUBGJSONDemonstration {



    public static void main(String[] args) {

        

        // Creation of the PUBGPlayerLoadout object



        JSONObject PUBGPlayerLoadout = new JSONObject();

        PUBGPlayerLoadout.put("PlayerName", "GreatGoldenBaby");

        PUBGPlayerLoadout.put("PlayerName2", "Sa!t");

        PUBGPlayerLoadout.put("PlayerName3", "Master2Mind");

        PUBGPlayerLoadout.put("PlayerName4", "BenignBrett");

        PUBGPlayerLoadout.put("PlayerName5", "RuineR");

        PUBGPlayerLoadout.put("PlayerName6", "bangawayne");

        

        // Call the file that the stringified object will be added to

        

        try (FileWriter file = new FileWriter("C:\\Users\\Blake\\Documents\\NetBeansProjects\\CIT360\\src\\cit360\\PUBGJSONDemonstration.json")) {

        

        // Convert object to string and write it to the file stated above    

        

            file.write(PUBGPlayerLoadout.toJSONString());

            file.flush();

        

        // Catch any errors. From what I've learned it seems to be a required feature.

            

        } catch (IOException IOException) {

            IOException.printStackTrace();

        }

        

        // Print out the stringified object

        

        System.out.print(PUBGPlayerLoadout);

        

        // Declare parsing of the string

        

        JSONParser parser = new JSONParser();

        

        try {



  /**

 *

 * @author boshy

 */

            

        // Declaring the file with the string being parsed

            

            Object PUBGobject = parser.parse(new FileReader("C:\\Users\\Blake\\Documents\\NetBeansProjects\\CIT360\\src\\cit360\\PUBGJSONDemonstration.json"));

        

        // Stating the object that will be pulled

            

            JSONObject PUBGJSONObject = (JSONObject) PUBGobject;

        

        // Calling individual properties from object for use

            

            String PlayerName = (String) PUBGJSONObject.get("PlayerName");

            String PlayerName2 = (String) PUBGJSONObject.get("PlayerName2");

            String PlayerName3 = (String) PUBGJSONObject.get("PlayerName3");

            String PlayerName4 = (String) PUBGJSONObject.get("PlayerName4");

        

        // Printing out parsed items for use in strings

            

            System.out.println("");

            System.out.println("Team Leader: " + PlayerName);

            System.out.println("");

            System.out.println("Team Members: " + PlayerName2 + ", " + PlayerName3 + ", " + PlayerName4 + ".");



        // Catch any errors. From what I've learned it seems to be a required feature.

        

  /**

 *

 * @author boshy

 */ 

  

        } catch (FileNotFoundException FileNotFoundException) {

            FileNotFoundException.printStackTrace();

        } catch (IOException IOException) {

            IOException.printStackTrace();

        } catch (ParseException ParseException) {

            ParseException.printStackTrace();

        }



    }



}

