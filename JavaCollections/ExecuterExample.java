package CIT360;

 

import java.util.ArrayList;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

 

/**

 * 

 * @author boshy

 *

 */

public class BlakeExecutorExample {

 

    // Run threads

    public static void main(String[] args)  {

        

        ArrayList<String> players = new ArrayList<>(); 

   // Declare values of players  

players.add("Player1");

players.add("Player2");

players.add("Player3");

players.add("Player4");

players.add("Player5");

players.add("Player6");

players.add("Player7");

players.add("Player8");

players.add("Player9");

players.add("Player10");

players.add("Player11");

players.add("Player12");

players.add("Player13");

players.add("Player14");

players.add("Player15");

players.add("Player16");

players.add("Player17");

players.add("Player18");

players.add("Player19");

players.add("Player20");

players.add("Player21");

players.add("Player22");

players.add("Player23");

players.add("Player24");

players.add("Player25");

players.add("Player26");

players.add("Player27");

players.add("Player28");

players.add("Player29");

players.add("Player30");

players.add("Player31");

players.add("Player32");

players.add("Player33");

players.add("Player34");

players.add("Player35");

players.add("Player36");

players.add("Player37");

players.add("Player38");

players.add("Player39");

players.add("Player40");

players.add("Player41");

players.add("Player42");

players.add("Player43");

players.add("Player44");

players.add("Player45");

players.add("Player46");

players.add("Player47");

players.add("Player48");

players.add("Player49");

players.add("Player50");

players.add("Player51");

players.add("Player52");

players.add("Player53");

players.add("Player54");

players.add("Player55");

players.add("Player56");

players.add("Player57");

players.add("Player58");

players.add("Player59");

players.add("Player60");

players.add("Player61");

players.add("Player62");

players.add("Player63");

players.add("Player64");

players.add("Player65");

players.add("Player66");

players.add("Player67");

players.add("Player68");

players.add("Player69");

players.add("Player70");

players.add("Player71");

players.add("Player72");

players.add("Player73");

players.add("Player74");

players.add("Player75");

players.add("Player76");

players.add("Player77");

players.add("Player78");

players.add("Player79");

players.add("Player80");

players.add("Player81");

players.add("Player82");

players.add("Player83");

players.add("Player84");

players.add("Player85");

players.add("Player86");

players.add("Player87");

players.add("Player88");

players.add("Player89");

players.add("Player90");

players.add("Player91");

players.add("Player92");

players.add("Player93");

players.add("Player94");

players.add("Player95");

players.add("Player96");

players.add("Player97");

players.add("Player98");

players.add("Player99");

players.add("Player100");

      

         

        // This executor can execute up to 5 times

        ExecutorService executor = Executors.newFixedThreadPool(5);

         

        for (int i=0; i < players.size(); i++) {

            Runnable thread = new Runnable() {

       // Prints out players entering game and match ending.

                public void run() {

                    System.out.println("Loading Instance");

                    for (int i=0; i < 100; i++) {

                        

                        System.out.println(players.get(i) + " has joined the game.");

                        

                        

                    }

                    System.out.println();

                    System.out.println("Match Beginning");

                    System.out.println();

                    System.out.println("Winner winner chicken dinner!");

                }};

                 

             

            executor.execute(thread);

             

        }

         

        // This shuts down acceptance of more threads

        executor.shutdown();

         

        // This will wait for all the treads to finish

        while(!executor.isTerminated()) {

            try {

                Thread.sleep(100);

                 

            } catch (InterruptedException interrupt) {

                interrupt.printStackTrace();

            }

        }

        System.out.println();

        System.out.println("Process Complete");

         

    }

     

}