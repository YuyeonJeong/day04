package other_quiz;

import java.util.Scanner;

public class Quiz01_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name = null;
		int phone = 0;
		
		while(true) {
		System.out.println("1. 연락처");
		System.out.println("2. 연락처 등록");
		System.out.println("3. 종료");
		
		int num = input.nextInt();
		
		
		switch (num) {
		case 2 : 

			
			System.out.println("이름 입력 : ");
			name = input.next();			
			System.out.println("전화번호 입력 : ");
			phone = input.nextInt();
			break;
			
		case 1 :
			System.out.println("이름 : "+name);
			System.out.println("전화번호 : "+phone);
			for (int i = 0; i <=5 ; i++) {
				
			}
		break;
		
		}
		
	}

}
}
