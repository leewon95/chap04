package lecture;


//���� ������  class, field(�Ӽ�), method���� ���� �� �ִ�.
public class MethodOverloadingTest {
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		int sum01 = mo.getSum(10, 10);
		System.out.println(sum01);
		int sum02 = mo.getSum(100, 200, 300);
		System.out.println(sum02);
		double sum03 = mo.getSum(10.5, 11.4);
		System.out.println(sum03);
		Circle aa = new Circle();
		Circle bb = new Circle();
		bb = aa; //��ü�� �Ҵ��̳� null�� �������� �ȴ�.
		//bb�� ��� �Ǵ� ������ �÷����� ���� ����� �ȴ�.
		// !! ���� ����� �Ǵ� ���� ��� ��������� �ʴ´�.
		System.gc();//�������� ȣ��
	}

}
