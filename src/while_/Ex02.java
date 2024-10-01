package while_;

public class Ex02 {
	public static void main(String[] args) {
		int i = 0;
		while( true ) {
			if ( i ==3 ) {
				break;
			}
			System.out.println(i++);
		}
		System.out.println("다음 문장들 실행!!!");
		
		
		for(;true;) {
			System.out.println("for : "+i++);
			if (i==10) {
				break;
			}
		}
		System.out.println("다음 문장!!!");
	
	
	
}
	}