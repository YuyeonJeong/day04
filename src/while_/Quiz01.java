package while_;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String id1 = null, password1 = null;
		String id2 = null, password2 = null;
		
		while ( true ) {
		System.out.println("1.로그인\n2.회원가입\n3.나가기\n>>>");
		
		int num = input.nextInt();
		switch (num) {
		case 1 : System.out.println("아이디 입력 : \n비밀번호 입력 :");
			id2 = input.next();
			password2 = input.next();
			if ( id2 == null || password2 == null) {
				System.out.println("인증 실패!!!");
			}
			
			if ( id2.equals(id1) ){
				System.out.println("로그인 완료!!!");
				
				}else
				System.out.println("인증 실패!!!");	
			
			
				}if ( password2.equals(password1) ){
					System.out.println("로그인 완료!!!");
				}else
				System.out.println("인증 실패!!!");
			break;
			
		case 2 : System.out.println("저장할 아이디 입력 : \n저장할 비밀번호 입력 : ");
			id1 = input.next();
			password1 = input.next();
			System.out.println("가입완료!!!");
			break;
		}
		}
	}
}
			
		//if (num == 3) {
			//break;
		//}
			

