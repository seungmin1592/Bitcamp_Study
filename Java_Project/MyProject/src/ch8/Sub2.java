package ch8;

// Calulator 인터페이스를 상속하는 인스턴스를 생성할 수 있는 클래스를 정의해봅시다.
public class Sub2 extends Sub1 implements Calculator {
	public long add(long n1, long n2) { return n1 + n2;};
	public long substract (long n1, long n2) { return n1 - n2; };
	public long multiply(long n1, long n2) {return n1 * n2;};
	public double divide(double n1, double n2) { return n1 / n2;};
}
