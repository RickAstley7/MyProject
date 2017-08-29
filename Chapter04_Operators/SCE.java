/*
 * 파일이름: SCE.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 29일
 * 목    적: Study Java Language
 */

public class SCE {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2 + '\n'); // 줄 바꿈
		
		result = ((num1 += 10) > 0) || ((num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 - " + num2);
	}

}
