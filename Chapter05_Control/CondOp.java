package Chapter5;
/*
 * 파일이름: CondOp.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 30일
 * 목    적: Study Java Language
 */
public class CondOp {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 100;
		int big;
		int diff;
		
		big = (num1 > num2) ? num1 : num2;
		System.out.println("큰 수: " + big);
		
		diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		System.out.println("절댓값: " + diff); // 두 수의 거리를 구한다고 보면 된다.
	}

}
