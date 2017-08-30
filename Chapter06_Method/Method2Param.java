package Chapter6;
/*
 * 파일이름: Method2Param.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 30일
 * 목    적: Study Java Language
 */
public class Method2Param {

	public static void main(String[] args) {
		double myHeight = 175.9;
		hiEveryone(12, 12.5);  // 인자 12와 12.5의 전달
		hiEveryone(13, myHeight);  // 인자 12와 변수 myHeight에 저장된 값 전달
		byEveryone();  // 전달하는 인자 없음
	}
	
	public static void hiEveryone(int age, double height) {
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("저의 키는 " + height + "cm 입니다.");
	}
	
	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}

}
