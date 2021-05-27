package Test;

public class Test04 {

	public static void main(String[] args) {
		char[] abc = {'A','B','C','D'};
		char[] number = {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println(new String(abc));
		System.out.println(new String(number));
		
		char[] result = new char[abc.length + number.length];
		System.arraycopy(abc, 0, result, 0, abc.length);

	}

}
