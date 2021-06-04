package ch9;

public class Person {
	String name;
	String personNumber;
	
	public Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}
	@Override
	public boolean equals(Object obj) {
		boolean chk = false;
		
		if((obj != null) && (obj instanceof Person)) {
			Person p = (Person)obj;
			chk = this.personNumber.equals(p.getPersonNumber());
		}
		return chk;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPersonNumber() {
		return personNumber;
	}
	public void setPersonNumber(String personNumber) {
		this.personNumber = personNumber;
	}
	
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", "12345");
		Person p2 = new Person("이순신", "12345");
		
		if(p1.equals(p2)) {
			System.out.println("같음");
		} else { 
			System.out.println("다름");
		}
	}

}
