package test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Players;
import pojo.Team;
public class OnetoOneClientApp1 {

	public static void main(String[] args) {
		  Configuration config=new Configuration();
		  config.configure("resource/hibernate.cfg.xml");
		  SessionFactory sf = config.buildSessionFactory();
		  Session s=sf.openSession(); 
		  Transaction tx=s.beginTransaction();
		  
		  Players p1 =new Players();
		  p1.setPid(1);
		  p1.setPname("Virat");
		  p1.setAge(36);
		  
		  
		  Players p2 =new Players();
		  p2.setPid(2);
		  p2.setPname("Dhoni");
		  p2.setAge(42);
		  
		  Players p3 =new Players();
		  p3.setPid(3);
		  p3.setPname("Rohit");
		  p3.setAge(40);
		  
		  Set <Players> players = new HashSet<Players>();
		  players.add(p1);
		  players.add(p2);
		  players.add(p3);
		  
		  Team india =  new Team();
		  india.setTid(111);
		  india.setTname("Bhartiya Team");
		  india.setPlayes(players);
		  s.save(india);
		  
		  Players p4 =new Players();
		  p4.setPid(4);
		  p4.setPname("Babar");
		  p4.setAge(40);
		  
		  Players p5 =new Players();
		  p5.setPid(5);
		  p5.setPname("Afridi");
		  p5.setAge(41);
		  
		  Set <Players> pakplayers = new HashSet<Players>();
		  pakplayers.add(p4);
		  pakplayers.add(p5);
		  
		  Team pakiTeam = new Team();
		  pakiTeam.setTid(222);
		  pakiTeam.setTname("Pakistan Team");
		  pakiTeam.setPlayes(pakplayers);
		  s.save(pakiTeam);
		  tx.commit();
		  
        System.out.println("SUCCESS");
	}

}
