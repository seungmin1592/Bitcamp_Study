package ch11;

import java.util.ArrayList;
import java.util.Iterator;


public class FootballPlayerList {

	public static void main(String[] args) {
		ArrayList<FootballPlayer> list = new ArrayList<FootballPlayer>();
		
		list.add(new FootballPlayer("손흥민",7,"대한민국",20));
		list.add(new FootballPlayer("기성용",16,"대한민국",23));
		list.add(new FootballPlayer("박지성",7,"대한민국",21));
		list.add(new FootballPlayer("박지성",10,"대한민국",21));
		
		Iterator<FootballPlayer> itr = list.iterator();
		while(itr.hasNext()) {
		//	itr.next().showData();
		}
	}
	
	

}
