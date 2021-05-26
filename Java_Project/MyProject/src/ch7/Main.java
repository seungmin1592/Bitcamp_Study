package ch7;

public class Main {
	public static void main(String[] args) {
		Male male = new Male("홍길동", "970324-0000000");
		Female female = new Female("홍길순", "950154-000000");
		
		male.Hello();
		female.Hello();
	}

}
