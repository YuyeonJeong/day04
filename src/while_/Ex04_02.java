package while_;

import java.util.Scanner;

public class Ex04_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name1, name2;
		System.out.println("1. 이름 입력");
		name1 = input.next();
		System.out.println("2. 이름 입력");
		name2 = input.next();
		System.out.println("n1 == n2 : "+(name1 == name2));
		System.out.println("n1.equals(n2) : " +(name1.equals(name2)));
	}

}
