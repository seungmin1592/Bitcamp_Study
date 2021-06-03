 package ch8;

// 다형성의 특징으로 상위 타입인 인터페이스 타입의 참조변수에 인터페이스를 구현한 클래스 타입의 인스턴스를 참조하는 코드를 작성해 봅시다.

public class Main {
	public static void main(String[] args) {
		Calculator c = new Sub2();
		
		System.out.println(c.add(4, 5));
		System.out.println(c.substract(4, 5));
		System.out.println(c.multiply(4, 5));
		System.out.println(c.divide(4, 5));
	}

	
	
}




