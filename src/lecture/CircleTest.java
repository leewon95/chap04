package lecture;

public class CircleTest { 
	
	static void increase(Circle circle) {
		circle.radius++;
	}
	//객체를 할당하면 레퍼런스 참조, 기본타입의 변수는 복사
	public static void main(String[] args) {
		Circle pizza = new Circle(); //객체 생성 (memory) heap
		pizza.name="새우피자";
		pizza.radius=20;
		double area = pizza.getArea();
		System.out.println("피자의 이름은"+ pizza.name +"이고 반지름은 " + pizza.radius+"이고 면적은 " + area +"이다");
		
		increase(pizza);
		System.out.println(pizza.radius);
		
		
		Circle donut = new Circle();
		donut.name = "던킨";
		donut.radius=10;
		double area02 = donut.getArea();
		System.out.println("도넛의 이름은"+ donut.name +"이고 반지름은 " + donut.radius+"이고 면적은 " + area02 +"이다");
		
		
		Circle02 circle02 = new Circle02();
		circle02.radius = 20;
		double area03 = circle02.getArea();
		System.out.println(area03);
		
		Circle02 circle03 = new Circle02(50,"바퀴");
		double area04 = circle03.getArea();
		System.out.println(area04+"==="+circle03.name);
		
		
		Circle won;
		won = pizza;
		won.name = "동그라미";
		System.out.println(won.name+"==="+pizza.name);
		
		Circle circleArray[] = new Circle [5];
		for(int i=0;i<5;i++) {
			circleArray[i] = new Circle(i+1);
		}
		System.out.println(circleArray[1].getArea());
	}

}
