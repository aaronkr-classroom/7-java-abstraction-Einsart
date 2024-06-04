public class Rectangle extends Shape {
	double length; // 가로
	double width; // 새로
	
	public Rectangle(String color, double length, double width) {
		super(color); // 부모 클래스의 생성자 호출
		System.out.println("Rectangle 클래스의 생성자 호출");
		this.length = length;
		this.width = width;
	}
	
	// 추상 메서드를 정의
	double area() {
		return length * width;
	}
	
	public String toString() {
		return "사각형의 색상은 " + super.getColor() +
				" 그리고 면적은 " + area();
	}
}
