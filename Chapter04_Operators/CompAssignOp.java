/*
 * 파일이름: CompAssignOp.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 29일
 * 목    적: Study Java Language
 */

public class CompAssignOp {

	public static void main(String[] args) {
		short num = 10;
		num = (short)(num + 77L); // 형 변환 안하면 컴파일 오류 발생
		int rate = 3;
		rate = (int)(rate * 3.5); // 형 변환 안하면 컴파일 오류 발생
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num +=77L;   // 형 변환이 필요하지 않는다
		rate = 3;    // 형 변환이 필요하지 않는다
 		rate *= 3.5;
		System.out.println(num);
		System.out.println(rate);
	}

}
