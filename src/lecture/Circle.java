package lecture;

public class Circle {
	int radius; // 속성, properties, field, member field  
	String name;
	
	public Circle() {
		//생성자 함수
		System.out.println("원이 생성되었습니다.");
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return radius*radius*3.14;
	}
	public void increase() {
		
	}
	
//	public static void main(String[] args) {
//		Circle pizza = new Circle(); //객체 생성 (memory) heap
//		pizza.name="새우피자";
//		pizza.radius=20;
//		double area = pizza.getArea();
//		System.out.println("피자의 이름은"+ pizza.name +"이고 반지름은 " + pizza.radius+"이고 면적은 " + area +"이다");
//		
//		Circle donut = new Circle();
//		donut.name = "던킨";
//		donut.radius=10;
//		double area02 = donut.getArea();
//		System.out.println("도넛의 이름은"+ donut.name +"이고 반지름은 " + donut.radius+"이고 면적은 " + area02 +"이다");
//	}
}
