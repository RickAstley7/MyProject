package Chapter9;
/*
 * 파일이름: InfoHideCircle.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 10월 30일
 * 목    적: Study Java Language
 */
class Circle2 {
	private double rad = 0;
	final double PI = 3.14;
	
	public Circle2(double r) {
		setRad(r);
	}
	public void setRad(double r) {
		if(r < 0) {
			rad = 0;
			return;
		}
		rad = r;
	}
	public double getRad() {
		return rad;
	}
	public double getArea() {
		return (rad * rad) * PI;  // 원의 넓이 반환
	}
}

public class InfoHideCircle {
	public static void main(String[] args) {
		Circle2 circle = new Circle2(1.5);
		System.out.println("반지름: " + circle.getRad());
		System.out.println("넓 이: " + circle.getArea() + "\n");
		
		circle.setRad(3.4);
		System.out.println("반지름: " + circle.getRad());
		System.out.println("넓 이: " + circle.getArea());
	}
}
