package while_;

import java.util.Scanner;

public class Quiz01_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String id = null, password = null;
		String idlog = null, passwordlog = null;
		//boolean falg = true;
		
		while ( true ) {
		System.out.println("1.로그인\n2.회원가입\n3.나가기\n>>>");
		int num = input.nextInt();
		if (num == 3) {
			System.out.println("프로그램 종료합니다!!");
			break;
		}
		switch (num) {
		case 1 : System.out.println("아이디 입력 : ");
		idlog = input.next();
		System.out.println("비밀번호 입력 :");
		password = input.next();
		
		if (idlog.equals(id) && passwordlog.equals(password)){
			System.out.println("인증성공");
		}else
			System.out.println("인증실패");
		break;
		
		case 2 : System.out.println("저장할 아이디 입력 : ");
		id = input.next();
		System.out.println("저장할 비밀번호 입력 : ");
		password = input.next();
		System.out.println("가입완료!!!");
		break;
			}
		}
	}
}


// if (id.equals)