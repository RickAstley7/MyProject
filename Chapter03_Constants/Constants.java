/*
 * 파일이름: Constants.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 29일
 * 목    적: Study Java Language
 */

public class Constants {

	public static void main(String[] args) {
		final int MAX_SIZE = 100; // 상수의 표현은 대문자로 한다
		final char CONST_CHAR = '상'; // 문자도 상수로 받을 수 있다
		final int CONST_ASSIGNED;
		
		CONST_ASSIGNED = 12; // 할당하지 않았던 상수의 값 할당
		System.out.println("상수1 : " + MAX_SIZE);
		System.out.println("상수2 : " + CONST_CHAR);
		System.out.println("상수3 : " + CONST_ASSIGNED);
	}

}
