package lecture;

public class CircleTest { 
	
	static void increase(Circle circle) {
		circle.radius++;
	}
	//��ü�� �Ҵ��ϸ� ���۷��� ����, �⺻Ÿ���� ������ ����
	public static void main(String[] args) {
		Circle pizza = new Circle(); //��ü ���� (memory) heap
		pizza.name="��������";
		pizza.radius=20;
		double area = pizza.getArea();
		System.out.println("������ �̸���"+ pizza.name +"�̰� �������� " + pizza.radius+"�̰� ������ " + area +"�̴�");
		
		increase(pizza);
		System.out.println(pizza.radius);
		
		
		Circle donut = new Circle();
		donut.name = "��Ų";
		donut.radius=10;
		double area02 = donut.getArea();
		System.out.println("������ �̸���"+ donut.name +"�̰� �������� " + donut.radius+"�̰� ������ " + area02 +"�̴�");
		
		
		Circle02 circle02 = new Circle02();
		circle02.radius = 20;
		double area03 = circle02.getArea();
		System.out.println(area03);
		
		Circle02 circle03 = new Circle02(50,"����");
		double area04 = circle03.getArea();
		System.out.println(area04+"==="+circle03.name);
		
		
		Circle won;
		won = pizza;
		won.name = "���׶��";
		System.out.println(won.name+"==="+pizza.name);
		
		Circle circleArray[] = new Circle [5];
		for(int i=0;i<5;i++) {
			circleArray[i] = new Circle(i+1);
		}
		System.out.println(circleArray[1].getArea());
	}

}
