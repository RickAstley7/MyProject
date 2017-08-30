package Chapter5;
/*
 * 파일이름: ContinueBasic.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 30일
 * 목    적: Study Java Language
 */
public class ContinueBasic {

	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		
		while((num++) < 100) {
			if(((num % 5) != 0) || ((num % 7) != 0))
				continue;    // 5와 7의 배수가 아니라면 조건검사로 이동
			count++;  // 5와 7의 배수일 경우 count 값 1 증가
			System.out.println(num);  // 5와 7의 배수일 경우 출력
		}
		System.out.println("conut: " + count);
	}

}
