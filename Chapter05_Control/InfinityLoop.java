package Chapter5;
/*
 * 파일이름: InfinityLoop.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 30일
 * 목    적: Study Java Language
 */
public class InfinityLoop {

	public static void main(String[] args) {
		int num = 1;
		
		// 6과 7의 최소 공배수 구하는 프로그램
		while(true) {
			if(((num % 6) == 0) && ((num % 14) == 0))
				break;
			num++;
		}
		System.out.println(num);
	}

}
