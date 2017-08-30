package Chapter5;
/*
 * 파일이름: ForInFor.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 30일
 * 목    적: Study Java Language
 */
public class ForInFor {

	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {   // 밖의 for문
			System.out.println("--------------------");
			for(int j = 0; j < 3; j++) {   // 안의 for문
				System.out.print("[" + i + ", " + j + "] ");
			}
			System.out.println('\n');
		}
	}

}
