package other_quiz;

import java.util.Scanner;

public class Quiz01_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		
		while(true) {
			int grade = input.nextInt();		
			if (grade < 0 || grade > 100) {
				break;
			}
			if (grade >= 80) {
				System.out.println("축하합니다. 합격입니다.");
			}else
				System.out.println("죄송합니다. 불합격입니다.");
			
	
		
			
		}
	}

}
