package Chapter6;
/*
 * 파일이름: MethodDef.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 30일
 * 목    적: Study Java Language
 */
public class MethodDef {

	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		hiEveryone(12);   // 12를 전달하며 hiEveryone 호출
		hiEveryone(13);   // 13를 전달하며 hiEveryone 호출
		System.out.println("프로그램의 끝");
	}
	
	public static void hiEveryone(int age) {
		System.out.println("좋은 아침입니다.");
		System.out.println("제 나이는 " + age + "세 입니다.");
	}

}
