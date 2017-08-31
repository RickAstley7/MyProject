package Chapter6;
/*
 * 파일이름: ReculFactorial.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 31일
 * 목    적: Study Java Language
 */
public class ReculFactorial {

	public static void main(String[] args) {
		System.out.println("3 factorial: " + factorial(3));
		System.out.println("12 factorial: " + factorial(12));
	}
	
	private static int factorial(int n) {
		if(n == 1)
			return 1;
		else
			return n * factorial(n-1); 
		
	}

}
