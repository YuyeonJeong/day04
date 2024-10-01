package other_quiz;

import java.util.Scanner;


public class Quiz02_02_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		
		int menu=0;
		int leftmoney = 0;
		while(true) {
			
			if(menu==6)
				break;
			
			System.out.println("------------Menu------------");
			System.out.println("1. 콜라 / 300");
			System.out.println("2. 사이다 / 300");
			System.out.println("3. 커피 / 200");
			System.out.println("4. 돈 넣기");
			System.out.println("5. 잔돈 반환");
			System.out.println("6. 종료");
			System.out.println("------------------------");
			System.out.println("현재 금액 : "+leftmoney);
			System.out.print("메뉴 선택 : ");
			menu = input.nextInt();
			
			switch (menu) {
			case 4 : System.out.print("돈을 넣어주세요 : ");
			int money =input.nextInt();
			leftmoney+=money;
			break;
			
			case 1: //콜라
			if (leftmoney<300)
				System.out.println("구매 불가");
			else
				leftmoney-=300;
				System.out.println("콜라 맛있게 드세요");
			break;
			
			case 2://사이다
				if (leftmoney<300)
					System.out.println("구매 불가");
				else
					leftmoney-=300;
				System.out.println("사이다 맛있게 드세요");
				break;
				
			case 3 ://커피
				if (leftmoney<200) 
					System.out.println("구매 불가");
				else
					leftmoney-=300;
				System.out.println("커피 맛있게 드세요");
				break;
			
			case 5 : System.out.println(leftmoney+"원의 잔액이 반환됩니다");
			leftmoney = 0;
				break;
				
			case 6: System.out.println("프로그램 종료");
				break;
			
	
			
			}}
			
	}

}
