package while_;

public class Ex05 {
	public static void main(String[] args) {
		int su = 7, i = 3;
		do {
			System.out.println("do while : "+ i);
			i++;
		}while (i<su);
		
		System.out.println("----------------");
		while (i<su) {
			System.out.println("do while : "+ i);
			i++;
		}
	}

}
