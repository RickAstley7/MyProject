package Chapter8;
/*
 * 파일이름: Circle.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 10월 30일
 * 목    적: Study Java Language
 */
public class Circle {  // 원의 넓이 반환
	double rad;
	final double PI;
	
	public Circle(double r) {
		rad = r;
		PI = 3.14;
	}
	public double getArea() {
		return (rad * rad) * PI;    // 원의 넓이 반환	
	}
}
