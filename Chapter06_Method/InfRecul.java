package Chapter6;
/*
 * 파일이름: InfRecul.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 31일
 * 목    적: Study Java Language
 */
public class InfRecul {

	public static void main(String[] args) {
		showHi(3);
	}
	
	private static void showHi(int cnt) {
		System.out.println("Hi~");
		if(cnt == 1)
			return;
		showHi(--cnt);  // 만약 cnt--를 하게 되면 재귀가 무한 호출된다 
	}
}
