package while_;

import java.util.Scanner;

public class Ex02_02_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		while (true) {
			System.out.println("1.입력");
			System.out.println("2.종료");
			num = input.nextInt();
			switch (num) {
			case 1 : 
				System.out.println("입력 기능입니다");break;
			case 2 :
				System.out.println("종료합니다!!!");
	}
			System.out.println("밖에 문장!!!");
	}

}
}
