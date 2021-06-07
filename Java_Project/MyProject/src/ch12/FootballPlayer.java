package ch12;

import java.io.Serializable;

public class FootballPlayer implements Serializable {
	private String name;
	private int num;
	private String team;
	private int age;
	
	public FootballPlayer(String name, int num, String team, int age) {
		this.name = name;
		this.num = num;
		this.team = team;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean checkResult = true;
		
		if( obj == null || getClass() != obj.getClass()) {
			checkResult = false;
		} else {
			
		}
		
		FootballPlayer other = (FootballPlayer) obj;
		
		if(age != other.age || 
					name == null ||
					team == null ||
					other.name == null ||
					other.team == null ||
					!name.equals(other.name) ||
					!name.equals(other.team)) {
				checkResult = false;
		}
		
		return checkResult;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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
		return "FootballPlayer [name" + name + ", num=" + num + ", team=" + team + ", age=" + age + "]";
	}
	
	
	
}
