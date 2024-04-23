public class Rectangle extends Shape{
	double length;
	double width;
	
	public Circle(String color, double length) {
		super(color);
		System.out.println("Circle 클래스의 생성자 호출");
		this.length = length;
		this.width = width;
	}
	
	
	double area() {
		return length * width;
		
	}
	
	public String toString() {
		return "사각형 색상은 " + super.getColor() + "그리고 면적은" + area();
	}
	
	

}
