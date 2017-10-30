package Chapter8;

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
