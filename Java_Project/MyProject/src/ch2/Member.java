package ch2;
public class Member {
	public static void main(String[] args) {
		
		String name = "김승민";
		int age = 25;
		double height = 150d; 
		boolean hasBook = true;
		
		System.out.println("이름은" + name +"입니다");
		System.out.println("나이는" + age +"입니다");
		System.out.println("키는" + height +"입니다");
		System.out.println("책 보유 여부 : " + hasBook);
		
		
		System.out.println("저의 이름은 " + name); // String + String
		System.out.println("키는" + height + "cm입니다."); 
		// String + double + String (String + String) + String -> String + String
		System.out.println("제 나이는 " + age + "살 입니다."); 
		System.out.println("책의 보유 여뷰 : " + hasBook);
		
		if(hasBook) {
			System.out.println("책 있어요!");
		} else { 
			System.out.println("책 없어요!");
		}
	}
}

