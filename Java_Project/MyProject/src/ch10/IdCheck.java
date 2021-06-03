package ch10;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class IdCheck {

	public static void main(String[] args) {
		try {
			System.out.println("아이디를 입력해주세요 : ");
			Scanner scanner = new Scanner(System.in);
			String id = scanner.nextLine();
			
			for(int i=0; i<id.length(); i++) {
				char idChar = id.charAt(i);
				if(!((idChar >= 'a' && idChar <= 'z') || (idChar >= 'A' && idChar <= 'Z') || (idChar >= '0' && idChar <= '9'))) {
					BadIdInputException e= new BadIdInputException("비정상적인 아이디입니다.");
					throw e;
				}
			}
			System.out.println("아이디 : " + id);
			
		} catch (BadIdInputException e) {
			System.out.println(e.getMessage());
		}

	}

}
