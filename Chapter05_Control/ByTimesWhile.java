package Chapter5;
/*
 * 파일이름: ByTimesWhile.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 30일
 * 목    적: Study Java Language
 */
public class ByTimesWhile {

	public static void main(String[] args) {
		int i = 2;
		int j;
		
		while(i < 10) {
			j = 1;
			while(j < 10) {
				System.out.println(i + " X " + j + " = " + (i * j));
				j++;
			}
			i++;
		}
	}

}
