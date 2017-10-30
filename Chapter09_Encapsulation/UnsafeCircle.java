package Chapter9;
/*
 * 파일이름: UnsafeCircle.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 10월 30일
 * 목    적: Study Java Language
 */
class Circle {
	double rad = 0;  // 원의 반지름
	final double PI = 3.14;
	
	public Circle(double r) {
		setRad(r);        // 아래에 정의된 setRad 메소드 호출을 통한 초기화
	}
	public void setRad(double r) {
		if(r < 0) {     // 반지름은 0보다 작을 수 없다
			rad = 0;
			return;     // 메소드를 빠져 나감
		}
		rad = r;
	}
	public double getArea() {
		return (rad * rad) * PI;   // 원의 넓이 반환
	}
}

public class UnsafeCircle {
	public static void main(String[] args) {
		Circle circle = new Circle(1.5);
		System.out.println(circle.getArea());
		
		circle.setRad(2.5);
		System.out.println(circle.getArea());
		circle.setRad(-3.3);
		System.out.println(circle.getArea());
		circle.rad = -4.5;  // 옳지 않은 접근 방법, 그리고 문제가 되는 부분
		System.out.println(circle.getArea());
	}
}
