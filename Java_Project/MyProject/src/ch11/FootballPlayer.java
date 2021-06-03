package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class FootballPlayer implements Comparable<FootballPlayer>{
	private String name;
	private int number;
	private String team;
	private int age;
	
	public FootballPlayer(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "FootballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean chk = false;
		if(obj != null && obj instanceof FootballPlayer) {
			FootballPlayer player = (FootballPlayer) obj;
			if(this.team.equals(player.team) && this.name.equals(player.name) && this.age == player.age) {
				chk = true;
			}
		}
			
		return chk;
	}
	
	@Override
	public int hashCode() {
		return age % 10; 
		
	}
	
	
	@Override
	public int compareTo(FootballPlayer o) {
		int result = this.team.compareTo(o.getTeam()); // 음수 / 양수 / 0
		if(result == 0 ) {
			result = this.name.compareTo(o.getName());
			if(result == 0) {
				result = this.number-o.getNumber();
			}
		}
		
		return result;
	}

	


	public static void main(String[] args) {

		// 1번 문제
		// List<FootballPlayer> players = new ArrayList<>();
		
		// 2번 문제
		// Set<FootballPlayer> players = new HashSet<FootballPlayer>();
		
		// 3번 문제 
		TreeSet<FootballPlayer> players = new TreeSet<>();
		
		
		// 데이터 저장
		players.add(new FootballPlayer("Son1", 7, "TOT", 27));
		players.add(new FootballPlayer("Park1", 7, "Man", 37));
		players.add(new FootballPlayer("Son1", 9, "TOT", 27));
		players.add(new FootballPlayer("Son2", 10, "TOT", 17));
		players.add(new FootballPlayer("Park2", 20, "Man", 31));
		players.add(new FootballPlayer("Park2", 21, "Man", 30));
		
		
		System.out.println("요소의 갯수 : " + players.size());
		
		// 정렬
		Iterator<FootballPlayer> itr = players.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// 4번 문제
		HashMap<Integer, FootballPlayer> players2 = new HashMap<>();
		
		players2.put(7, new FootballPlayer("Son1", 7, "TOT", 27));
		players2.put(10, new FootballPlayer("Kane", 10, "TOT", 26));
		players2.put(20, new FootballPlayer("Kane2", 20, "TOT", 16));
		
		System.out.println("------------------");
		
		Set<Integer> set = players2.keySet();
		
		Iterator<Integer> itr2 = set.iterator();
		while(itr2.hasNext()) {
			System.out.println(players2.get(itr2.next()));
		}
	}

	
}
