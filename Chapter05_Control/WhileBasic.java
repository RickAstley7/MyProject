package Chapter5;
/*
 * 파일이름: WhileBasic.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 30일
 * 목    적: Study Java Language
 */
public class WhileBasic {

	public static void main(String[] args) {
		int num = 0;
		
		while(num < 5) {  // num < 5 를 만족하면 반복 실행
			System.out.println("I like Java " + num);
			num++;
		}
	}

}
