package Chapter5;
/*
 * 파일이름: BreakPoint.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 30일
 * 목    적: Study Java Language
 */
public class BreakPoint {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if((i * j) == 72) {
					System.out.println(i + " X " + j + " = " + (i * j));
					break;
				}
			}
		}
	}

}
