package Chapter5;
/*
 * 파일이름: SwitchBasic.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 30일
 * 목    적: Study Java Language
 */
public class SwitchBasic {

	public static void main(String[] args) {
		int n = 3;
		
		switch(n) {
		case 1:
			System.out.println("Simple Java");
		case 2:
			System.out.println("Funny Java");
		case 3:
			System.out.println("Fantastic Java");
		default:
			System.out.println("The best programing language");
		}
		
		System.out.println("Do you like Java?");
	}

}
