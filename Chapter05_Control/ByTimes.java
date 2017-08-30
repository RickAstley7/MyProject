package Chapter5;
/*
 * 파일이름: ByTimes.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 30일
 * 목    적: Study Java Language
 */
public class ByTimes {

	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {  // 2단 부터 9단 까지 반복한다
			for(int j = 1; j < 10; j++)  // 1부터 9까지 곱을 한다
				System.out.println(i + " X " + j + " = " + (i * j));
		}
	}

}
