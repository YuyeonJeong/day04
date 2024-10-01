package other_quiz;

import java.util.Scanner;

public class Quiz02_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int money = 0;
		int sum = 0;
		int menu ;
		while(true) {
		System.out.println("------------Menu------------");
		System.out.println("1. 콜라 / 300");
		System.out.println("2. 사이다 / 300");
		System.out.println("3. 커피 / 200");
		System.out.println("4. 돈 넣기");
		System.out.println("5. 잔돈 반환");
		System.out.println("6. 종료");
		System.out.println("------------------------");
		
		System.out.println("현재금액 : "+money);
		System.out.print("메뉴선택 : ");
		switch (menu) {
		case 4 : System.out.print("돈을 넣어주세요 : ");
			money = input.nextInt();
			break;
		case 1 : System.out.println("콜라 맛있게 드세요");
		
		
		}
		
		menu = input.nextInt();
	}

}
}
