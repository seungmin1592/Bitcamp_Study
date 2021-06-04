package ch12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import ch11.FootballPlayer;

public class FootballLIst {

	public static void main(String[] args) {
		try {
			
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Football.txt"));
			
			ArrayList<FootballPlayer> list = new ArrayList<>();
			
			list.add(new FootballPlayer("손흥민",7,"대한민국",20));
			list.add(new FootballPlayer("박지성",7,"대한민국",22));
			list.add(new FootballPlayer("기성용",6,"대한민국",24));
			list.add(new FootballPlayer("이강인",20,"대한민국",25));
			list.add(new FootballPlayer("이승우",17,"대한민국",21));
			
			out.writeObject(list);
			
			out.close();
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Football.txt"));
			ArrayList<FootballPlayer> list2 = (ArrayList<FootballPlayer>) in.readObject();
			
			for(FootballPlayer FootballPlayer : list2) {
				System.out.println(FootballPlayer);
			}
			
		} catch (IOException e) {
			// TODO: handle exception
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}


