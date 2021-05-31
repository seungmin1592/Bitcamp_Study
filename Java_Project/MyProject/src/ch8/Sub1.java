package ch8;

// Calulator 인터페이스를 상속하는 추상 클래스를 정의해봅시다.
public abstract class Sub1 implements Calculator {
	public long add(long n1, long n2) { return n1 + n2;};
	public long substract (long n1, long n2) { return n1 - n2; };
	public long multiply(long n1, long n2) {return n1 * n2;};
}
