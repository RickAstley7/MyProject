package Chapter5;
/*
 * 파일이름: LabeledBreakPoint.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 30일
 * 목    적: Study Java Language
 */
public class LabeledBreakPoint {

	public static void main(String[] args) {
outer:	for(int i = 1; i < 10; i++) {   // 바깥쪽 for문에 레이블 outer 명시! 
			for(int j = 1; j < 10; j++) {
				if((i * j) == 72) {
					System.out.println(i + " X " + j + " = " + (i * j));
					break outer;  // outer로 명시된 반복문까지 빠져나간다.
				}
			}
		}
	}

}
