package lecture;

public class Circle {
	int radius; // �Ӽ�, properties, field, member field  
	String name;
	
	public Circle() {
		//������ �Լ�
		System.out.println("���� �����Ǿ����ϴ�.");
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
//		Circle pizza = new Circle(); //��ü ���� (memory) heap
//		pizza.name="��������";
//		pizza.radius=20;
//		double area = pizza.getArea();
//		System.out.println("������ �̸���"+ pizza.name +"�̰� �������� " + pizza.radius+"�̰� ������ " + area +"�̴�");
//		
//		Circle donut = new Circle();
//		donut.name = "��Ų";
//		donut.radius=10;
//		double area02 = donut.getArea();
//		System.out.println("������ �̸���"+ donut.name +"�̰� �������� " + donut.radius+"�̰� ������ " + area02 +"�̴�");
//	}
}
