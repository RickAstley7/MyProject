package Chapter5;
/*
 * 파일이름: BreakBasic.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 30일
 * 목    적: Study Java Language
 */
public class BreakBasic {

	public static void main(String[] args) {
		int num = 1;
		boolean search = false;
		
		// 5와 7의 최소 공배수를 찾는 반복문
		while(num < 100) {
			if((num % 5 == 0) && (num % 7 ==0)) {
				search = true;
				break;    // while 문을 탈출
			}
			num++;
		}
		
		if(search)
			System.out.println("5와 7의 최소 공배수 : " + num);
		else
			System.out.println("5와 7의 최수 공배수를 찾지 못했습니다.");
	}

}
