package lecture;

public class Circle02 {
	int radius;
	String name;
	
	//constructor === ������
	//�����ڴ� ���� Ÿ���� ����
	//�������Լ�(�޼���� �̸��� ���ƾ� �Ѵ�.)
	//������ �ۼ��� �����ϴ�.(�����ε�)
	//new�� ���� ��ü�� ������ �� �� �� ȣ��
	//���� ���� ������ �����Ϸ��� �ڵ����� �ϳ� ���� ���� �ִ´�.(default ������)
	public Circle02() {
		radius = 1;
	}
	
	public Circle02(int r, String n) {
		radius = r;
		name = n;
	}
	public double getArea() {
		return radius*radius*3.14;
	}
}
