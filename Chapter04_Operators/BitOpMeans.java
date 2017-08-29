/*
 * 파일이름: ArithOp.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 29일
 * 목    적: Study Java Language
 */

public class BitOpMeans {

	public static void main(String[] args) {
		byte n1 = 13;
		byte n2 = 7;
		byte n3 = (byte)(n1 & n2); // 비트 연산 &의 결과는 int형
		System.out.println(n3);
	}
	
}
