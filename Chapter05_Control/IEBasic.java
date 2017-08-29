package Chapter5;
/*
 * 파일이름: ArithOp.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 29일
 * 목    적: Study Java Language
 */
public class IEBasic {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 7;
		
		// if문
		if(n1 < n2) {
			System.out.println("n1 < n2 is true");
		}
		
		// if ~ else 문
		if(n1 == n2) {
			System.out.println("n1 == n2 is true");
		}
		else {
			System.out.println("n1 == n2 is false");
		}
	}

}
