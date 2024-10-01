package other_quiz;

import java.util.Scanner;

public class Quiz02_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = null;
		System.out.println("덧셈 : +");
		System.out.println("뺄셈 : -");
		System.out.println("곱셈 : *");
		System.out.println("나눗셈 : /");
		System.out.println("종료 : x");
		System.out.println("해당되는 연산자를 입력하시오");
		
		while (true) {
			a = input.next();
		}
		
		switch (a) {
		case "+": 
			System.out.println("A+B : 덧셈");
			System.out.println("A를 입력하시오");
			int A = input.nextInt();
			System.out.println(A);
			System.out.println("B를 입력하시오");
			int B = input.nextInt();
			System.out.println(B);
			System.out.println("A+B="+(A+B));
			break;
		}
	}
}
}