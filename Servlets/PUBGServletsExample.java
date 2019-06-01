

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;



/**

 *

 * @author boshy

 */



// Declaring public class Servlets that extends to HttpServlet



public class PUBGServletsExample extends HttpServlet {

        

        // Declaring public variable content that will house what is posted.

        

        public String content;

        

        @Override

        public void init() {

            

                        

        // Declaring any variables being put into printed HTML

        

            String Blake = "boshy";

            String BlakeWeapon = "Khar 98";

            String Travis = "Travis";

            String TravisWeapon = "AKM";

            String Brett = "Brett";

            String BrettWeapon = "AKM";

            String Curtis = "Curtis";

            String CurtisWeapon = "M4A1";

            int first = 1;

            String winner = "Winner Winner Chicken Dinner!";

            

            content = "<h1 align='center'>PUBGServletExample</h1>"

                                  + "<p>" + Blake + " prefers the " + BlakeWeapon + " for combat.<br>"

                                  + "<p>" + Travis + " prefers the " + TravisWeapon + " for combat.<br>"

                                  + "<p>" + Brett + " prefers the " + BrettWeapon + " for combat.<br>"

                                  + "<p>" + Curtis + " prefers the " + CurtisWeapon + " for combat.<br>"

                                  + "<p>At the end of the match we hope to be #" + first + "so we can get us a " + winner + "<br><br>";

        }



        // Performing the doGet to make a request

        

        protected void processRequest(HttpServletRequest request, HttpServletResponse response) 

                    throws ServletException, IOException {

            response.setContentType("text/html;charset=UTF-8");                                

        

        // Creating the writer



        PrintWriter PUBGPrintHTML = response.getWriter();



        try {

            PUBGPrintHTML.println(content);

        } catch(Exception e) {



        }

        finally {

            PUBGPrintHTML.close();

        }

	}	

        

        // @Override to get rid of warnings

        

        @Override

        

        // Performing doGet to post to requested place

        

	protected void doGet(HttpServletRequest request,

			HttpServletResponse response) 

                throws ServletException, IOException {

            processRequest(request,response);

	}

        

        // @Override to get rid of warnings

        

        @Override

        

        // Performing doPost to post to requested place

        

        protected void doPost(HttpServletRequest request,

			HttpServletResponse response) 

                throws ServletException, IOException {

            processRequest(request,response);

	}

        

        public String PUBGServletsExample() {

            return "If you see me this worked!";



}

}