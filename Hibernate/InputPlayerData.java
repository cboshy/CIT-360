

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;



/**

 *

 * @author boshy

 */

 

public class InputPlayerData {



    public static void main(String[] args) {



        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        Transaction transaction = session.beginTransaction();



        Player addPlayer = new Player();

        addPlayer.setPlayerfn("boshy");

        addPlayer.setPlayerln("Turley");

        addPlayer.setPlayerun("GreatGoldenBaby");

        addPlayer.setPlayeremail("boshy@boshy.com");



        session.save(addPlayer);

        transaction.commit();



        System.out.println("Items successfully added.");



    }

}