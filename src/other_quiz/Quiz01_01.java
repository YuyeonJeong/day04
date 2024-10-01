package other_quiz;

import java.util.Scanner;

public class Quiz01_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name = null, nameser = null;
		int grade = 0, money = 0;
		
		while (true) {
		System.out.println("1. 동아리 신규회원 등록");
		System.out.println("2. 회원 별 회비 금액 확인");
		System.out.println("3. 가입 회원 현황");
		int num = input.nextInt();
		
		switch (num) {
		case 1 : System.out.print("이름 : ");
		name = input.next();
		System.out.print("등급 : ");
		grade = input.nextInt();
		System.out.print("회비 설정 : ");
		money = input.nextInt();
		System.out.println("신규회원 등록 완료");
		break;
		
		case 2 : System.out.println("이름으로 회비 검색 : ");
		nameser = input.next();
		if (nameser.equals(name)) {
			System.out.println(nameser+"님의 회비는 "+money+"입니다");
		}else {
			System.out.println("존재하지 않는 회원입니다.");
		//continue;
		}
		
		case 3 : System.out.println("가입된 회원 목록입니다.");
				System.out.println("이름 : " +name+"등급 : "+grade+"회비 : "+money);
			break;
		
		
		
		
	}
		if (num ==3)
			break;

}
}
}
