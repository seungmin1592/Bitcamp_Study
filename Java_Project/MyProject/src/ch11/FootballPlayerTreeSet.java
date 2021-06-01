package ch11;

import java.util.*;


public class FootballPlayerTreeSet {

	public static void main(String[] args) {
		HashSet<FootballPlayer> set = new HashSet<FootballPlayer>();
		
		set.add(new FootballPlayer("손흥민",7,"대한민국",20));
		set.add(new FootballPlayer("기성용",16,"대한민국",23));
		set.add(new FootballPlayer("박지성",7,"대한민국",21));
		set.add(new FootballPlayer("박지성",10,"대한민국",21));
		
		Iterator<FootballPlayer> itr = set.iterator();
		while(itr.hasNext()) {
		//	itr.next().showData();
		}
		
		
	}
	
}
