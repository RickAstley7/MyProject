package Chapter5;
/*
 * 파일이름: DoWhileBasic.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 30일
 * 목    적: Study Java Language
 */
public class DoWhileBasic {

	public static void main(String[] args) {
		int num = 0;
		
		do {
			System.out.println("I like Java " + num);
			num++;
		} while(num < 5);
	}

}
