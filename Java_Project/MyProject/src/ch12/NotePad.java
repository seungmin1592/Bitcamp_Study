package ch12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class NotePad {

	public static void main(String[] args) {

		File newDir = new File("C:\\memo");
		
		if(!newDir.exists()) {
			newDir.mkdir();
		}
		
		try {
			Scanner scn = new Scanner(System.in);
			
		
			System.out.println("날짜를 입력하세요");
			String date = scn.nextLine(); 
			
			System.out.println("제목을 입력하세요");
			String title = scn.nextLine();
			
			System.out.println("메모 내용을 입력하세요");
			String content = scn.nextLine();
			
			
			BufferedWriter write = new BufferedWriter(new FileWriter("C:\\memo\\" + date + "-" + title + ".txt"));
			
			write.write("날짜는 : " + date);
			write.newLine();
			write.write("제목은 : " + title);
			write.newLine();
			write.write("메모 내용은 : " + content);
			write.close();
			
			
			while(true) {
				System.out.println("===========================");
				System.out.println("메모리스트를 확인하시려면 0을 입력하세요");
				System.out.println("종료는 1을 입력하세요");
				int chk = scn.nextInt();
				
				if(chk == 0) {
					File myDir = new File("C:\\memo\\");
					File[] list = myDir.listFiles();
					int i = 0;
					for(i = 0; i<list.length; i++) {
						System.out.println(i + ". " + list[i].getName());
					}
					
					System.out.println("내용을 읽을 파일번호을 입력하세요");
					int getNum = scn.nextInt();
					i = getNum;
	
					BufferedReader read = new BufferedReader(new FileReader("C:\\memo\\" + list[i].getName()));
					
					String str = null;
					
					while(true) {
						str = read.readLine();
						if(str == null) {
							break;
						}
						System.out.println(str);
					}
				} else { 
					break;
				}
			}
			
			
		} catch (Exception e) {
			
		}

	}

}
