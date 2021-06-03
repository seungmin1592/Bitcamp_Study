package Ex;

public class ShowThreadMain {

	public static void main(String[] args) {
		ShowThread t1 = new ShowThread("스레드1");
		ShowThread t2 = new ShowThread("          스레드2");
		
		t1.start();
		t2.start();

	}

}
